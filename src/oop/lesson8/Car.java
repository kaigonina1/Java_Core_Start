package oop.lesson8;

import java.util.Arrays;

public class Car {
    private String brand;
    private static int countCars = 0;

    public final static String BMW_INFO = "немецкая компания";
    public final static String AUDI_INFO = "создана в 1933";
    public final static String KIA_INFO = "корейская компания";

    public final static String[] brand_info = new String[3];

    static{
        brand_info[0] = BMW_INFO;
        brand_info[1] = AUDI_INFO;
        brand_info[2] = KIA_INFO;
        System.out.println(Arrays.toString(brand_info));
    }

    public Car(String brand) {
        this.brand = brand;
        countCars++;
    }

    public String getBrand() {
        return brand;
    }

    public int getCountCars() {
        return countCars;
    }

    public static void printModels(){
        System.out.println("Перечень доступнных брендов: bmw, audi, kia" );
    }
}
