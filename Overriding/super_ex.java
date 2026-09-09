
class parent {

    String name = "Parent";
}

class child extends parent {

    String name = "Child";

    public void display() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);
    }
}

public class super_ex {

    public static void main(String[] args) {
        child child = new child();
        child.display();

    }
}
