package oop.class_object.equals;

public class Example {
    public static void main(String[] args) {
        Child child1 = new Child("Дима", 2005);
        Child child2 = new Child("Ксюша", 2006);
        Child child3 = new Child("Лиза", 2003);
        Child child4 = new Child("Полина", 2004);

        Child[] children = {child1, child2, child3, child4};
        Children_garden childrenGarden = new Children_garden(children);

        boolean result = false;
        Child childForFind = new Child("Дима", 2005);

        for (Child child : childrenGarden.getChildren()) {
            if (child.equals(childForFind)){
                result = true;
                break;
            }
        }

        System.out.println(result);

    }
}
