
import java.util.HashMap;

public class Hash_map_ex {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Pranav");
        map.put(102, "Pallavi");
        map.put(103, "Akash");

        System.out.println(map.get(102));
        System.out.println(map.containsKey(102));
        System.out.println(map.remove(102));

        for (Integer key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}
