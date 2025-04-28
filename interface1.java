interface Animal {
    void sound();
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow");
    }
}

public class interface1 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
    }
}
