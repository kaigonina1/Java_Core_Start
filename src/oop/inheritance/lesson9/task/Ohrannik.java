package oop.inheritance.lesson9.task;

public class Ohrannik extends Human{
    public Ohrannik(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Охранник получил 15 тысяч");
    }
}
