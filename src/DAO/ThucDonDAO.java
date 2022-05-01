package DAO;

import Helper.JdbcHelper;
import Model.ThucDon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThucDonDAO {

    public void insert(ThucDon model) {
        String sql = "INSERT INTO THUCDON (MaMon, TenMon, Gia,HinhAnh, MaLoai_FK) VALUES (?,?,?,?,?)";
        JdbcHelper.executeUpdate(sql, model.getMaMon(), model.getTenMon(), model.getGia(), model.getHinh(), model.getMaLoaiMon());
    }

    public void update(ThucDon model) {
        String sql = "UPDATE THUCDON SET TenMon=?,Gia=?,HinhAnh=?,MaLoai_FK=? WHERE MaMon=?";
        JdbcHelper.executeUpdate(sql, model.getTenMon(), model.getGia(), model.getHinh(), model.getMaLoaiMon(), model.getMaMon());
    }

    public void delete(String MaMon) {
        String sql = "DELETE FROM THUCDON WHERE MaMon=?";
        JdbcHelper.executeUpdate(sql, MaMon);
    }

    public List<ThucDon> select() {
        String sql = "SELECT * FROM THUCDON";
        return select(sql);
    }

    public List<ThucDon> findByIdThucDon(String maloaimon) {
        String sql = "SELECT * FROM THUCDON where MaLoai_FK='" + maloaimon + "'";
        return select(sql);
    }

    public ThucDon findById(String manv) {
        String sql = "SELECT * FROM THUCDON WHERE MaMon=?";
        List<ThucDon> list = select(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<ThucDon> select(String sql, Object... args) {
        List<ThucDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    ThucDon model = readFromResultSet(rs);
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

    private ThucDon readFromResultSet(ResultSet rs) throws SQLException {
        ThucDon model = new ThucDon();
        model.setMaMon(rs.getString("MaMon"));
        model.setTenMon(rs.getString("TenMon"));
        model.setGia(rs.getFloat("Gia"));
        model.setHinh(rs.getString("HinhAnh"));
        model.setMaLoaiMon(rs.getString("MaLoai_FK"));
        return model;
    }
}
