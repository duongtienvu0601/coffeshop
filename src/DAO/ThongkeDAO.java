package DAO;

import Helper.JdbcHelper;
import Model.HoaDon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThongkeDAO {

    public List<HoaDon> select1(int thang, int nam) {
        String sql = "select Sum(Tongtien)as Tongtien,count(Tongtien) as soluong from HOADON where Tongtien !=0 and MONTH(NgayHD)='" + thang + "' and YEAR(NgayHD)='" + nam + "'";
        return select(sql);
    }

    public List<HoaDon> findngay(String c1, String c2) {
        String sql = "select * from HOADON where Tongtien !=0 and NgayHD between '" + c1 + "' and '" + c2 + "'";
        return select1(sql);
    }

    public List<HoaDon> selectslhn(int ngay, int thang, int nam) {
        String sql = "select Sum(Tongtien)as Tongtien,count(Tongtien) as soluong from HOADON where Tongtien !=0 and DAY(NgayHD)='" + ngay + "' and MONTH(NgayHD)='" + thang + "' and YEAR(NgayHD)='" + nam + "'";
        return select(sql);
    }

    public List<HoaDon> selecthoadonhomnay(int ngay, int thang, int nam) {
        String sql = "select * from HOADON where Tongtien !=0 and DAY(NgayHD)='" + ngay + "' and MONTH(NgayHD)='" + thang + "' and YEAR(NgayHD)='" + nam + "'";
        return select1(sql);
    }

    private List<HoaDon> select1(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDon model = readFromResultSet1(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private List<HoaDon> select(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDon model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private HoaDon readFromResultSet(ResultSet rs) throws SQLException {
        HoaDon model = new HoaDon();
        model.setTongtien(rs.getFloat("Tongtien"));
        model.setSoluong(rs.getInt("soluong"));
        return model;
    }

    private HoaDon readFromResultSet1(ResultSet rs) throws SQLException {
        HoaDon model = new HoaDon();
        model.setMahd(rs.getString("MaHD"));
        model.setMaban(rs.getString("MaBan_FK"));
        model.setManv(rs.getString("MaNV_FK"));
        model.setTongtien(rs.getFloat("TongTien"));
        model.setTrangthai(rs.getBoolean("Trangthai"));
        model.setNgaylap(rs.getDate("NgayHD"));
        return model;
    }
}
