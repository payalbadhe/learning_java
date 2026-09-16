
public class call_ex {

    public static void changeValue(int a) {
        a = 10;
        System.out.println("Inside change value " + a);//10
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "pratik";
        System.out.println("Before change value " + s1.name);//pratik
        changeValue(s1);
        System.out.println("After change value " + s1.name);//pritik

    }
}
