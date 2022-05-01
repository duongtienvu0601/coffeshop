package DAO;

import Helper.JdbcHelper;
import Model.Ban;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BanDAO {

    public void insert(Ban model) {
        String sql = "INSERT INTO BAN (MaBan,TenBan,MaKV_FK) VALUES (?, ?, ?)";
        JdbcHelper.executeUpdate(sql, model.getMaBan(), model.getTenBan(), model.getMaKV());
    }

    public void update(Ban model) {
        String sql = "UPDATE BAN SET TenBan=?,MaKV_FK=? WHERE MaBan=?";
        JdbcHelper.executeUpdate(sql, model.getTenBan(), model.getMaKV(), model.getMaBan());
    }

    public void delete(String MaloaiMon) {
        String sql = "DELETE FROM BAN WHERE MaBan=?";
        JdbcHelper.executeUpdate(sql, MaloaiMon);
    }

    public List<Ban> select() {
        String sql = "SELECT * FROM dbo.BAN order by MaKV_FK ASC";
        return select(sql);
    }

    public Ban findById(String manv) {
        String sql = "SELECT * FROM BAN WHERE MaBan=?";
        List<Ban> list = select(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<Ban> findByIdLoaiMon(String makv) {
        String sql = "SELECT * FROM BAN where MaKV_FK='" + makv + "'";
        return select(sql);
    }

    private List<Ban> select(String sql, Object... args) {
        List<Ban> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    Ban model = readFromResultSet(rs);
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

    private Ban readFromResultSet(ResultSet rs) throws SQLException {
        Ban model = new Ban();
        model.setMaBan(rs.getString("MaBan"));
        model.setTenBan(rs.getString("TenBan"));
        model.setMaKV(rs.getString("MaKV_FK"));
        return model;
    }
}
