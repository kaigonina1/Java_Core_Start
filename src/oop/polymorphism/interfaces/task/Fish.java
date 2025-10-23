package oop.polymorphism.interfaces.task;

public class Fish implements Swimming{
    @Override
    public void swim(){
        System.out.println("Закинули рыбу в бассейн");
    }
}
