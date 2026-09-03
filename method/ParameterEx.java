public class ParameterEx {
    int add(int num1,int num2){

        int result = num1+num2;
        return result;
    
    }
    public static void main(String[] args) {
        ParameterEx obj= new ParameterEx();
        System.out.println(obj.add(4,5));
        System.out.println(obj.add(14,15));
    }
}
//remove the object and apply static keyword so called your static method
