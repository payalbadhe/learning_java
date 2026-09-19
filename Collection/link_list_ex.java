
import java.util.LinkedList;

public class link_list_ex {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Payal");
        list.add("Pranali");
        list.add("Piyush");
        list.add("Akshda");

        list.addFirst("Pallavi");
        list.addLast("Isha");
        list.add("Payal");
        list.getFirst();
        list.isEmpty();
        list.size();

        System.out.println(list);
    }
}
