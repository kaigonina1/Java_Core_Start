package oop.inheritance.lesson9.dogs;

import oop.inheritance.lesson9.Alive;

public abstract class Dog extends Alive {
    //существует только за счет наследников, так как абстрактен
    protected final int countLegs = 4; //виден у всех классов наследников независимо от местоположения
    public int countTeeth;

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void beAngry(){
        System.out.println("Собака рычит");
    }

    public void bark(){
        System.out.println("Собака лает");
    }

    public final void eat(){
        System.out.println("Собака ест");
    }

    public abstract void run(); //реализация в каждом классе своя


}
