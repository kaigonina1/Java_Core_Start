package oop.class_object.equals_hashcode_practice;

public class Task {
    public static void main(String[] args) {
        //Создать класс пользователь - логин, пароль
        //Создать 2 пользователь
        //с одинаковым логином и разными паролями
        //сделать так, чтобы хэшкоды были равны, а equals возвращал false
        User user1 = new User("ablazzing", "111111");
        User user2 = new User("ablazzing", "222222");

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.equals(user2));
    }
}
