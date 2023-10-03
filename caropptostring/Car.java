package caropptostring;

public class Car {


    // tady bych mela pouzivat privet prde tema promenejma
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";

    public String toString(){ // tady nemusim mit nic v zavorce, protoze jsem mezi stejnejma chlupatejma zavorkama a
                                // ma to pristup k vecem nahoru a bere si to rovnou odtamtud


        String myString = make + "\n" + model + "\n" + color + "\n" + year;
        return myString;
    }

}
