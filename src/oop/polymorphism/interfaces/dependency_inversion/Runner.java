package oop.polymorphism.interfaces.dependency_inversion;

public class Runner {
    public static void main(String[] args) {
        Pudel pudel = new Pudel();
        Shepherd shepherd = new Shepherd();
        Terier terier = new Terier();
        DogZoo dogZoo = new DogZoo(terier, shepherd);
        DogZoo dogZoo1 = new DogZoo(pudel, shepherd);

    }
}
