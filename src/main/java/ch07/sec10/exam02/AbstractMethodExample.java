package ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breath();
        dog.sound();

        Cat cat = new Cat();
        cat.breath();
        cat.sound();

        animalSound(dog);
        animalBreath(dog);

        animalSound(cat);
        animalBreath(cat);

    }

    public static void animalSound(Animal animal){
        animal.sound();
    }
    public static void animalBreath(Animal animal){
        animal.breath();
    }
}
