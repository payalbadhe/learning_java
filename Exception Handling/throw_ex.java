
public class finally_ex {

    public static void main(String[] args) {
        int age = 25;
        if (age < 18) {
            throw new ArithmeticException("age is less than 18");
        }
        System.out.println("age is valid " + age);
    }
}
