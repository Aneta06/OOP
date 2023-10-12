package fruitstore;


import java.util.Objects;

public class Color {

    private String name;

    private int redRgb;
    private int greenRgb;
    private int blueRgb;

    public Color(int redRgb, int blueRgb, int greenRgb, String name) {

        int minValue = 0;
        int maxValue = 255;

        int[] rgbColours = new int[]{redRgb, greenRgb, blueRgb};

        for (int color : rgbColours) {
            if (color < minValue || color > maxValue) {
                throw new IllegalArgumentException("You have to put number between 0 - 255");

            }
        }


        this.name = name;
        this.redRgb = redRgb;
        this.greenRgb = greenRgb;
        this.blueRgb = blueRgb;

    }

    public String toString() {
        return name;
    }

    public String getName(){
        return name;
    }

    public int getBlueRgb() {
        return blueRgb;
    }

    public int getGreenRgb() {
        return greenRgb;
    }

    public int getRedRgb() {
        return redRgb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return redRgb == color.redRgb && greenRgb == color.greenRgb && blueRgb == color.blueRgb && Objects.equals(name, color.name);
    }


}



