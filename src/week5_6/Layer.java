/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;


import java.util.ArrayList;

/**
 *
 */
public class Layer extends Diagram {
    private int[] a;
    private int[] b;
    private int[] r;
    ArrayList<Shape> list = new ArrayList<>();

    public static final int MAX =30;
    public Layer() {

        Shape c1 = new Circle(70, 1000, 500);
        Shape c2 = new Circle(100, 0, 0);
        Shape c3= new Circle(50, 300, 500);
        Shape c4= new Circle(100, 0, 1000);
        Shape t1= new Triangle(20,20,40,40,60,60);
        Shape r1= new Rectangle();
        Shape s1= new Square();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(t1);
        list.add(r1);
        list.add(s1);
    }





    public void delTriangle() {
        for (int i = 0; i<list.size(); i++) {
            if (list.get(i) instanceof Triangle) {
                list.remove(i);
            }

        }
    }

     public void delCircle() {
         for (int i = 0; i<list.size(); i++) {
             if (list.get(i) instanceof Circle) {
                 list.remove(i);
             }

         }
    }
    public void print() {
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args) {
        Layer layer = new Layer();
        layer.delTriangle();
        layer.print();
    }
}
