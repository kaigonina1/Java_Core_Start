package oop.task;

public class Runner {
    public static void main(String[] args) {
        Restaraunts res = new Restaraunts();
        Restaraunts res2 = new Restaraunts();
        Restaraunts.ingr[0] = 10;
        Restaraunts.ingr[1] = 2;
        res.dish();
        res.dish();
        res.put();
        res2.dish();
    }
}
