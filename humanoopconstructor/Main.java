package humanoopconstructor;

public class Main {

    public static void main(String[] args) {


        // vytvorim si novyh cloveka a dam mu hodnoty podle toho co mam v konstruktour
        // Human s velkym H mam nazvany podle toho jak se jmenuje classa a myHumen to si pojmenuju jak chci
        // Muzu si vytvorit dalsiho novyho cloveka s jinejma parametrama


        Human myHuman = new Human ("Rick", 65,80);
        Human myHuman2 = new Human("Ben", 30, 80);

        System.out.println(myHuman.name); // timhle printuju name, co sem si zadala v classe Human

        System.out.println(myHuman2.weight);

       myHuman.eat();

       myHuman2.drink();

    }


}
