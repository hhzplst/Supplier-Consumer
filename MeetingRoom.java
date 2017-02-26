public class MeetingRoom {
  private volatile int data;
  private volatile int consumerID;
  private volatile boolean hasConsumed = true;

  public int getData() {
    hasConsumed = true;
    return data;
  }

  public int getConsumerID() {
    return consumerID;
  }

  public void setInfo(int data, int consumerID) {
    this.data = data;
    this.consumerID = consumerID;
    hasConsumed = false;
  }

  public void clearData() {
    data = 0;
  }

  public boolean checkIfConsumed() {
    return hasConsumed;
  }
}