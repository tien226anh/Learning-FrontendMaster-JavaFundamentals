package data_structure;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        setDemo();
//        listDemo();
//        queueDemo();
//        mapDemo();
    }

    public static void setDemo() {

        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        var i = fruits.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }


//        System.out.println(fruits);
//
//        fruits.remove("lemon");
//        System.out.println("contains lemon? " + fruits.contains("lemon"));
//
//        System.out.println("size: " + fruits.size());
//
//        Set<String> moreFruit = Set.of("pear", "raisin", "cherry");
////        moreFruit.add("cranberry"); //cant do this 'cause Set.of makes this not work, must use HashSet before use Set.of
//        System.out.println(moreFruit);
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

        List moreFruit = List.of("Cherry", "plum");

        System.out.println(moreFruit);
    }

    public static void queueDemo() {
        Queue<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        var removed = fruits.remove();
        System.out.println("remove: " + removed);
        System.out.println("head of queue: " + fruits.peek());

        System.out.println(fruits);
    }

    public static void mapDemo() {

        Map<String, Integer> fruitCalorie = new HashMap<String, Integer>();
        fruitCalorie.put("apple", 95);
        fruitCalorie.put("lemon", 20);
        fruitCalorie.put("banana", 105);
        fruitCalorie.put("orange", 45);
        fruitCalorie.put("lemon", 17);
        fruitCalorie.remove("lemon");
        System.out.println(fruitCalorie);
        System.out.println("banana calories: " + fruitCalorie.get("banana"));
        System.out.println("contains orange?: " + fruitCalorie.containsKey("orange"));

        Map immutableFruitCalories = Map.of(
                "apple", 95,
                "lemon", 20
        );
    }
}
