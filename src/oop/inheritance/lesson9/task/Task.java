package oop.inheritance.lesson9.task;

public class Task {
    public static void main(String[] args) {
        Ohrannik ohr = new Ohrannik(true);
        Secretar sec = new Secretar(false);
        Buhgalter buh = new Buhgalter(false);

        ohr.getSalary();
        sec.drinkCoffee();
        sec.getSalary();
        buh.getSalary();
    }
}
