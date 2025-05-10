
interface Engine {
    void startEngine();
    void stopEngine();
}

abstract class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    abstract void drive();

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
class Car extends Vehicle implements Engine {
    public Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    @Override
    void drive() {
        System.out.println("Driving a car.");
    }
}

class Bike extends Vehicle implements Engine {
    public Bike(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Bike engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bike engine stopped.");
    }

    @Override
    void drive() {
        System.out.println("Riding a bike.");
    }
}

class Boat extends Vehicle implements Engine {
    public Boat(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Boat engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Boat engine stopped.");
    }

    @Override
    void drive() {
        System.out.println("Sailing a boat.");
    }
}
public class TestVehicle {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 2022);
        car.displayInfo();
        ((Engine) car).startEngine();
        car.drive();
        ((Engine) car).stopEngine();

        System.out.println();

        Vehicle bike = new Bike("Yamaha", 2023);
        bike.displayInfo();
        ((Engine) bike).startEngine();
        bike.drive();
        ((Engine) bike).stopEngine();

        System.out.println();
        Vehicle boat = new Boat("Bayliner", 2024);
        boat.displayInfo();
        ((Engine) boat).startEngine();
        boat.drive();
        ((Engine) boat).stopEngine();
    }
}
