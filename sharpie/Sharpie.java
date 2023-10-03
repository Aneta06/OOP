package sharpie;

public class Sharpie {

    //We should know the followings about each sharpie:
    //color (which should be a string),
    //width (which will be a number) and the
    //inkAmount (another number)

    private String color;
    private int width;
    private int inkAmount = 100;



   public Sharpie (String color, int width){
       this.color = color;
       this.width = width;

   }

   public void use() {
        inkAmount -= 10;
   }

}

