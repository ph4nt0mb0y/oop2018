package week10;

import java.util.Random;

public class Task2{
    public static void main(String[] args){
        int n=5;
        float temp;
        Random rd = new Random();
        float array[] = new float[n];
        for(int i=0;i<n;i++){
            array[i] = rd.nextFloat()+rd.nextInt(50);
        }
        System.out.println("Mảng trước khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("\nMảng sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
