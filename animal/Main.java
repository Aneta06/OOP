package animal;

public class Main {

    public static void main(String[] args) {

        //When creating a new animal instance these values must be set to the default 50 value
        //Every animal can eat() which decreases its hunger by one
        //Every animal can drink() which decreases its thirst by one
        //Every animal can play() which increases both its hunger and thirst by one


        Animal one  = new Animal ();

        one.eat();
        one.drink();
        one.play();


    }
}
