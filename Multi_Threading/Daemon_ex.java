
class MyThread extends Thread {

    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread Is Running");
        } else {
            System.out.println("User Thraed Running");
        }
    }
}

public class Daemon_ex {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setDaemon(true);
        t1.start();
        t2.start();

    }
}
