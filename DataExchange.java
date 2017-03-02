public class DataExchange {
  public static void main(String[] args) {

    MeetingRoom mr = new MeetingRoom();

    Supplier s1 = new Supplier(1, mr);
    Supplier s2 = new Supplier(2, mr);
    Supplier s3 = new Supplier(3, mr);
    Supplier s4 = new Supplier(4, mr);
    Supplier s5 = new Supplier(5, mr);
    Supplier s6 = new Supplier(6, mr);
    Supplier s7 = new Supplier(7, mr);
    Supplier s8 = new Supplier(8, mr);
    Supplier s9 = new Supplier(9, mr);
    Supplier s10 = new Supplier(10, mr);


    Consumer c1 = new Consumer(1, mr);
    Consumer c2 = new Consumer(2, mr);
    Consumer c3 = new Consumer(3, mr);
    Consumer c4 = new Consumer(4, mr);
    Consumer c5 = new Consumer(5, mr);
    Consumer c6 = new Consumer(6, mr);
    Consumer c7 = new Consumer(7, mr);
    Consumer c8 = new Consumer(8, mr);
    Consumer c9 = new Consumer(9, mr);
    Consumer c10 = new Consumer(10, mr);

    Thread s1T = new Thread(s1);
    Thread s2T = new Thread(s2);
    Thread s3T = new Thread(s3);
    Thread s4T = new Thread(s4);
    Thread s5T = new Thread(s5);
    Thread s6T = new Thread(s6);
    Thread s7T = new Thread(s7);
    Thread s8T = new Thread(s8);
    Thread s9T = new Thread(s9);
    Thread s10T = new Thread(s10);

    Thread c1T = new Thread(c1);
    Thread c2T = new Thread(c2);
    Thread c3T = new Thread(c3);
    Thread c4T = new Thread(c4);
    Thread c5T = new Thread(c5);
    Thread c6T = new Thread(c6);
    Thread c7T = new Thread(c7);
    Thread c8T = new Thread(c8);
    Thread c9T = new Thread(c9);
    Thread c10T = new Thread(c10);

    s1T.start();
    s2T.start();
    s3T.start();
    s4T.start();
    s5T.start();
    s6T.start();
    s7T.start();
    s8T.start();
    s9T.start();
    s10T.start();

    c1T.start();
    c2T.start();
    c3T.start();
    c4T.start();
    c5T.start();
    c6T.start();
    c7T.start();
    c8T.start();
    c9T.start();
    c10T.start();
  }
}

