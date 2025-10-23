package oop.inheritance.lesson9.dogs;

public final class Ovcharka extends Dog{

    public Ovcharka() {
        super(27);
    }

    @Override
    public void run() {
        System.out.println("Собака бежит быстро");
    }

    @Override
    public void breathe() {
        System.out.println("Овчарка дышит");
    }

    @Override
    public void bark() {
        System.out.println("Овчарка громко лает");
    }

    @Override
    public void beAngry(){
        //текст из своего метода
        //метод родителя
        //текст из своего метода

        System.out.println("Собака стоит на " + super.countLegs + ".");
        System.out.println("Овчарка увидела чужого человека");
        super.beAngry();
        System.out.println("Овчарка успокоилась");
    }
}

