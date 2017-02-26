public class Supplier implements Runnable {
  private static MeetingRoom mr;
  private int id;
  private boolean hasRequestedStop = false;

  public Supplier(int id, MeetingRoom mr) {
    this.id = id;
    this.mr = mr;
  }

  public void run() {
    while (!hasRequestedStop) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        //do something
      }
      int randomInt = Random.nextInt();
      synchronized(this) {
        while (mr.checkIfConsumed() == false) {
          wait();
        }
        mr.setInfo(randomInt, this.id);
      }
    }
  }

  public void requestStop() {
    hasRequestedStop = true;
  }
}