/*********************************OUTPUT*********************************

➜  AssignmentD git:(master) ✗ javac *.java     
➜  AssignmentD git:(master) ✗ java DataExchange
Consumer 1 enters meeting room.
Consumer 1 enters waiting room.
Consumer 10 enters meeting room.
Consumer 10 enters waiting room.
Consumer 9 enters meeting room.
Consumer 9 enters waiting room.
Consumer 8 enters meeting room.
Consumer 8 enters waiting room.
Consumer 7 enters meeting room.
Consumer 7 enters waiting room.
Consumer 6 enters meeting room.
Consumer 6 enters waiting room.
Consumer 5 enters meeting room.
Consumer 5 enters waiting room.
Consumer 4 enters meeting room.
Consumer 4 enters waiting room.
Consumer 3 enters meeting room.
Consumer 3 enters waiting room.
Consumer 2 enters meeting room.
Consumer 2 enters waiting room.
Supplier 9 sleeps 37 milliseconds.
Supplier 9 produces data.
Supplier 9 enters meeting room.
Supplier 9 leaves data for its consumer.
Supplier 9 leaves meeting room.
Consumer 2 enters waiting room.
Consumer 3 enters waiting room.
Consumer 4 enters waiting room.
Consumer 5 enters waiting room.
Consumer 6 enters waiting room.
Consumer 7 enters waiting room.
Consumer 8 enters waiting room.
Consumer 9 removes data.
Consumer 9 leaves meeting room.
Consumer 10 enters waiting room.
Consumer 1 enters waiting room.
Consumer 2 enters waiting room.
Supplier 4 sleeps 148 milliseconds.
Supplier 4 produces data.
Supplier 4 enters meeting room.
Supplier 4 leaves data for its consumer.
Supplier 4 leaves meeting room.
Consumer 2 enters waiting room.
Consumer 1 enters waiting room.
Consumer 10 enters waiting room.
Consumer 8 enters waiting room.
Consumer 7 enters waiting room.
Consumer 6 enters waiting room.
Consumer 5 enters waiting room.
Consumer 4 removes data.
Consumer 4 leaves meeting room.
Consumer 3 enters waiting room.
Consumer 2 enters waiting room.
Supplier 1 sleeps 156 milliseconds.
Supplier 1 produces data.
Supplier 1 enters meeting room.
Supplier 1 leaves data for its consumer.
Supplier 1 leaves meeting room.
Consumer 2 enters waiting room.
Consumer 3 enters waiting room.
Consumer 5 enters waiting room.
Consumer 6 enters waiting room.
Consumer 7 enters waiting room.
Consumer 8 enters waiting room.
Consumer 10 enters waiting room.
Consumer 1 removes data.
Consumer 1 leaves meeting room.
Consumer 2 enters waiting room.
Supplier 3 sleeps 207 milliseconds.
Supplier 3 produces data.
Supplier 3 enters meeting room.
Supplier 3 leaves data for its consumer.
Supplier 3 leaves meeting room.
Consumer 2 enters waiting room.
Consumer 10 enters waiting room.
Consumer 8 enters waiting room.
Consumer 7 enters waiting room.
Consumer 6 enters waiting room.
Consumer 5 enters waiting room.
Consumer 3 removes data.
Consumer 3 leaves meeting room.
Consumer 2 enters waiting room.
Consumer 3 sleeps 68 milliseconds.
Consumer 3 enters meeting room.
Consumer 3 enters waiting room.
Supplier 7 sleeps 317 milliseconds.
Supplier 7 produces data.
Supplier 7 enters meeting room.
Supplier 7 leaves data for its consumer.
Supplier 7 leaves meeting room.
Consumer 3 enters waiting room.
Consumer 2 enters waiting room.
Consumer 5 enters waiting room.
Consumer 6 enters waiting room.
Consumer 7 removes data.
Consumer 7 leaves meeting room.
Consumer 8 enters waiting room.
Consumer 10 enters waiting room.
Consumer 3 enters waiting room.
Supplier 4 sleeps 176 milliseconds.
Supplier 4 produces data.
Supplier 4 enters meeting room.
Supplier 4 leaves data for its consumer.
Supplier 4 leaves meeting room.
Consumer 3 enters waiting room.
Consumer 10 enters waiting room.
Consumer 8 enters waiting room.
Consumer 6 enters waiting room.
Consumer 5 enters waiting room.
Consumer 2 enters waiting room.
Consumer 4 sleeps 200 milliseconds.
Consumer 4 enters meeting room.
Consumer 4 removes data.
Consumer 4 leaves meeting room.
Consumer 3 enters waiting room.
Supplier 10 sleeps 461 milliseconds.
Supplier 10 produces data.
Supplier 10 enters meeting room.
Supplier 10 leaves data for its consumer.
Supplier 10 leaves meeting room.
Consumer 3 enters waiting room.
Consumer 2 enters waiting room.
Consumer 5 enters waiting room.
Consumer 6 enters waiting room.
Consumer 8 enters waiting room.
Consumer 10 removes data.
Consumer 10 leaves meeting room.
Consumer 3 enters waiting room.
Supplier 1 sleeps 308 milliseconds.
Supplier 1 produces data.
Supplier 1 enters meeting room.
Supplier 1 leaves data for its consumer.
Supplier 1 leaves meeting room.
Consumer 3 enters waiting room.
Consumer 8 enters waiting room.
Consumer 6 enters waiting room.
Consumer 5 enters waiting room.
Consumer 2 enters waiting room.
Supplier 3 sleeps 264 milliseconds.
Supplier 3 produces data.
Supplier 3 enters meeting room.
Supplier 3 enters waiting room.
Consumer 9 sleeps 579 milliseconds.
Consumer 9 enters meeting room.
Consumer 9 enters waiting room.
Supplier 2 sleeps 642 milliseconds.
Supplier 2 produces data.
Supplier 2 enters meeting room.
Supplier 2 enters waiting room.
Supplier 8 sleeps 730 milliseconds.
Supplier 8 produces data.
Supplier 8 enters meeting room.
Supplier 8 enters waiting room.
Supplier 5 sleeps 742 milliseconds.
Supplier 5 produces data.
Supplier 5 enters meeting room.
Supplier 5 enters waiting room.
Consumer 1 sleeps 637 milliseconds.
Consumer 1 enters meeting room.
Consumer 1 removes data.
Consumer 1 leaves meeting room.
Consumer 3 enters waiting room.
Consumer 7 sleeps 535 milliseconds.
Consumer 7 enters meeting room.
Consumer 7 enters waiting room.
Supplier 9 sleeps 827 milliseconds.
Supplier 9 produces data.
Supplier 9 enters meeting room.
Supplier 9 leaves data for its consumer.
Supplier 9 leaves meeting room.
Consumer 7 enters waiting room.
Consumer 3 enters waiting room.
Supplier 5 enters waiting room.
Supplier 8 enters waiting room.
Supplier 2 enters waiting room.
Consumer 9 removes data.
Consumer 9 leaves meeting room.
Supplier 3 leaves data for its consumer.
Supplier 3 leaves meeting room.
Consumer 2 enters waiting room.
Consumer 5 enters waiting room.
Consumer 6 enters waiting room.
Consumer 8 enters waiting room.
Supplier 2 enters waiting room.
Supplier 8 enters waiting room.
Supplier 5 enters waiting room.
Consumer 3 removes data.
Consumer 3 leaves meeting room.
Consumer 7 enters waiting room.
Consumer 2 enters waiting room.
Supplier 1 sleeps 445 milliseconds.
Supplier 1 produces data.
Supplier 1 enters meeting room.
Supplier 1 leaves data for its consumer.
Supplier 1 leaves meeting room.
Consumer 2 enters waiting room.
Consumer 7 enters waiting room.
Supplier 6 sleeps 917 milliseconds.
Supplier 6 produces data.
Supplier 6 enters meeting room.
Supplier 6 enters waiting room.
Consumer 10 sleeps 448 milliseconds.
Consumer 10 enters meeting room.
Consumer 10 enters waiting room.
Supplier 5 enters waiting room.
Supplier 8 enters waiting room.
Supplier 2 enters waiting room.
Consumer 8 enters waiting room.
Consumer 6 enters waiting room.
Consumer 5 enters waiting room.
Supplier 7 sleeps 747 milliseconds.
Supplier 7 produces data.
Supplier 7 enters meeting room.
Supplier 7 enters waiting room.
Consumer 4 sleeps 716 milliseconds.
Consumer 4 enters meeting room.
Consumer 4 enters waiting room.
Supplier 4 sleeps 762 milliseconds.
Supplier 4 produces data.
Supplier 4 enters meeting room.
Supplier 4 enters waiting room.
Supplier 1 sleeps 218 milliseconds.
Supplier 1 produces data.
Supplier 1 enters meeting room.
Supplier 1 enters waiting room.
Supplier 10 sleeps 729 milliseconds.
Supplier 10 produces data.
Supplier 10 enters meeting room.
Supplier 10 enters waiting room.
Supplier 3 sleeps 410 milliseconds.
Supplier 3 produces data.
Supplier 3 enters meeting room.
Supplier 3 enters waiting room.
Consumer 9 sleeps 416 milliseconds.
Consumer 9 enters meeting room.
Consumer 9 enters waiting room.
Consumer 3 sleeps 590 milliseconds.
Consumer 3 enters meeting room.
Consumer 3 enters waiting room.
Consumer 1 sleeps 914 milliseconds.
Consumer 1 enters meeting room.
Consumer 1 removes data.
Consumer 1 leaves meeting room.
Consumer 2 enters waiting room.
Supplier 9 sleeps 977 milliseconds.
Supplier 9 produces data.
Supplier 9 enters meeting room.
Supplier 9 leaves data for its consumer.
Supplier 9 leaves meeting room.
Consumer 2 enters waiting room.
Consumer 3 enters waiting room.
Consumer 9 removes data.
Consumer 9 leaves meeting room.
Supplier 3 leaves data for its consumer.
Supplier 3 leaves meeting room.
Supplier 10 enters waiting room.
Supplier 1 enters waiting room.
Supplier 4 enters waiting room.
Consumer 4 enters waiting room.
Supplier 7 enters waiting room.
Consumer 5 enters waiting room.
Consumer 6 enters waiting room.
Consumer 8 enters waiting room.
Supplier 2 enters waiting room.
Supplier 8 enters waiting room.
Supplier 5 enters waiting room.
Consumer 10 enters waiting room.
Supplier 6 enters waiting room.
Consumer 7 enters waiting room.
Consumer 3 removes data.
Consumer 3 leaves meeting room.
Consumer 2 enters waiting room.
Supplier 10 leaves data for its consumer.
Supplier 10 leaves meeting room.
Consumer 2 enters waiting room.
Consumer 7 enters waiting room.
Supplier 6 enters waiting room.
Consumer 10 removes data.
Consumer 10 leaves meeting room.
Supplier 5 leaves data for its consumer.
Supplier 5 leaves meeting room.
Supplier 8 enters waiting room.
Supplier 2 enters waiting room.
Consumer 8 enters waiting room.
Consumer 6 enters waiting room.
Consumer 5 removes data.
Consumer 5 leaves meeting room.
Supplier 7 leaves data for its consumer.
Supplier 7 leaves meeting room.
Consumer 4 enters waiting room.
Supplier 4 enters waiting room.
Supplier 1 enters waiting room.
Consumer 6 enters waiting room.
Consumer 8 enters waiting room.
Supplier 2 enters waiting room.
Supplier 8 enters waiting room.
Supplier 6 enters waiting room.
Consumer 7 removes data.
Consumer 7 leaves meeting room.
Consumer 2 enters waiting room.
Consumer 4 enters waiting room.
Supplier 7 sleeps 72 milliseconds.
Supplier 7 produces data.
Supplier 7 enters meeting room.
Supplier 7 leaves data for its consumer.
Supplier 7 leaves meeting room.
Consumer 4 enters waiting room.
Consumer 2 enters waiting room.
Supplier 6 enters waiting room.
Supplier 8 enters waiting room.
Supplier 2 enters waiting room.
Consumer 8 enters waiting room.
Consumer 6 enters waiting room.
Supplier 1 enters waiting room.
Supplier 7 sleeps 1 milliseconds.
Supplier 4 enters waiting room.
Supplier 7 produces data.
Supplier 7 enters meeting room.
Supplier 7 enters waiting room.
Supplier 5 sleeps 211 milliseconds.
Supplier 5 produces data.
Supplier 5 enters meeting room.
Supplier 5 enters waiting room.
Supplier 3 sleeps 260 milliseconds.
Supplier 3 produces data.
Supplier 3 enters meeting room.
Supplier 3 enters waiting room.
Consumer 5 sleeps 326 milliseconds.
Consumer 5 enters meeting room.
Consumer 5 enters waiting room.
Consumer 7 sleeps 543 milliseconds.
Consumer 7 enters meeting room.
Consumer 7 removes data.
Consumer 7 leaves meeting room.
Consumer 4 enters waiting room.
Consumer 9 sleeps 567 milliseconds.
Consumer 9 enters meeting room.
Consumer 9 enters waiting room.
Supplier 9 sleeps 577 milliseconds.
Supplier 9 produces data.
Supplier 9 enters meeting room.
Supplier 9 leaves data for its consumer.
Supplier 9 leaves meeting room.
Consumer 9 removes data.
Consumer 9 leaves meeting room.
Consumer 4 enters waiting room.
Consumer 5 enters waiting room.
Supplier 3 leaves data for its consumer.
Supplier 3 leaves meeting room.
Supplier 5 enters waiting room.
Supplier 7 enters waiting room.
Supplier 4 enters waiting room.
Supplier 1 enters waiting room.
Consumer 6 enters waiting room.
Consumer 8 enters waiting room.
Supplier 2 enters waiting room.
Supplier 8 enters waiting room.
Supplier 6 enters waiting room.
Consumer 2 enters waiting room.
Consumer 5 enters waiting room.
Consumer 4 enters waiting room.
Supplier 3 sleeps 6 milliseconds.
Supplier 3 produces data.
Supplier 3 enters meeting room.
Supplier 3 enters waiting room.
Consumer 9 sleeps 27 milliseconds.
Consumer 9 enters meeting room.
Consumer 9 enters waiting room.
Consumer 1 sleeps 812 milliseconds.
Consumer 1 enters meeting room.
Consumer 1 enters waiting room.
Supplier 9 sleeps 139 milliseconds.
Supplier 9 produces data.
Supplier 9 enters meeting room.
Supplier 9 enters waiting room.
Consumer 10 sleeps 760 milliseconds.
Consumer 10 enters meeting room.
Consumer 10 enters waiting room.
Consumer 3 sleeps 765 milliseconds.
Consumer 3 enters meeting room.
Consumer 3 removes data.
Consumer 3 leaves meeting room.
Supplier 5 leaves data for its consumer.
Supplier 5 leaves meeting room.
Consumer 10 enters waiting room.
Supplier 9 enters waiting room.
Consumer 1 enters waiting room.
Consumer 9 enters waiting room.
Supplier 3 enters waiting room.
Consumer 4 enters waiting room.
Consumer 5 removes data.
Consumer 5 leaves meeting room.
Consumer 2 enters waiting room.
Supplier 6 leaves data for its consumer.
Supplier 6 leaves meeting room.
Supplier 8 enters waiting room.
Supplier 2 enters waiting room.
Consumer 8 enters waiting room.
Consumer 6 removes data.
Consumer 6 leaves meeting room.
Supplier 1 leaves data for its consumer.
Supplier 1 leaves meeting room.
Supplier 4 enters waiting room.
Supplier 7 enters waiting room.
Consumer 8 enters waiting room.
Supplier 2 enters waiting room.
Supplier 8 enters waiting room.
Consumer 2 enters waiting room.
Consumer 4 enters waiting room.
Supplier 3 enters waiting room.
Consumer 9 enters waiting room.
Consumer 1 removes data.
Consumer 1 leaves meeting room.
Supplier 9 leaves data for its consumer.
Supplier 9 leaves meeting room.
Consumer 10 enters waiting room.
Consumer 9 removes data.
Consumer 9 leaves meeting room.
Supplier 3 leaves data for its consumer.
Supplier 3 leaves meeting room.
Consumer 4 enters waiting room.
Consumer 2 enters waiting room.
Supplier 8 enters waiting room.
Supplier 2 enters waiting room.
Consumer 8 enters waiting room.
Supplier 7 enters waiting room.
Supplier 4 enters waiting room.
Consumer 10 enters waiting room.
Consumer 5 sleeps 79 milliseconds.
Consumer 5 enters meeting room.
Consumer 5 enters waiting room.
Supplier 10 sleeps 888 milliseconds.
Supplier 10 produces data.
Supplier 10 enters meeting room.
Supplier 10 enters waiting room.
Consumer 6 sleeps 367 milliseconds.
Consumer 6 enters meeting room.
Consumer 6 enters waiting room.
Consumer 1 sleeps 374 milliseconds.
Consumer 1 enters meeting room.
Consumer 1 enters waiting room.
Supplier 6 sleeps 403 milliseconds.
Supplier 6 produces data.
Supplier 6 enters meeting room.
Supplier 6 enters waiting room.
Consumer 7 sleeps 686 milliseconds.
Consumer 7 enters meeting room.
Consumer 7 enters waiting room.
Supplier 5 sleeps 512 milliseconds.
Supplier 5 produces data.
Supplier 5 enters meeting room.
Supplier 5 enters waiting room.
Supplier 9 sleeps 578 milliseconds.
Supplier 9 produces data.
Supplier 9 enters meeting room.
Supplier 9 enters waiting room.
Consumer 3 sleeps 603 milliseconds.
Consumer 3 enters meeting room.
Consumer 3 removes data.
Consumer 3 leaves meeting room.
Consumer 4 enters waiting room.
Consumer 9 sleeps 660 milliseconds.
Consumer 9 enters meeting room.
Consumer 9 enters waiting room.
Supplier 3 sleeps 886 milliseconds.
Supplier 3 produces data.
Supplier 3 enters meeting room.
Supplier 3 leaves data for its consumer.
Supplier 3 leaves meeting room.
Consumer 9 enters waiting room.
Consumer 4 enters waiting room.
Supplier 9 enters waiting room.
Supplier 5 enters waiting room.
Consumer 7 enters waiting room.
Supplier 6 enters waiting room.
Consumer 1 enters waiting room.
Consumer 6 enters waiting room.
Supplier 10 enters waiting room.
Consumer 5 enters waiting room.
Consumer 10 enters waiting room.
Supplier 4 enters waiting room.
Supplier 7 enters waiting room.
Consumer 8 enters waiting room.
Supplier 2 enters waiting room.
Supplier 8 enters waiting room.
Consumer 2 enters waiting room.
Supplier 1 sleeps 894 milliseconds.
Supplier 1 produces data.
Supplier 1 enters meeting room.
Supplier 1 enters waiting room.
Consumer 3 sleeps 511 milliseconds.
Consumer 3 enters meeting room.
Consumer 3 removes data.
Consumer 3 leaves meeting room.
Consumer 9 enters waiting room.
Supplier 3 sleeps 472 milliseconds.
Supplier 3 produces data.
Supplier 3 enters meeting room.
Supplier 3 leaves data for its consumer.
Supplier 3 leaves meeting room.
Consumer 9 enters waiting room.
Supplier 1 enters waiting room.
Consumer 2 enters waiting room.
Supplier 8 enters waiting room.
Supplier 2 enters waiting room.
Consumer 8 enters waiting room.
Supplier 7 enters waiting room.
Supplier 4 enters waiting room.
Consumer 10 enters waiting room.
Consumer 5 enters waiting room.
Supplier 10 enters waiting room.
Consumer 6 enters waiting room.
Consumer 1 enters waiting room.
Supplier 6 enters waiting room.
Consumer 7 enters waiting room.
Supplier 5 enters waiting room.
Supplier 9 enters waiting room.
Consumer 4 enters waiting room.
Consumer 3 sleeps 689 milliseconds.
Consumer 3 enters meeting room.
Consumer 3 removes data.
Consumer 3 leaves meeting room.
Consumer 9 enters waiting room.
Supplier 3 sleeps 764 milliseconds.
Supplier 3 produces data.
Supplier 3 enters meeting room.
Supplier 3 leaves data for its consumer.
Supplier 3 leaves meeting room.
Consumer 9 enters waiting room.
Consumer 4 enters waiting room.
Supplier 9 enters waiting room.
Supplier 5 enters waiting room.
Consumer 7 enters waiting room.
Supplier 6 enters waiting room.
Consumer 1 enters waiting room.
Consumer 6 enters waiting room.
Supplier 10 enters waiting room.
Consumer 5 enters waiting room.
Consumer 10 enters waiting room.
Supplier 4 enters waiting room.
Supplier 7 enters waiting room.
Consumer 8 enters waiting room.
Supplier 2 enters waiting room.
Supplier 8 enters waiting room.
Consumer 2 enters waiting room.
Supplier 1 enters waiting room.
Supplier 3 sleeps 606 milliseconds.
Supplier 3 produces data.
Supplier 3 enters meeting room.
Supplier 3 enters waiting room.
Consumer 3 sleeps 966 milliseconds.
Consumer 3 enters meeting room.
Consumer 3 removes data.
Consumer 3 leaves meeting room.
Consumer 9 enters waiting room.
Consumer 3 sleeps 363 milliseconds.
Consumer 3 enters meeting room.
Consumer 3 enters waiting room.

********************************END OUTPUT*******************************/