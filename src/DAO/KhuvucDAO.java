package DAO;

import Helper.JdbcHelper;
import Model.Khuvuc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KhuvucDAO {

    public void insert(Khuvuc model) {
        String sql = "INSERT INTO KHUVUC (MaKV, TenKV) VALUES (?, ?)";
        JdbcHelper.executeUpdate(sql, model.getMaKhuVuc(), model.getTenKhuVuc());
    }

    public void update(Khuvuc model) {
        String sql = "UPDATE KHUVUC SET TenKV=? WHERE MaKV=?";
        JdbcHelper.executeUpdate(sql, model.getTenKhuVuc(), model.getMaKhuVuc());
    }

    public void delete(String MaloaiMon) {
        String sql = "DELETE FROM KHUVUC WHERE MaKV=?";
        JdbcHelper.executeUpdate(sql, MaloaiMon);
    }

    public List<Khuvuc> select() {
        String sql = "SELECT * FROM KHUVUC";
        return select(sql);
    }

    public Khuvuc findById(String manv) {
        String sql = "SELECT * FROM KHUVUC WHERE MaKV=?";
        List<Khuvuc> list = select(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<Khuvuc> select(String sql, Object... args) {
        List<Khuvuc> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    Khuvuc model = readFromResultSet(rs);
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

    private Khuvuc readFromResultSet(ResultSet rs) throws SQLException {
        Khuvuc model = new Khuvuc();
        model.setMaKhuVuc(rs.getString("MaKV"));
        model.setTenKhuVuc(rs.getString("TenKV"));
        return model;
    }
}
