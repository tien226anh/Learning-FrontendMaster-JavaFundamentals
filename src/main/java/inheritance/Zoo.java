package inheritance;

public class Zoo {

    public static void main(String[] args) {

        Dog rocky = new Dog();
        feed(rocky);
//        rocky.makeSound();
//        rocky.fetch();

        Animal sasha = new Dog();
//        sasha.makeSound();
        if (sasha instanceof Dog sashaTheDog) {
            sashaTheDog.fetch();
        }

//        boolean isDog = sasha instanceof Dog;
//        System.out.println(isDog);

        sasha = new Cat();
//        sasha.makeSound();
//        ((Cat) sasha).scratch();
        var newCat = ((Cat) sasha);
        newCat.scratch();
        feed(sasha);
    }

    public static void feed(Animal animal) {

        if (animal instanceof Dog) {
            System.out.println("Here is dog food");
        } else if (animal instanceof Cat) {
            System.out.println("Here is cat food");
        }
    }
}
