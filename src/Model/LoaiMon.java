package Model;

public class LoaiMon {

    private String MaLoaiMon;
    private String TenLoaiMon;

    public LoaiMon() {
    }

    public LoaiMon(String MaLoaiMon, String TenLoaiMon) {
        this.MaLoaiMon = MaLoaiMon;
        this.TenLoaiMon = TenLoaiMon;
    }

    public String getMaLoaiMon() {
        return MaLoaiMon;
    }

    public void setMaLoaiMon(String MaLoaiMon) {
        this.MaLoaiMon = MaLoaiMon;
    }

    public String getTenLoaiMon() {
        return TenLoaiMon;
    }

    public void setTenLoaiMon(String TenLoaiMon) {
        this.TenLoaiMon = TenLoaiMon;
    }
}
