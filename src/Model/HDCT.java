package Model;

public class HDCT {

    private String MaCTHD;
    private String MaHD_FK;
    private String MaMon_FK;
    private int SoLuong;
    private double DonGia;

    @Override
    public String toString() {
        return this.MaCTHD;
    }

    public String getMaCTHD() {
        return MaCTHD;
    }

    public void setMaCTHD(String MaCTHD) {
        this.MaCTHD = MaCTHD;
    }

    public String getMaHD_FK() {
        return MaHD_FK;
    }

    public void setMaHD_FK(String MaHD_FK) {
        this.MaHD_FK = MaHD_FK;
    }

    public String getMaMon_FK() {
        return MaMon_FK;
    }

    public void setMaMon_FK(String MaMon_FK) {
        this.MaMon_FK = MaMon_FK;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }
}
