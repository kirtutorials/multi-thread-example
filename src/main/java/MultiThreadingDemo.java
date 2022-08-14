public class MultiThreadingDemo {
    public static void main(String[] args) {
        Threads t1 = new Threads("t1");
        Threads t2 = new Threads("t2");

        t1.start();
        t2.start();
    }
}

