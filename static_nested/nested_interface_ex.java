
class OuterClass {

    interface Message {

        void display();
    }
}

class Demo implements OuterClass.Message {

    public void display() {
        System.out.println(" Nested interface example.");
    }
}

public class nested_interface_ex {

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.display();
    }

}
