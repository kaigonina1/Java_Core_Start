package oop.polymorphism.interfaces.functional_interface;

@FunctionalInterface//для постоянной проверки, что интерфейс функциональный
public interface Sounding {
    void makeSound(); //абстрактный метод
    //функциональный - это интерфейс, у которого лишь 1 абстрактный метод
}
