package os2project;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class State {
    Lock mutex = new ReentrantLock();
    Condition[] cond = new Condition[5];
    String[] state = new String[5];
    int[] id = new int[5];
    DiningPhilosophersProblem app = new DiningPhilosophersProblem();
    
    public State() {
        for (int i = 0; i < 5; i++) {
            id[i] = i;
      state[i] = "Thinking";
      cond[i] = mutex.newCondition();
    }
  }

  public void setState(int id, String s) {
    state[id] = s;
  }

  public void grabChopsticks(int id, Chopstick l, Chopstick r) {
    mutex.lock();
    try {
      setState(id, "Hungry");
      app.ZZZhide(id);
      System.out.println("Philosopher " + (id+1) + " is hungry");      
      while (!l.getAvailability() || !r.getAvailability()) {
        cond[id].await();
      }
     
      l.setAvailability(false);
      r.setAvailability(false);
      setState(id, "Eats");
      app.changeColortoBlack(id); 
      System.out.println("Philosopher " + (id+1) + " is eating");      
    } catch (Exception e) {
    } 
    finally {
      mutex.unlock();
    }
  }

  public void releaseChopsticks(int id, Chopstick l, Chopstick r) {
    mutex.lock();
    setState(id, "Thinking");
    app.changeColortoNormal(id);
    app.ZZZshow(id);
    System.out.println("Philosopher " + (id+1) + " is thinking");     
    l.setAvailability(true);
    r.setAvailability(true);
    cond[(id + 1) % 5].signalAll();
    cond[(id + 4) % 5].signalAll();
    mutex.unlock();
}
}