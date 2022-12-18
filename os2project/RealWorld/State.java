package os2project;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class State {
    Lock mutex = new ReentrantLock();
    Condition[] cond = new Condition[5];
    String[] state = new String[5];
    int[] id = new int[5];
    TransactionsProblem app = new TransactionsProblem();
    
    public State() {
        for (int i = 0; i < 5; i++) {
            id[i] = i;
      state[i] = "Inactive";
      cond[i] = mutex.newCondition();
    }
  }

  public void setState(int id, String s) {
    state[id] = s;
  }

  public void useAccounts(int id, Account ch, Account sa) {
    mutex.lock();
    try {
      setState(id, "Pending");
      app.ZZZhide(id);
      System.out.println("Transaction " + (id+1) + " is pending");      
      while (!ch.getAvailability() || !sa.getAvailability()) {
        cond[id].await();
      }
     
      ch.setAvailability(false);
      sa.setAvailability(false);
      setState(id, "Active");
      app.changeColortoBlack(id); 
      System.out.println("Transaction " + (id+1) + " is active");      
    } catch (Exception e) {
    } 
    finally {
      mutex.unlock();
    }
  }

  public void doneWithAccounts(int id, Account ch, Account sa) {
    mutex.lock();
    setState(id, "Inactive");
    app.changeColortoNormal(id);
    app.ZZZshow(id);
    System.out.println("Transaction " + (id+1) + " is inactive");     
    ch.setAvailability(true);
    sa.setAvailability(true);
    cond[(id + 1) % 5].signalAll();
    cond[(id + 4) % 5].signalAll();
    mutex.unlock();
}
}