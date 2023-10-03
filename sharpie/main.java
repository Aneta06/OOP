package sharpie;

public class main {

    public static void main(String[] args) {

        //We need to specify the color and the width at creation
        //Every sharpie is created with a default inkAmount value: 100
        //We can use() the sharpie objects: using it decreases inkAmount by 10
        //Při vytváření musíme určit barvu a šířku
        //Každý Sharpie je vytvořen s výchozí hodnotou inkAmount: 100
        //Můžeme použít() objekty sharie: jeho použití sníží množství inkoustu o 10

        Sharpie one = new Sharpie("blue", 30);
        one.use();

    }
}
