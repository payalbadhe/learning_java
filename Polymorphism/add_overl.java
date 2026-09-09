
public class add_overl {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        add_overl calc = new add_overl();
        System.out.println(calc.add(5, 6));

    }
}
