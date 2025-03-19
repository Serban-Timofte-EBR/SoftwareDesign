package thread_safe;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(Main::accessGovernment, "Thread-1");
        Thread t2 = new Thread(Main::accessGovernment, "Thread-2");
        Thread t3 = new Thread(Main::accessGovernment, "Thread-3");
        Thread t4 = new Thread(Main::accessGovernment, "Thread-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads finished execution.");
    }

    private static void accessGovernment() {
        Government government = Government.getInstance();
        System.out.println(Thread.currentThread().getName() + " - Instance HashCode: " + System.identityHashCode(government));
        System.out.println("GOVERNMENT: " + government);
    }
}