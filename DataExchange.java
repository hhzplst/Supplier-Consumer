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