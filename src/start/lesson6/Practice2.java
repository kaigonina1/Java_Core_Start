package start.lesson6;

public class Practice2 {
    public static void main(String[] args) {
        String CarMark = "Audi";
        String CarModel = "Q3";
        double price = 15_000_000;
        boolean hasAutomaticTransmission = true;
        System.out.printf("Привет, я менеджер салона %s.\nУ нас есть модель - %s за %f.\nЕсть ли у нее автоматическая коробка передач?\n%s", CarMark, CarModel, price, hasAutomaticTransmission ? "Да" : "Нет");
    }
}
