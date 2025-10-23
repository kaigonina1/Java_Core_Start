package oop.polymorphism.interfaces.task;

public class Runner {
    public static void main(String[] args) {
        //Есть три класса
        //Рыба умеет плавать
        //Утка - плавать и летать
        //Самолет - летать
        //Создать по экземпляру каждого класса, создав интерфейс
        //Закинуть плавающих в бассейн
        //Отправить летающих в небо

        Fish fish = new Fish();
        Duck duck = new Duck();
        Airplane air = new Airplane();

        Swimming[] swims = new Swimming[2];
        swims[0] = fish;
        swims[1] = duck;

        for (Swimming swim : swims) {
            swim.swim();
        }

        Flying[] flies = {duck, air};

        for (Flying fly : flies) {
            fly.fly();
        }


    }
}
