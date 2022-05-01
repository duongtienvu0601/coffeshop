package Model;

public class ThucDon {

    private String MaMon;
    private String TenMon;
    private float Gia;
    private String MaLoaiMon;
    private String Hinh;

    public ThucDon() {
    }

    public ThucDon(String MaMon, String TenMon, float Gia, String MaLoaiMon, String Hinh) {
        this.MaMon = MaMon;
        this.TenMon = TenMon;
        this.Gia = Gia;
        this.MaLoaiMon = MaLoaiMon;
        this.Hinh = Hinh;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }

    public String getMaLoaiMon() {
        return MaLoaiMon;
    }

    public void setMaLoaiMon(String MaLoaiMon) {
        this.MaLoaiMon = MaLoaiMon;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

}
