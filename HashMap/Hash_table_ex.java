
import java.util.Hashtable;

public class Hash_table_ex {

    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(101, "Pranav");
        table.put(102, "Pallavi");
        table.put(103, "Akash");

        System.out.println(table.get(104));
    }

}
