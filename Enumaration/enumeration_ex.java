
import java.util.Enumeration;
import java.util.Hashtable;

public class enumeration_ex {

    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(101, "Pranav");
        table.put(102, "Pallavi");
        table.put(103, "Akash");

        Enumeration<Integer> keys = table.keys();

        while (keys.hasMoreElements()) {
            Integer id = keys.nextElement();
            System.out.println(id);

        }
        Enumeration<String> value = table.elements();

        while (value.hasMoreElements()) {
            String name = value.nextElement();
            System.out.println(name);

        }
    }
}
