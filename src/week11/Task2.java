package week11;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Task2 {
    public static<T extends Comparable> T Max(ArrayList<T> list){
        T MAX = list.get(0);
        for(int i=0;i<list.size();i++){
            if(MAX.compareTo(list.get(i))<0) MAX = list.get(i);
        }
        return MAX;
    }

    public static void main(String[] args) {
        ArrayList<Byte> list = new ArrayList<>();
        list.add((byte) 1);
        list.add((byte) 35);
        list.add((byte) 91);
        list.add((byte) 5);
        list.add((byte) 3);
        list.add((byte) 68);
        System.out.println(Max(list));
    }
}
