package week9;

import java.io.*;
import java.util.ArrayList;

public class Utils {
    static ArrayList<String> list = new ArrayList<>();
    public static String readContentFromFile(String path){
        BufferedReader br = null;
        try{
            System.out.println("Đọc file:");
            br = new BufferedReader(new FileReader(path));
            String s = br.readLine();
            while(s!=null){
               list.add(s);
               s = br.readLine();
            }
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try{
                br.close();
            }
            catch (NullPointerException e){
                e.printStackTrace();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        return null;
    }
    public static void writeContentToFile(String path){
        BufferedWriter br = null;
        try{
            System.out.println("Viết file:");
            br = new BufferedWriter(new FileWriter(path));
            for(int i=0;i<list.size();i++){
                    list.remove(i);
            }
            String s = "QG_Nhok";
            list.add(s);
            System.out.println(list.get(0));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try{
                br.close();
            }
            catch (IOException e){
               e.printStackTrace();
            }
        }
    }
    public static void writeToFile(String path){
        BufferedWriter bw = null;
        try{
            System.out.println("Viết file:");
            bw = new BufferedWriter(new FileWriter(path));
            String s = "QG_Nhok";
            list.add(s);
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try{
                bw.close();
            }
            catch (IOException e){
               e.printStackTrace();
            }
        }
    }
    public static File findFileByName(String folderPath, String fileName){
        String s = folderPath + "//" + fileName;
        File f = new File(s);
        if(f.exists()) return f;
        return null;
    }
}
