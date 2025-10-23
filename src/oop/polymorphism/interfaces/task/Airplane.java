package oop.polymorphism.interfaces.task;

public class Airplane implements Flying{
    @Override
    public void fly(){
        System.out.println("Самолет отправился в небо");
    }
}
