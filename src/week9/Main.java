package week9;

import java.io.File;

public class Main {
    private static final String path1 = "C:\\Github\\oop2018-hw-1\\oop2018-hw\\oop2018\\src\\week9\\Text1.txt";
    private static final String path2 = "C:\\Github\\oop2018-hw-1\\oop2018-hw\\oop2018\\src\\week9\\Text2.txt";
    private static final String folderPath = "C:\\Github\\oop2018-hw-1\\oop2018-hw\\oop2018\\src\\week9";
    private static String fileName = "Text1.txt";
    public static void main(String[] args) {
        Utils u = new Utils();
        u.readContentFromFile(path1);
        u.writeContentToFile(path1);
        u.readContentFromFile(path2);
        u.writeToFile(path2);
        File f = u.findFileByName(folderPath,fileName);
        if(f==null) System.out.println("ko tồn tại");
        else System.out.println(f.getAbsolutePath());
    }
}
