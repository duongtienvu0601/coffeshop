package DAO;

import Helper.JdbcHelper;
import Model.LoaiMon;
import Model.Mon;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MonDAO_ORDER {

    public void insert(Mon model) {
        String sql = "INSERT INTO THUCDON (MaMon, TenMon,Gia,HinhAnh,MaLoai_FK) VALUES (?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql, model.getMaMon(), model.getTenMon(), model.getGia(), model.getHinhanh(), model.getMaLoaiMon());
    }

    public void update(Mon model) {
        String sql = "UPDATE THUCDON SET TenMon=?,Gia=?,HinhAnh=?,MaLoaiMon=? WHERE MaMon=?";
        JdbcHelper.executeUpdate(sql, model.getTenMon(), model.getGia(), model.getHinhanh(), model.getMaLoaiMon(), model.getMaMon());
    }

    public void delete(String MaMon) {
        String sql = "DELETE FROM THUCDON WHERE MaMon=?";
        JdbcHelper.executeUpdate(sql, MaMon);
    }

    public List<Mon> select() {
        String sql = "SELECT * FROM THUCDON";
        return select(sql);
    }

    public List<Mon> findByIdLoaiMon(String maloaimon) {
        String sql = "SELECT * FROM THUCDON where MaLoai_FK='" + maloaimon + "'";
        return select(sql);
    }

    public List<Mon> findByIdMon(String maimon) {
        String sql = "SELECT * FROM THUCDON where MaMon='" + maimon + "'";
        return select(sql);
    }

    public List<Mon> findtenmon(String ten) {
        String sql = "SELECT * FROM THUCDON where TenMon='" + ten + "'";
        return select(sql);
    }

    public Mon findById(String manv) {
        String sql = "SELECT * FROM THUCDON WHERE MaMon=?";
        List<Mon> list = select(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<Mon> selectByKeyword(String tenmon) {
        String sql = "SELECT * FROM THUCDON WHERE TenMon LIKE '%"+tenmon+"%'";
        return select(sql);
    }

    private List<Mon> select(String sql, Object... args) {
        List<Mon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    Mon model = readFromResultSet(rs);
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

    private Mon readFromResultSet(ResultSet rs) throws SQLException {
        Mon model = new Mon();
        model.setMaMon(rs.getString("MaMon"));
        model.setTenMon(rs.getString("TenMon"));
        model.setGia(rs.getDouble("Gia"));
        model.setHinhanh(rs.getString("HinhAnh"));
        model.setMaLoaiMon(rs.getString("MaLoai_FK"));
        return model;
    }
}
