public class MeetingRoom {
  private int data;
  private int consumerID;
  private volatile boolean hasConsumed;

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