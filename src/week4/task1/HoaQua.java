/**
 * Lớp về Class Hoaqua
 *
 * @param GiaCa : giá của hoa quả
 * @param Name : tên của hoa quả
 * @param Constructor Hoaqua : lấy tên hoa quả
 */
public abstract class HoaQua {
    private int GiaCa;
    private String Name;

    public int getGiaCa() {
        return GiaCa;
    }

    public void setGiaCa(int giaCa) {
        this.GiaCa = giaCa;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String ChatLuong(){
        if(this.GiaCa>130000) return "Chat' luong. tot'";
        else return "Chat' luong. kem'";
    }

    public HoaQua(){
        this.Name = this.getFruitName();
    }
    public abstract String getFruitName();
}
