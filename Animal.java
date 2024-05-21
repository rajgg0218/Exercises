class Pet {
    public void makeSound() {
        System.out.println("Rico always makes a sound when he hears something.");
    }
}

class Noise extends Pet {
    public void makeSound() {
        System.out.println("Rofus is shy type dog.");
    }
}

public class Animal {
    public static void main(String args[]) {
        Pet pet = new Pet();
        Noise noise = new Noise();
        pet.makeSound();
        noise.makeSound();
    }
}
