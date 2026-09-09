
public class add {

    public void add(String b) {
        System.out.println(b);
    }

    public void add(int b) {
        System.out.println(b);
    }

    public static void main(String[] args) {
        add calc = new add();
        calc.add("hello");
        calc.add(42);
    } 
}
