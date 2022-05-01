package Model;

public class Mon {

    private String MaMon;
    private String TenMon;
    private double Gia;
    private String Hinhanh;
    private String MaLoaiMon;

    @Override
    public String toString() {
        return this.MaMon;
    }

    public String getHinhanh() {
        return Hinhanh;
    }

    public void setHinhanh(String Hinhanh) {
        this.Hinhanh = Hinhanh;
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

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public String getMaLoaiMon() {
        return MaLoaiMon;
    }

    public void setMaLoaiMon(String MaLoaiMon) {
        this.MaLoaiMon = MaLoaiMon;
    }
}
