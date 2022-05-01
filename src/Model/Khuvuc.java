package Model;

public class Khuvuc {

    private String MaKhuVuc;
    private String TenKhuVuc;

    @Override
    public String toString() {
        return this.MaKhuVuc;
    }

    public String getMaKhuVuc() {
        return MaKhuVuc;
    }

    public void setMaKhuVuc(String MaKhuVuc) {
        this.MaKhuVuc = MaKhuVuc;
    }

    public String getTenKhuVuc() {
        return TenKhuVuc;
    }

    public void setTenKhuVuc(String TenKhuVuc) {
        this.TenKhuVuc = TenKhuVuc;
    }
}
