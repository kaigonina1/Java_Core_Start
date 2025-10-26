package oop.class_object;

public class Cat {
    //все классы неявно наследуются от класса Object
    //native у метода означает, что метод написан на более низкоуровневом языке
    private String catName;

    public Cat(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        return catName;
    }
}
