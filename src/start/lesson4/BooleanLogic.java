package start.lesson4;

public class BooleanLogic {
    public static void main(String[] args) {
        boolean isBoughtBread = false;
        boolean isBoughtMilk = true;

        boolean isBought = isBoughtBread && isBoughtMilk;

        if (isBought){
            System.out.println("Молодец, что купил");
        } else {
            System.out.println("Почему купил не все?");
        }

        boolean IsBought = isBoughtBread || isBoughtMilk;

        if (IsBought){
            System.out.println("Молодец, что купил");
        } else {
            System.out.println("Почему купил не все?");
        }

        boolean isBoughtCandy = true;
        if (!isBoughtCandy){
            System.out.println("Мама хвалит сына");
        }
    }
}
