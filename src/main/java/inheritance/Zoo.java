package inheritance;

public class Zoo {

    public static void main(String[] args) {

        Dog rocky = new Dog();
//        rocky.makeSound();
//        rocky.fetch();

        Animal sasha = new Dog();
//        sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch();
    }
}
