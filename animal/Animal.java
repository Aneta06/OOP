package animal;

public class Animal {

    //Create an Animal class
    //Every animal has a hunger value, which is a whole number
    //Every animal has a thirst value, which is a whole number

    private int hunger;
    private int thirst;


    public Animal() {
        this(50, 50);
    }

    public Animal(int hunger, int thirst) {
        this.hunger = hunger;
        this.thirst = thirst;
    }


    public void eat() {
        hunger -= 1;

    }

    public void drink() {
        thirst -= 1;
    }

    public void play() {
        hunger += 1;
        thirst += 1;

    }

}
