package caroppnew;

public class Car {

    //Vytvorime si promenny, ktere se tykaji auta jako znacka, typ (model), rok vyroby, barva, cena

   String make = "Chevrolet";
   String model = "Corvette";
   int year = 2020;
   String color = "blue";
   double price = 50000.00;

   // pak si vytvorime fce co s autem muzeme delat, jako je treba ridit a brzdit

    public void drive() {
        System.out.println("You drive a car");

    }

    public void brake() {
        System.out.println("You step on the brake");

    }

}





