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
            System.out.println("hv�ser");
        }
        System.out.println(mood? "spinder":"Hv�ser");
        System.out.println("Katten er i "+(mood? "godt":"d�rligt"+" hum�r!"));
    }

    public void erSt�rreEnd42(int tal){
        if(tal>42){
            System.out.println("Tal er for stor.");
        } else if (tal<42){
            System.out.println("Tal er for lille");
        }else {
            System.out.println("Du g�tter korrekt!");
        }


    }



}

