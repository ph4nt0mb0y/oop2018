package week4.task1;
/**
 * Lớp về Class Hoaqua
 *
 * @param Color : Màu sắc của hoa quả
 * @param SoLuong : Số lượng của hoa quả
 */
public class Cam extends HoaQua {
    private String Color;
    private int SoLuong;

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    @Override
    public String getFruitName() {
        return "Cam";
    }

    public String NhieuIt(){
        if(this.SoLuong>10) return "Nhieu`";
        else return "It'";
    }

    public static void main(String[] args) {
        Cam c = new Cam();
        System.out.println(c.getFruitName());
    }
}
