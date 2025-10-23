package oop.lesson7;

import oop.lesson7.zoo.Zoo;

public class RunDog {
    public static void main(String[] args) {
        //Dog dog = new Dog("Maks", -7, "Dima");
        //System.out.println(dog);
        //dog.setWeight(-1);
        //System.out.println(dog);
        //System.out.println(dog.getOwner());
        //Dog dog2 = new Dog();
        //System.out.println(dog2);

        Dog dog = new Dog("Muhtar", -10, "Petr");
        Cat cat = new Cat("black", 10, "Vika");
        Zoo zoo = new Zoo(cat, dog);
        zoo.feed();
    }
}
