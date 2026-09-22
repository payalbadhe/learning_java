
class Box<T> {

    //private Datatype Vname
    private T value;

    //setter
    public void setValue(T value) {
        this.value = value;

    }

    //getter
    public T getValue() {
        return value;
    }
}

public class generic_ex {

    public static void main(String[] args) {
        Box<String> stringObj = new Box();
        stringObj.setValue("Payal");
        System.out.println(stringObj.getValue());
        Box<Integer> intObj = new Box();
        intObj.setValue(10);
        System.out.println(intObj.getValue());

    }
}
