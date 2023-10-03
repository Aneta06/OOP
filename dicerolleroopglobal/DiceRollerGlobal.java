package dicerolleroopglobal;

import java.util.Random;

public class DiceRollerGlobal {

    Random random;
    int number;

    public DiceRollerGlobal(){
        random = new Random();
        roll();

    }

    public void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }



}
