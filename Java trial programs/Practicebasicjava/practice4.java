package Practicebasicjava;

class Animals {
    void eat(){
        System.out.println("Eating");
    }
    void sound() {
        System.out.println("Make sound");
    }
}

class Dog2 extends Animals {
    @Override
    void sound() {
        System.out.println("Bow bow");
    }

    void run() {
        System.out.println("Running");
    }
}

public class practice4 {
    public static void main(String[] args) {
        Animals cat = new Animals();     // Object of parent class
        Dog2 shitzu = new Dog2();          // Object of subclass
        Animals leo = new Dog2();         // Upcasting: Dog to Animals

        cat.sound();   // Output: Make sound
        shitzu.sound(); // Output: Bow bow
        leo.sound();// Output: Bow bow (runtime polymorphism)
       // dynamic method dispatch can't run bcoz reference is Animals so only overriden method are executed in child class
        // leo.run();
        leo.eat();// can run parent class methods bcoz of inheritance
    }
}
