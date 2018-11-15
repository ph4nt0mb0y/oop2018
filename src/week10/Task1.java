package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static List<String> getAllFunctions(File path){
        List<String> list = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(scanner.hasNext()){
            String string = "";
            String s = scanner.nextLine();
            if(s.contains("static")){
                    for (String w : s.split("\\s")) {
                        if (w.contains("(")||w.contains(",")||w.contains(")")) string +=w;
                    }
                }
            if(string!="") list.add(string);
        }
        return list;
    }
    public static String findFunctionByName(String name){
        List<String> test = getAllFunctions(new File("C:\\Github\\oop2018-hw-1\\oop2018-hw\\oop2018\\src\\week9\\Utils.java"));
        for(int i=0;i<test.size();i++){
            if(test.get(i).equals(name)) return name;
        }
        return "Không tồn tại!!!!!";
    }
    public static void main(String[] args){
        final String name1 = "1";
        final String name2  = "findFileByName(String,String)";
        List<String> test = getAllFunctions(new File("C:\\Github\\oop2018-hw-1\\oop2018-hw\\oop2018\\src\\week9\\Utils.java"));
        System.out.println("Y/c 1:");
        for(String s:test){
            System.out.println(s);
        }
        System.out.println("Y/c 2:");
        System.out.println(findFunctionByName(name2));
    }
}
