public class Cat extends Animal {


    @Override
    public void makeSound() {
        System.out.println("Miaow");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }


}

