package oop.polymorphism.interfaces.task;

public class Duck implements Swimming, Flying{
    @Override
    public void swim(){
        System.out.println("Утку закинули в бассейн");
    }

    @Override
    public void fly(){
        System.out.println("Утку отправили в небо");
    }
}
