
import java.util.ArrayList;

public class unboxing_ex {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);//autoboxing
        int a = list.get(0);//unboxing
        System.out.println(a);
        System.out.println(list);
    }

}
