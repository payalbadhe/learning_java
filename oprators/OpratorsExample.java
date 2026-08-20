public class OpratorsExample{
    public static void main(String[] args) {
        //Arithmatic oprators
        int num1 =  10;
        int num2 = 5;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);


        //Logical Oprators
        boolean a = true;
        boolean b = true;

        boolean isAdmin = false;
        System.out.println(!isAdmin);
        //arithmatic oprators

        

        //unary oprator
        int num = 7;
        int result = num++;
        System.out.println(result); //7
        System.out.println(num); //8

        result = ++num;
        System.out.println(result);//9
        System.out.println(num);//9


    }
}