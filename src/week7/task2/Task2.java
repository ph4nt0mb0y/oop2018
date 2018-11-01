package week7.task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    private static String getString() {
        if(1==2) return "1=2!!";
        else return null;
    }
    public void readfile(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        }
        catch (FileNotFoundException e){
            System.out.println("Error");
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    public static class Test {
        public static <T> T getVal() {
            return (T) "abc";
        }
    }
    public static void main(String[] args) {
        String s = getString();
        try {
            int length = s.length();
        }
        catch (NullPointerException e){
            System.out.println("Error");
            e.printStackTrace();
        }
        String[] str = new String[]{"1","2","3"};
        try{
            String s1 = str[6];
            System.out.println("s1 ="+s1);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
            e.printStackTrace();
        }
        try{
            int k = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println("Error");
            e.printStackTrace();
        }
        try{
           long i =2;
           int k = (int) i;
        }
        catch (ClassCastException e){
            System.out.println("Error");
            e.printStackTrace();
        }
<<<<<<< HEAD
        Task2 e = new Task2();
        e.readfile();
=======
        Task2 t = new Task2();
        t.readfile();
>>>>>>> a0248d747ff71b152d39241ca50105afc2b5daf3
        Object obj = Test.getVal();
        System.out.println(String.valueOf(Test.getVal()));
    }
}
