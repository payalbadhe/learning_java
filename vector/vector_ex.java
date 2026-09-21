
import java.util.Vector;

public class vector_ex {

    public static void main(String[] args) {
        // Using String Datatype(Wrapper Class)
        Vector<String> names = new Vector<>();
        names.add("Pranav");
        names.add("Gaurav");
        names.add("Piyush");
        names.add("Akshada");

        System.out.println(names.get(0));
        names.remove(1);
        System.out.println(names);

        // Using Integer Datatype(Wrapper Class)
        Vector<Integer> age = new Vector<>();
        age.add(21);
        age.add(18);
        age.add(20);
        age.add(16);

        System.out.println(age);

        for (String num : names) {
            System.out.println(num);
        }
    }
}
