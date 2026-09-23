
class Task1 extends Thread {

    public void run() {     //content the task that thread excution
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task1" + i);//string concatenation

        }
    }
}

class Task2 extends Thread {

    public void run() {     //content the task that thread excution
        for (int i = 6; i <= 10; i++) {
            System.out.println("Task2" + i);//string concatenation

        }
    }
}

public class MultiThreading_example {

    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        t1.start();
        t2.start();
    }

}
