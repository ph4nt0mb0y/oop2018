package week5_6;

import java.util.Random;

public class Circle extends Shape {
    private double radius;
    private final double pi = 3.14;
    Point p;

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public Circle() {
        p=new Point();
    }

    public Circle(double radius) {
         this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius= radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*pi;
    }
    public double getPerimeter(){
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                '}';
    }

    @Override
    public void MoveRandom() {
        super.MoveRandom();
    }
}
