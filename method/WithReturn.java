
public class WithReturn {

    int add() {
        int a = 4;
        int b = 5;
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        WithReturn obj = new WithReturn();
        System.out.println(obj.add());

    }
}
//this same example is parameter aslo
