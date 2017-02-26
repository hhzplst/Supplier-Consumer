public class MeetingRoom {
  private volatile int data;
  private volatile int consumerID;
  private volatile boolean hasConsumed;

  private MeetingRoom() {}

  synchronized public int getData() {
    hasConsumed = true;
    return data;
  }

  synchronized public void setInfo(int data, int consumerID) {
    this.data = data;
    this.consumerID = consumerID;
    hasConsumed = false;
  }

  public boolean checkIfConsumed() {
    return hasConsumed;
  }
}