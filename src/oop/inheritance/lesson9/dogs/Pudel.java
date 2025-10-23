package oop.inheritance.lesson9.dogs;

public class Pudel extends Dog{

    public Pudel(int countTeeth){
        super(countTeeth);
    }

    public void run(){
        System.out.println("Собака бежит медленно");
    }

    @Override
    public void breathe() {
        System.out.println("Пудель дышит");
    }
}
