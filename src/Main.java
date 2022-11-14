import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        cat.makeSound();
        dog.makeSound();
        cat.eat("dogfood");
        dog.eat("fishes");

        cat.showMood(true);
        cat.showMood(false);

        dog.showMood(true);
        dog.showMood(false);
}



    }

