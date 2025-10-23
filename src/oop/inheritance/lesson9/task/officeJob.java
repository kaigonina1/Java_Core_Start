package oop.inheritance.lesson9.task;

public abstract class officeJob extends Human {

    public officeJob(boolean isMan){
        super(isMan);
    }

    public void drinkCoffee(){
        System.out.println("Работник пьет кофе");
    };
}