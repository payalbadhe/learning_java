
class Student {

    String name;
}

public class call_by_refeex {

    public static void changeValue(Student s) {
        s.name = "pritik";
        System.out.println("Inside change value " + s.name);//pritik
    }

    public static void changeValue(int[] a) {
        Student s1 = new Student();
        s1.name = "pritik";
        System.out.println("After changevalue" + s1.name);//pritik
        changeValue(s1);
        System.out.println("After change value " + s1.name);//pritik

    }
}
