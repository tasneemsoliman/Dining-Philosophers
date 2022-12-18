package os2project;

public class Transaction implements Runnable{
    State hlp;
    Account ch, sa;
    int id;
    public Transaction(int id, Account ch, Account sa, State i) {
    this.hlp = i;
    this.ch = ch;
    this.sa = sa;
    this.id = id;
  }    
    private void active() {
        try {
          Thread.sleep(2000);
        } catch (Exception e) {
        }
      }
    
      private void inactive() {
        try {
          Thread.sleep(2000);
        } catch (Exception e) {
        }
      }
    
      public void run() {
        while (true) {
          hlp.useAccounts(id, ch, sa);
          active();
          hlp.doneWithAccounts(id, ch, sa);
          inactive();
        }
    }

    }
    
