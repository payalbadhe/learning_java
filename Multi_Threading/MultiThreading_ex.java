
class MyThread extends Thread {

    public void run() {     //content the task that thread excution
        System.out.println("Thread Is Running");
    }
}

public class MultiThreading_ex {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();// start the new thread

        Thread t2 = new Thread();
        {
            t2.start();
            System.out.println(t2.getName());
        }
    }
}
