/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.*;
import POJO.*;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author TAN HUY
 */
public class CongNo_DAO {

    public static ArrayList<CongNo_POJO> LayThongTinCongNo() {
        ArrayList<CongNo_POJO> dscn = new ArrayList<CongNo_POJO>();
        try {
            String sql = "SELECT * FROM NV001.CONGNO";
            DBConnect conn = new DBConnect();
            conn.GetConnect();
            ResultSet rs = conn.executeQuery(sql);
//        // Kiểm tra trạng thái ResultSet
//        if (rs.isClosed()) {
//            System.out.println("ResultSet đã bị đóng.");
//            return dscn;
//        }
//
//        if (!rs.isBeforeFirst()) {
//            System.out.println("ResultSet không chứa dữ liệu.");
//            return dscn;
//        }
//        // Kiểm tra số lượng dòng trả về
//        System.out.println("So dong tra ve tu ResultSet: " + rs.getFetchSize());

            while (rs.next()) {
                //System.out.println("Vào được trong while!");
                String maCN = rs.getString("MaCongNo");
                String maHS = rs.getString("MaHS");
                Date ngayTaoCN = rs.getDate("NgayTaoCongNo");
                BigDecimal tienHocPhi = rs.getBigDecimal("TienHocPhi");
                BigDecimal tienAn = rs.getBigDecimal("TienAn");
                BigDecimal tienPhuThu = rs.getBigDecimal("TienPhuThu");
                BigDecimal tongCongNo = rs.getBigDecimal("TongCongNo");
                String trangThai = rs.getString("TrangThai");

                CongNo_POJO cn = new CongNo_POJO(maCN, maHS, ngayTaoCN.toString(), String.valueOf(tienHocPhi), String.valueOf(tienAn), String.valueOf(tienPhuThu), String.valueOf(tongCongNo), trangThai);

                dscn.add(cn);
                System.out.println("Lay du lieu cong no thanh cong!");
            }
        } catch (Exception e) {
            System.out.println("Lay du lieu cong no that bai!");
            e.printStackTrace();
        }
        return dscn;
    }

    public static int ThemXoaSuaCongNo(String sql) {
        int i = 0;
        try {

            DBConnect conn = new DBConnect();
            conn.GetConnect();
            i = conn.executeUpdate(sql);
//            conn.close();
            System.out.println("Chuc nang thuc hien thanh cong");
        } catch (Exception e) {
            System.out.println("Chuc nang thuc hien that bai");
        }
        return i;
    }

//    public static ArrayList<CongNo_POJO> LayThongTinCongNo1(String mahs) {
//        ArrayList<CongNo_POJO> dscn = new ArrayList<CongNo_POJO>();
//        try {
//            String sql = "SELECT * FROM NV001.CongNo WHERE MaHS='" + mahs + "'";
//            DBConnect conn = new DBConnect();
//            conn.GetConnect();
//            ResultSet rs = conn.executeQuery(sql);
//            while (rs.next()) {
//                //System.out.println("Vào được trong while!");
//                String maCN = rs.getString("MaCongNo");
//                String maHS = rs.getString("MaHS");
//                Date ngayTaoCN = rs.getDate("NgayTaoCongNo");
//                BigDecimal tienHocPhi = rs.getBigDecimal("TienHocPhi");
//                BigDecimal tienAn = rs.getBigDecimal("TienAn");
//                BigDecimal tienPhuThu = rs.getBigDecimal("TienPhuThu");
//                BigDecimal tongCongNo = rs.getBigDecimal("TongCongNo");
//                String trangThai = rs.getString("TrangThai");
//
//                CongNo_POJO cn = new CongNo_POJO(maCN, maHS, ngayTaoCN.toString(), String.valueOf(tienHocPhi), String.valueOf(tienAn), String.valueOf(tienPhuThu), String.valueOf(tongCongNo), trangThai);
//
//                dscn.add(cn);
//                System.out.println("Lay du lieu cong no thanh cong!");
//            }
//        } catch (Exception e) {
//            System.out.println("Lay du lieu cong no that bai!");
//            e.printStackTrace();
//        }
//        return dscn;
//    }
    public static boolean KiemTraTonTaiMaCongNo(String maCongNo) throws SQLException {
        boolean tonTai = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            DBConnect conn = new DBConnect();
            connection = conn.GetConnect();

            // Đếm số lượng bản ghi của MaDeThi
            String sql = "SELECT COUNT(*) FROM NV001.CONGNO WHERE MACONGNO = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maCongNo);
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

    public static ArrayList<CongNo> LayThongTin_CongNo() {
        ArrayList<CongNo> ds_congno = new ArrayList<CongNo>();
        try {
            String sql = "SELECT * FROM NV001.CONGNO";
            DBConnect conn = new DBConnect();
            conn.GetConnect();

            ResultSet rs = conn.executeQuery(sql);
            while (rs.next()) {
                String ma_congno = rs.getString("MaCongNo");
                String ma_hocsinh = rs.getString("MaHS");
                String ngayTaoCongNo = rs.getString("NgayTaoCongNo");
                String tienHocPhi = rs.getString("TienHocPhi");
                String tienAn = rs.getString("TienAn");
                String tienPhuThu = rs.getString("TienPhuThu");
                String tongCongNo = rs.getString("TongCongNo");
                String trangThai = rs.getString("TrangThai");

                Connection connection = conn.GetConnect(); // Lấy đối tượng Connection

                CongNo congno = new CongNo(ma_congno, ma_hocsinh, ngayTaoCongNo, tienHocPhi, tienAn, tienPhuThu, tongCongNo, trangThai);
                ds_congno.add(congno);
                System.out.println("Lay du lieu cong no thanh cong!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds_congno;

    }

    public static ArrayList<CongNo> TimKiemCongNo_TheoMaHocSinh(String maHocSinh) {
        ArrayList<CongNo> danhSachCongNo = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DBConnect.GetConnect();

            String query = "SELECT * FROM NV001.CONGNO WHERE MaHS = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, maHocSinh);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                // Đọc thông tin từ ResultSet và thêm vào danh sách
                CongNo congNo = new CongNo();
                congNo.setMaCongNo(resultSet.getString("MaCongNo"));
                congNo.setNgayTaoCongNo(resultSet.getString("NgayTaoCongNo"));
                congNo.setTienHocPhi(resultSet.getString("TienHocPhi"));
                congNo.setTienAn(resultSet.getString("TienAn"));
                congNo.setTienPhuThu(resultSet.getString("TienPhuThu"));
                congNo.setTongCongNo(resultSet.getString("TongCongNo"));
                congNo.setTrangThai(resultSet.getString("TrangThai"));
                congNo.setMaHocSinh(maHocSinh); // Đặt mã học sinh

                danhSachCongNo.add(congNo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {

        }

        return danhSachCongNo;
    }
    
    

}
