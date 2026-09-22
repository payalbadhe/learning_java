
public class regex_ex {

    public static void main(String[] args) {
        String email = "test123@gamil.com";
        String regex = "";
        if (email.matches(regex)) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invaild Email");
        }
    }
}
