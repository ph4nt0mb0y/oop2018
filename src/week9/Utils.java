package week9;

import java.io.*;

public class Utils {
    public static String readContentFromFile(String path )
    {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(path));
            String s = br.readLine();
            while(s!=null){ System.out.println(s);
               s = br.readLine();
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
    public static void writeContentToFile(String path )
    {
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(path));
            String s = "QG_Nhok";
            bw.write(s);
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
    public static void writeToFile(String path )
    {
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(path,true));
            String s = "\nQG_Nhok";
            bw.write(s);
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
    public static File findFileByName(String folderPath ,String fileName )
    {
        String s = folderPath + "//" + fileName;
        File f = new File(s);
        if(f.exists()) return f;
        return null;
    }
}
