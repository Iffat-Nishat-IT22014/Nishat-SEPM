abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Bird extends Animal {
    void makeSound() {
        System.out.println("Chirp Chirp");
    }
}

public class abstractclasses {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.makeSound();
        b.sleep();
    }
}
