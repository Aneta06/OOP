package fruitstore;

import java.util.ArrayList;
import java.util.List;

public class FruitStore {

    private List<Fruit> fruitInStore = new ArrayList<>();


    public List<Fruit> getFruits(String colorName) {

        List<Fruit> fruitWithCoulourName = new ArrayList<>();
        for (Fruit f : fruitInStore) {

            if(f.getColorName().equals(colorName))
               fruitWithCoulourName.add(f);

        }

        return fruitWithCoulourName;
    }

    public List<Fruit> getFruits(Color color) {
        List<Fruit> fruitSameColor = new ArrayList<>();
        for (Fruit f : fruitInStore) {
            if (f.getColor().equals(color)) {
                fruitSameColor.add(f);

            }

        }

        return fruitSameColor;


    }

    public List<Fruit> getFruits() {
        return fruitInStore;
    }


    public int buyFruits(List<Fruit> fruits) {

        int sum = 0;
        for (Fruit fruit : fruits) {
            sum += fruit.getPrice();
            fruitInStore.remove(fruit);

        }

        return sum;
    }

    public void addFruit(Fruit fruit) {

        fruitInStore.add(fruit);


    }


}
