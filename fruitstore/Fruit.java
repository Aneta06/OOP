package fruitstore;

public class Fruit {

    private Color color;
    private String name;


    private int price;

    public Fruit(Color color, String name, int price) {

        if (price < 0) {
            throw new IllegalArgumentException();

        }

        this.color = color;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return color + " " + name;
    }

    public String getColorName() {
        return this.color.getName();
    }
    public Color getColor() {
        return this.color;
    }

    public int getPrice() {
        return price;
    }

}
