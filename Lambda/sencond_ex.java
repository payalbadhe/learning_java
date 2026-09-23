
@FunctionalInterface
interface Addition {

    int add(int num1, int num2);
}

public class sencond_ex {

    public static void main(String[] args) {

        Addition objInterface = (num1, num2) -> {
            int result = num1 + num2;
            return result;
        };
        objInterface.add(5, 5);
        System.out.println("Addition: " + objInterface.add(5, 5));

    }
}
