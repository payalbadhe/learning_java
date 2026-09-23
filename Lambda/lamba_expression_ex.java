
@FunctionalInterface
interface MyInterface {

    void SayHello();
}

public class lamba_expression_ex {

    public static void main(String[] args) {
        //
        MyInterface obj = new MyInterface() {
            public void SayHello() {
                System.out.println("Hello Without Lambda Expression");

            }
        };
        obj.SayHello();

        //with lambda expression // arrow mean its a opetar
        MyInterface obj1 = () -> {
            System.out.println("Hello With Lambda Expression");

        };
        obj1.SayHello();

    }

}
