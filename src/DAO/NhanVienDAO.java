package DAO;

import Model.NhanVien;
import Helper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO {

    public void insert(NhanVien model) {
        String sql = "INSERT INTO NHANVIEN (MaNV, Password, TenNV, Hinh, CMND, DiaChi, DienThoai, NgaySinh, NgayVaoLam, VaiTro, ViTri) VALUES (?, ?, ? , ?, ?, ?, ?, ?, ? , ?, ?)";
        JdbcHelper.executeUpdate(sql, model.getMaNV(), model.getPassword(), model.getTenNV(), model.getHinh(), model.getCMND(), model.getDiaChi(), model.getDienThoai(), model.getNgaySinh(), model.getNgayVaoLam(), model.getVaiTro(), model.getViTri());
    }

    public void update(NhanVien model) {
        String sql = "UPDATE NhanVien SET Password=?, TenNV=?, Hinh=?, CMND=?, DiaChi=?,DienThoai=?,NgaySinh=?,NgayVaoLam=?,VaiTro=?,ViTri=? WHERE MaNV=?";
        JdbcHelper.executeUpdate(sql, model.getPassword(), model.getTenNV(), model.getHinh(), model.getCMND(), model.getDiaChi(), model.getDienThoai(), model.getNgaySinh(), model.getNgayVaoLam(), model.getVaiTro(), model.getViTri(), model.getMaNV());
    }

    public void updateTaikhoan(NhanVien model) {
        String sql = "UPDATE NhanVien SET MaNV=? WHERE MaNV=?";
        JdbcHelper.executeUpdate(sql, model.getMaNV(), model.getMaNV());

    }

    public void delete(String MaNV) {
        String sql = "DELETE FROM NHANVIEN WHERE MaNV=?";
        JdbcHelper.executeUpdate(sql, MaNV);
    }

    public List<NhanVien> select() {
        String sql = "SELECT * FROM NHANVIEN";
        return select(sql);
    }

    public NhanVien findById(String manv) {
        String sql = "SELECT * FROM NHANVIEN WHERE MaNV=?";
        List<NhanVien> list = select(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<NhanVien> select(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    NhanVien model = readFromResultSet(rs);
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

    public List<NhanVien> nhanvienus() {
        String sql = "SELECT * FROM NHANVIEN WHERE ViTri=1";
        return select(sql);
    }

    public List<NhanVien> nhanvienus1() {
        String sql = "SELECT * FROM NHANVIEN WHERE ViTri=1 and Username is null";
        return select(sql);
    }

    public List<NhanVien> nhanvien() {
        String sql = "SELECT * FROM NHANVIEN where VaiTro=0";
        return select(sql);
    }

    public List<NhanVien> admin() {
        String sql = "SELECT * FROM NHANVIEN where VaiTro=1";
        return select(sql);
    }

    private NhanVien readFromResultSet(ResultSet rs) throws SQLException {
        NhanVien model = new NhanVien();
        model.setMaNV(rs.getString("MaNV"));
        model.setTenNV(rs.getString("TenNV"));
        model.setPassword(rs.getString("Password"));
        model.setHinh(rs.getString("Hinh"));
        model.setCMND(rs.getString("CMND"));
        model.setDiaChi(rs.getString("DiaChi"));
        model.setDienThoai(rs.getString("DienThoai"));
        model.setNgaySinh(rs.getDate("NgaySinh"));
        model.setNgayVaoLam(rs.getDate("NgayVaoLam"));
        model.setVaiTro(rs.getBoolean("VaiTro"));
        model.setViTri(rs.getBoolean("ViTri"));
        return model;
    }
}
