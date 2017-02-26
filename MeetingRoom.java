public class MeetingRoom {
  private int data;
  private int consumerID;
  private boolean hasConsumed = true;

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