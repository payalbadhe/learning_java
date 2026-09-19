
public class exception_ex {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            int result = a / b;
            System.out.println("result is: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program is running");
    }
}
