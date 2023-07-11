package data_structure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {

    public static void main(String[] args) {

//        setDemo();
        listDemo();
    }

    public static void setDemo() {

        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");

        System.out.println(fruits);

        fruits.remove("lemon");
        System.out.println("contains lemon? " + fruits.contains("lemon"));

        System.out.println("size: " + fruits.size());

        Set<String> moreFruit = Set.of("pear", "raisin", "cherry");
//        moreFruit.add("cranberry"); //cant do this 'cause Set.of makes this not work, must use HashSet before use Set.of
        System.out.println(moreFruit);
    }

    public static void listDemo() {

        List<Object> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.set(2, "grape");
        fruits.add("lemon");
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals("lemon")) {
                fruits.remove(i);
                i--;
            }
        }

        System.out.println(fruits.get(2));
    }
}
