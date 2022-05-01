package DAO;

import Helper.JdbcHelper;
import Model.HDCT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HDCTDAO {

    public void insert(HDCT model) {
        String sql = "INSERT INTO CTHOADON (MaCTHD, MaHD_FK, MaMon_FK,SoLuong,DonGia) VALUES (?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql, model.getMaCTHD(), model.getMaHD_FK(), model.getMaMon_FK(), model.getSoLuong(), model.getDonGia());
    }

    public void update(HDCT model) {
        String sql = "UPDATE CTHOADON SET MaHD_FK=?, MaMon_FK=?, SoLuong=?, DonGia=? where MaCTHD=?";
        JdbcHelper.executeUpdate(sql, model.getMaHD_FK(), model.getMaMon_FK(), model.getSoLuong(), model.getDonGia(), model.getMaCTHD());

    }

    public void delete(String hdct) {
        String sql = "DELETE FROM CTHOADON WHERE MaCTHD=?";
        JdbcHelper.executeUpdate(sql, hdct);
    }

    public List<HDCT> select1(String ma) {
        String sql = "SELECT * FROM CTHOADON where MaHD_FK=" + "'" + ma + "' ORDER BY SoLuong";
        return select(sql);
    }

    public List<HDCT> select() {
        String sql = "SELECT * FROM CTHOADON";
        return select(sql);
    }

    public List<HDCT> check(String mahd, String Mamon) {
        String sql = "SELECT * FROM CTHOADON where MaHD_FK='" + mahd + "' and MaMon_FK='" + Mamon + "'";
        return select(sql);
    }

    public List<HDCT> findById2(String manv) {
        String sql = "SELECT * FROM CTHOADON where MaHD_FK='" + manv + "'";
        return select(sql);
    }

    public HDCT findById(String manv) {
        String sql = "SELECT * FROM HOADON WHERE MaHD=?";
        List<HDCT> list = select(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<HDCT> select(String sql, Object... args) {
        List<HDCT> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HDCT model = readFromResultSet(rs);
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

    private HDCT readFromResultSet(ResultSet rs) throws SQLException {
        HDCT model = new HDCT();
        model.setMaCTHD(rs.getString("MaCTHD"));
        model.setMaMon_FK(rs.getString("MaMon_FK"));
        model.setMaHD_FK(rs.getString("MaHD_FK"));
        model.setDonGia(rs.getFloat("DonGia"));
        model.setSoLuong(rs.getInt("SoLuong"));
        return model;
    }
}
