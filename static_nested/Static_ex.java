//static inner class example
class Outerclass {

    static int num = 10;

    static class Innerclass {

        void display() {
            System.out.println("Value of num: " + num);
        }
    }
}

public class Static_ex {

    public static void main(String[] args) {
        Outerclass.Innerclass obj = new Outerclass.Innerclass();
        obj.display();

    }
}
