package pizzaoopoverloadedconstructor;

public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    public Pizza(String bread1, String sauce1, String cheese1, String topping1){

        this.bread = bread1;
        this.cheese = cheese1;
        this.sauce = sauce1;
        this.topping = topping1;


    }

    public Pizza(String bread1, String sauce1, String cheese1) {

        this.bread = bread1;
        this.cheese = cheese1;
        this.sauce = sauce1;
    }
    public Pizza(String bread1, String sauce1) {

        this.bread = bread1;
        this.sauce = sauce1;

    }
}
