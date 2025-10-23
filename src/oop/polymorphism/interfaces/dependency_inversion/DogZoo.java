package oop.polymorphism.interfaces.dependency_inversion;

public class DogZoo {
    private Dog dog1;
    private Dog dog2;

    public DogZoo(Dog dog1, Dog dog2) { //сделано, чтобы сюда подходила любая порода
        System.out.println("Для любых собак");
        this.dog1 = dog1;
        this.dog2 = dog2;
    }

    public DogZoo(Pudel pudel, Shepherd shepherd){//если важен именно такой порядок
        System.out.println("Для пуделя и овчарки");
        this.dog1 = pudel;
        this.dog2 = shepherd;
    }
}
