
class Task1 implements Runnable {

    public void run() {
        System.out.println("Thread Using Runnable");
    }

}

public class impliment_runable_ex {

    public static void main(String[] args) {
        Task1 task = new Task1();
        Thread t1 = new Thread(task, "FCT-Task");
        t1.start();
        System.out.println(t1.getName());

    }

}
