package oop.task;

public class Restaraunts {
    private static int sausages;
    private static int bread;

    public static int ingr[] = new  int[2];

    static{
        ingr[0] = sausages;
        ingr[1] = bread;
    }

    public void dish(){
        if (ingr[0] >=1 && ingr[1] >=2) {
            ingr[0] -= 1;
            ingr[1] -= 2;
            System.out.println("Блюдо подано");
        } else{
            System.out.println("нет ингридиентов");
        }
    }

    public void put(){
        ingr[0] +=100;
        ingr[1] += 200;
        System.out.println("Партия принята");
    }
}
