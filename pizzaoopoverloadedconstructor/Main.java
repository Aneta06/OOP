package pizzaoopoverloadedconstructor;

public class Main {

    public static void main(String[] args) {

       Pizza pizza = new Pizza("thicc crust", "tomato", "mozzarella", "pepperoni");
        System.out.println("Here are the ingredients fo your pizza: ");

        System.out.print(pizza.bread);
        System.out.print(pizza.sauce);
        System.out.print(pizza.cheese);
        System.out.print(pizza.topping);


    }
}
