package oop.polymorphism.interfaces.functional_interface;

public class Runner {
    public static void main(String[] args) {
        Sounding cat = new Cat();
        cat.makeSound();

        Sounding bird = () -> System.out.println("Птица поет");
        //мы как будто создали класс и создали интерфейс для птицы
        //позволяет создать функцию, не создавая класс
        bird.makeSound();
    }
}
