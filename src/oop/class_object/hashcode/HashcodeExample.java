package oop.class_object.hashcode;

import oop.class_object.equals.Child;

public class HashcodeExample {
    public static void main(String[] args) {
        Child child1 = new Child("Дима", 2005);
        Child child2 = new Child("Ксюша", 2006);
        Child child3 = new Child("Лиза", 2003);
        Child child4 = new Child("Полина", 2004);

        Child[] group0 = {child2, child4};//четный год рождения
        Child[] group1 = {child1, child3};
        Child[][] children = {group0, group1};
        ChildrenGardenWithGroups childrenGardenWithGroups = new ChildrenGardenWithGroups(children);


    }
}
