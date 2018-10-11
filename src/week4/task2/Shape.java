public class Shape {
    private String Color;
    private boolean filled;

    public Shape() {
        this.Color = "Red";
        this.filled = true;
    }

    public Shape(String color, boolean filled){
        this.Color=color;
        this.filled=filled;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "Color='" + Color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
