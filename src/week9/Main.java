package week9;

import java.io.File;

public class Main {
    private static final String path1 = "C:\\Github\\oop2018-hw-1\\oop2018-hw\\oop2018\\src\\week9\\Text1.txt";
    private static final String path2 = "C:\\Github\\oop2018-hw-1\\oop2018-hw\\oop2018\\src\\week9\\Text2.txt";
    private static final String folderPath = "C:\\Github\\oop2018-hw-1\\oop2018-hw\\oop2018\\src\\week9";
    private static String fileName1 = "Text3.txt";
    private static String fileName2 = "Text4.txt";
    public static void main(String[] args) {
        Utils u = new Utils();
        System.out.println("Đọc file:");
        u.readContentFromFile(path1);
        System.out.println("\nSau khi viết lại file:");
        u.writeContentToFile(path1);
        u.readContentFromFile(path1);
        System.out.println("\nĐọc file:");
        u.readContentFromFile(path2);
        System.out.println("\nSau khi viết tiếp file:");
        u.writeToFile(path2);
        u.readContentFromFile(path2);
        File f = u.findFileByName(folderPath,fileName1);
        if(f==null) System.out.println("\nko tồn tại");
        else System.out.println("\n"+f.getAbsolutePath());
    }
}
