public class MeetingRoom {
  private volatile int data;
  private volatile int consumerID;
  private volatile boolean isEmpty = true;

  public void getData() {
    isEmpty = true;
    data = 0;
  }

  public int getConsumerID() {
    return consumerID;
  }

  public void setInfo(int data, int consumerID) {
    this.data = data;
    this.consumerID = consumerID;
    isEmpty = false;
  }

  public boolean checkIfEmpty() {
    return isEmpty;
  }
}