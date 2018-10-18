package week4.task1;
/**
 * Lớp về Class Hoaqua
 *
 * @param XuatXu : xuất xứ của hoa quả
 * @param NgayNhap : ngày nhập của hoa quả
 */
public class CamThanhPhong extends Cam {
    private String XuatXu;
    private String NgayNhap;

    public String getXuatXu() {
        return XuatXu;
    }

    public void setXuatXu(String xuatXu) {
    XuatXu = xuatXu;
}

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        NgayNhap = ngayNhap;
    }

    @Override
    public String getFruitName() {
        return "Cam Thanh Phong";
    }
    public String NguonGoc(){
        if(this.XuatXu=="Viet. Nam") return "Hang` quoc' noi.";
        else return "Hang` ngoai. nhap.";
    }
}
