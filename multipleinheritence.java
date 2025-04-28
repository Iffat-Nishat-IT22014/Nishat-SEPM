interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Seaplane implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Seaplane is flying...");
    }

    public void swim() {
        System.out.println("Seaplane is floating on water...");
    }
}

public class multipleinheritence {
    public static void main(String[] args) {
        Seaplane s = new Seaplane();
        s.fly();
        s.swim();
    }
}

