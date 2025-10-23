package oop.inheritance.lesson9.task;

public class Buhgalter extends officeJob{

    public Buhgalter(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Бухгалтер получил 50 тысяч");
    }
}
