package oop.lesson7;

public class Garage {
    private Car car1;
    private Car car2;

    public Garage() {
    }

    public void setCar1(Car car1) {
        this.car1 = car1;
    }

    public void setCar2(Car car2) {
        this.car2 = car2;
    }

    public void getInfo(Car car){
        System.out.println(car.getMarka());
        car.razg();
    }

    public void getInfoAboutCars(){
        getInfo(car1);
        getInfo(car2);
    }
}
