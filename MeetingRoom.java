public class MeetingRoom {
  private volatile static MeetingRoom uniqueMeetingRoom;

  private MeetingRoom() {}

  public static MeetingRoom getMeetingRoomInstance() {
    if (uniqueMeetingRoom == null) {
      synchronized (MeetingRoom.class) {
        if (uniqueMeetingRoom == null) {
          uniqueMeetingRoom = new MeetingRoom();
        }
      }
    }
    return uniqueMeetingRoom;
  }
}