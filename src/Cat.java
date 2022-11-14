public class Cat extends Animal {


    @Override
    public void makeSound() {
        System.out.println("Miaow");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean mood) {
        if (mood){
            System.out.println("spinder");
        } else {
            System.out.println("hvæser");
        }
        System.out.println(mood? "spinder":"Hvæser");
        System.out.println("Katten er i "+(mood? "godt":"dårligt"+" humør!"));
    }

    public void erStørreEnd42(int tal){
        if(tal>42){
            System.out.println("Tal er for stor.");
        } else if (tal<42){
            System.out.println("Tal er for lille");
        }else {
            System.out.println("Du gætter korrekt!");
        }


    }



}

