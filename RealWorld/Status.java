package os2project;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Status {
    Lock mutex = new ReentrantLock();
    Condition[] cond = new Condition[5];
    String[] status = new String[5];
    int[] id = new int[5];
    TransactionsProblem app = new TransactionsProblem();
    
    public Status() {
        for (int i = 0; i < 5; i++) {
            id[i] = i;
      status[i] = "Inactive";
      cond[i] = mutex.newCondition();
    }
  }

  public void setstatus(int id, String s) {
    status[id] = s;
  }

  public void useAccounts(int id, Account ch, Account sa) {
    mutex.lock();
    try {
      setstatus(id, "Pending");
      app.ZZZhide(id);
      System.out.println("Transaction " + (id+1) + " is pending");      
      while (!ch.getAvailability() || !sa.getAvailability()) {
        cond[id].await();
      }
     
      ch.setAvailability(false);
      sa.setAvailability(false);
      setstatus(id, "Active");
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
    setstatus(id, "Inactive");
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