package oop.lesson7;

public class RecursionEx {
    public static void main(String[] args) {
        //посчитать сумму от 1 до k
        Recursion rec = new Recursion();
        int k = 10;
        int res = rec.sum(k);
        System.out.println(res);
    }
}
