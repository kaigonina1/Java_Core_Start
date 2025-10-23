package oop.lesson7;

public class Car {
    private String marka;
    private int maxSpeed = 220;

    public Car(String marka) {
        this.marka = marka;
    }

    public Car(String marka, int maxSpeed) {
        this.marka = marka;
        this.maxSpeed = maxSpeed;
    }

    public void razg(){
        System.out.printf("Скорость разгона до 100 км/ч: %s\n", 110d/(this.maxSpeed/20d));
    }

    public String getMarka(){
        return marka;
    }

    public void setMarka(String newMarka){
        this.marka = newMarka;
    }

    public void setMaxSpeed(int newSpeed){
        this.maxSpeed = newSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
