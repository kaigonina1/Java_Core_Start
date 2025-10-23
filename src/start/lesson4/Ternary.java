package start.lesson4;

public class Ternary {
    public static void main(String[] args) {
        int money = 100;
        int breadPrice = 20;
        int moneyAfterShop = money - breadPrice;
        int childMoney = moneyAfterShop >= 50 ? 10 : 5;
        moneyAfterShop -= moneyAfterShop >= 50 ? 10 : 5;
        System.out.println(childMoney);
        System.out.println(moneyAfterShop);
    }
}
