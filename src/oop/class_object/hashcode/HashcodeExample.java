package oop.class_object.hashcode;

import oop.class_object.equals.Child;

public class HashcodeExample {
    //смысл хэша в разделении на группы по признакам,
    //благодаря которым при поиске своего объекта,
    //количество просмотренных объектов сокращается
    public static void main(String[] args) {
        Child child1 = new Child("Дима", 2005);
        Child child2 = new Child("Ксюша", 2006);
        Child child3 = new Child("Лиза", 2003);
        Child child4 = new Child("Полина", 2004);

        Child[] group0 = {child2, child4};//четный год рождения
        Child[] group1 = {child1, child3};
        Child[][] children = {group0, group1};
        ChildrenGardenWithGroups childrenGardenWithGroups = new ChildrenGardenWithGroups(children);

        Child ChildForFind = new Child("Лиза", 2003);

        boolean result = false;
        System.out.println(child1.getName() +" в "+ child1.hashCode() + " группе");
        for (Child child : childrenGardenWithGroups.getChildren()[ChildForFind.hashCode()]) {
            System.out.println("Ребенок, с которым сравниваем: " + child.getName() );
            if (child.equals(ChildForFind)){
                result = true;
                System.out.println("Это он!");
                break;
            }
        }

        System.out.println(result);
    }
}
