class Bike {
    String brand;
    int gear;

    void ride() {
        System.out.println("Bike is riding...");
    }
}

public class classesandobject {
    public static void main(String[] args) {
        Bike myBike = new Bike(); // object creation
        myBike.brand = "Yamaha";
        myBike.gear = 5;
        myBike.ride();
    }
}
