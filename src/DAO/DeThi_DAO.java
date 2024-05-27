/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author SONDAY
 */
import POJO.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DeThi_DAO {

    public static ArrayList<DeThi> LayThongTin_DeThi() {
        ArrayList<DeThi> ds_dethi = new ArrayList<DeThi>();
        try {
            String sql = "SELECT * FROM NV001.DETHI";
            DBConnect conn = new DBConnect();
            conn.GetConnect();

            ResultSet rs = conn.executeQuery(sql);
            while (rs.next()) {
                String madethii = rs.getString("MaDeThi");
                String ngaysoann = rs.getString("NgaySoanDe");
                String soluongcauhoii = rs.getString("SoLuongCauHoi");
                String trangthaii = rs.getString("TrangThai");
                String magvv = rs.getString("MaNV");
                String mamhh = rs.getString("MaMH");

                Connection connection = conn.GetConnect(); // Lấy đối tượng Connection

                DeThi dethi = new DeThi(madethii, ngaysoann, soluongcauhoii, trangthaii, magvv, mamhh);
                ds_dethi.add(dethi);
                System.out.println("Lay du lieu de thi thanh cong!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds_dethi;
    }

    public static boolean KiemTraTonTaiMaDeThi(String maDeThi) throws SQLException {
        boolean tonTai = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            DBConnect conn = new DBConnect();
            connection = conn.GetConnect();

            // Đếm số lượng bản ghi của MaDeThi
            String sql = "SELECT COUNT(*) FROM NV001.DETHI WHERE MADETHI = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maDeThi);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                if (count > 0) {
                    tonTai = true;
                }
            }
        } finally {

        }

        return tonTai;
    }

    public static String get_MaDeThi_CuoiCung() {
        String lastMaDeThi = null;
        try {
            String sql = "SELECT MaDeThi FROM (SELECT MaDeThi FROM NV001.DETHI ORDER BY MaDeThi DESC) WHERE ROWNUM = 1";
            DBConnect conn = new DBConnect();
            conn.GetConnect();
            ResultSet rs = conn.executeQuery(sql);
            if (rs.next()) {
                lastMaDeThi = rs.getString("MaDeThi");
                if (lastMaDeThi != null) {
                    lastMaDeThi = lastMaDeThi.trim();
                }
            }
        } catch (Exception e) {
            System.err.println("Không thể lấy dữ liệu mã đề thi cuối cùng: " + e.getMessage());
        }
        return lastMaDeThi;
    }

}
