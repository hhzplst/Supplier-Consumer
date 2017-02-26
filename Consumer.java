public class Consumer implements Runnable {
  private static MeetingRoom mr;
  private int id;

  public Consumer(int id, MeetingRoom mr) {
    this.id = id;
    this.mr = mr;
  }

  public void run() {
    
  }
}