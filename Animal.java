class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Mammal extends Animal {
    @Override
    void makeSound() {
        System.out.println("Mammal makes a sound");
        super.makeSound(); // Calls the makeSound method of the superclass (Animal)
    }

    void giveBirth() {
        System.out.println("Mammal gives birth");
    }
}

class Dog extends Mammal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
        super.makeSound(); // Calls the makeSound method of the superclass (Mammal)
    }

    void wagTail() {
        System.out.println("Dog wags tail");
    }
}

class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bird chirps");
        super.makeSound(); // Calls the makeSound method of the superclass (Animal)
    }

    void fly() {
        System.out.println("Bird can fly");
    }
}

class Eagle extends Bird {
    @Override
    void makeSound() {
        System.out.println("Eagle screeches");
        super.makeSound(); // Calls the makeSound method of the superclass (Bird)
    }

    void soar() {
        System.out.println("Eagle can soar high");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of the classes
        Animal genericAnimal = new Animal();
        Mammal genericMammal = new Mammal();
        Dog myDog = new Dog();
        Bird myBird = new Bird();
        Eagle myEagle = new Eagle();

        // Demonstrate method overriding and super keyword
        System.out.println("Calling makeSound on genericAnimal:");
        genericAnimal.makeSound();
        System.out.println();

        System.out.println("Calling makeSound and giveBirth on genericMammal:");
        genericMammal.makeSound();
        genericMammal.giveBirth();
        System.out.println();

        System.out.println("Calling makeSound, giveBirth, and wagTail on myDog:");
        myDog.makeSound();
        myDog.giveBirth();
        myDog.wagTail();
        System.out.println();

        System.out.println("Calling makeSound and fly on myBird:");
        myBird.makeSound();
        myBird.fly();
        System.out.println();

        System.out.println("Calling makeSound, fly, and soar on myEagle:");
        myEagle.makeSound();
        myEagle.fly();
        myEagle.soar();
    }
}
