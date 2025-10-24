package oop.polymorphism.interfaces.interface_inheritance;

public interface Alive extends Eatable, Moveable{//множественное наследование от интерфейсов разрешено

    @Override
    default void eat() {
        Eatable.super.eat();//так как у Moveable нет реализации, в ином случае выбираем любой метод
    }
}
