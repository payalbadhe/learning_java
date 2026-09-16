
interface vehicle {

    void start();

    void stop();
}

class car implements vehicle {

    public void start() {
        System.out.println("Car starting...");
    }

    public void stop() {
        System.out.println("Car stopped....");
    }
}

class bike implements vehicle {

    public void start() {
        System.out.println("Bike starting...");
    }

    public void stop() {
        System.out.println("Bike stopped....");
    }
}

public class interface_ex {

    public static void main(String[] args) {
        vehicle myCar = new car();
        myCar.start();
        myCar.stop();
        vehicle myBike = new bike();
        myBike.start();
        myBike.stop();
    }
}
