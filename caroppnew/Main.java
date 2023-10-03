package caroppnew;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car(); // Car s velkym C nas odkazuje na zalozlu Car a myCar jsme si vymysleli

        // tohle bysme nemeli vubec delat, vedle by ty promenny meli byt privet, viz car druhej projekt
        System.out.println(myCar.model); // takhle si vyjedu jakej model jsem zadala v zalozce car
        System.out.println(myCar.color);
        System.out.println(myCar.make);
        System.out.println(myCar.year);
        System.out.println(myCar.price);

        //kdyz si chci vyjet metodu co delam s autem

        myCar.drive();
        myCar.brake();
    }
}
