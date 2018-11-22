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
                string +=s;
                while(scanner.hasNext()){
                    String s0 = scanner.nextLine();
                    if(!s.contains("static")){
                        string +=s0;
                    }
                    else break;
                }
                list.add(string);
            }
        }
        return list;
    }
    public static List<String> getAllFunctions1(File path){
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
        List<String> test1 = getAllFunctions1(new File("C:\\Github\\oop2018-hw-1\\oop2018-hw\\oop2018\\src\\week9\\Utils.java"));
        for(int i=0;i<test1.size();i++){
            if(test1.get(i).equals(name)) return test.get(i);
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
