import java.util.Random;

public class Supplier implements Runnable {
  private static MeetingRoom mr;
  private int id;
  private boolean hasRequestedStop = false;
  private static Random random = new Random();

  public Supplier(int id, MeetingRoom mr) {
    this.id = id;
    this.mr = mr;
  }

  public void run() {
    while (!hasRequestedStop) {
      try {
        int sleepTime = random.nextInt(1000) + 1;
        Thread.sleep(sleepTime);
        System.out.printf("Supplier %d sleeps %d milliseconds.\n", 
                                                  this.id, sleepTime);
        leaveData(); 
      } catch (InterruptedException e) {
        return;
      }
    }
  }

  private void leaveData() throws InterruptedException {
    int randomInt = random.nextInt() + 1;
    System.out.printf("Supplier %d produces data.\n", this.id);
    synchronized(mr) {
      System.out.printf("Supplier %d enters meeting room.\n", this.id);
      while (mr.checkIfEmpty() == false) {
          System.out.printf("Supplier %d enters waiting room.\n", this.id);
          mr.wait();    
      }
      mr.setInfo(randomInt, this.id);
      System.out.printf("Supplier %d leaves data for its consumer.\n", this.id);
      mr.notifyAll();  
    }
    System.out.printf("Supplier %d leaves meeting room.\n", this.id);
  }

  public void requestStop() {
    hasRequestedStop = true;
  }
}