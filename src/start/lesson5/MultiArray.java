package start.lesson5;

public class MultiArray {
    public static void main(String[] args) {
        //ограбили магазин. вор был ростом 178
        //следователь нашел 2 группы людей около магазина. задача найти вора по росту.
        int[] group1 = {180, 178, 190};
        int[] group2 = {165, 195, 193};
        int[][] multiArray = {group1, group2};

        upperfor:
        for (int[] array : multiArray){
            for (int number : array){
                if (number == 178){
                    System.out.println("Нашли вора");
                    break upperfor;
                } else{
                    System.out.println("Человек не подошел по росту");
                }
            }
        }
    }
}
