import java.util.Random;

public class Consumer implements Runnable {
  private static MeetingRoom mr;
  private int id;
  private boolean hasRequestedStop = false;
  private static Random random = new Random();

  public Consumer(int id, MeetingRoom mr) {
    this.id = id;
    this.mr = mr;
  }

  public void run() {
    while (!hasRequestedStop) {
      try {
        fetchData();
        int sleepTime = random.nextInt(1000) + 1;
        Thread.sleep(sleepTime);
         System.out.printf("Consumer %d sleeps %d milliseconds.\n", 
                                                  this.id, sleepTime);
      } catch (InterruptedException e) {
         return;
      }
    }   
  }

  private synchronized void fetchData() throws InterruptedException {
    synchronized(mr) {
      System.out.printf("Consumer %d enters meeting room.\n", this.id);
      if (this.id != mr.getConsumerID()) {
          System.out.printf("Consumer %d enters waiting room.\n", this.id);
          wait(); 
      }
      int data = mr.getData();
      mr.clearData();
      System.out.printf("Consumer %d removes data.\n", this.id);
      notify();
      System.out.printf("Consumer %d leaves meeting room.\n", this.id);
    }
  }

  public void requestStop() {
    hasRequestedStop = true;
  }
}