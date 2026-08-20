
public class Nestedif {

    public static void main(String[] args) {
        int age = 27;
        boolean hasLicence = true;

        if (age >= 18) {
            if (hasLicence == true) {
                System.out.println("Drive");
            } else {
                System.out.println("Need Licence");
            }else {
                System.out.println("You are underage");
            }
        }
    }
}
