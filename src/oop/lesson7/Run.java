package oop.lesson7;

public class Run {
    public static void main(String[] args) {
        //Book book = new Book("Оно", "Стивен Кинг", 365, true);

        //book.printed();
        //book.info();
        //book.str(23);

        Car car1 = new Car("ZvoricinCar");
        //car1.razg();
        Car superCar = new Car("SuperCar", 400);
        //superCar.razg();

        Garage garage = new Garage();
        garage.setCar1(car1);
        garage.setCar2(superCar);
        garage.getInfoAboutCars();
    }
}
