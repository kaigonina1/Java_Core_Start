package oop.inheritance.lesson9.task;

public class Secretar extends officeJob{

    public Secretar(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Секретарь получил зарплату 30 тысяч");
    }
}
