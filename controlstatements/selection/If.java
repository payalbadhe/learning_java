
public class If {

    public static void main(String[] args) {
        int age = 17;

        if (age >= 18) {
            System.out.println("Adult");
        } else if (age >= 14 && age < 18) {
            System.out.println("Minor");
        } else {
            System.out.println("NA");
        }
        
    }
}
