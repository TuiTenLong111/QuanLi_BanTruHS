/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.ChiTietDeThi_POJO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author TAN HUY
 */
public class ChiTietDeThi_DAO {  
    public static ArrayList<ChiTietDeThi_POJO> LayThongTinChiTietDeThi(String maDe) {
        ArrayList<ChiTietDeThi_POJO> dsctdt = new ArrayList<>();
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            connection = new DBConnect().GetConnect();
            pstmt = connection.prepareStatement("SELECT DISTINCT ThoiGianThi, ThoiGianBatDau, ThoiGianKetThuc FROM NV001.ChiTietDeThi WHERE MaDeThi = ?");

            // Kiểm tra maDe trước khi thực hiện truy vấn
            if (maDe == null || maDe.isEmpty()) {
                System.out.println("Mã đề không hợp lệ");
                return dsctdt;
            }

            pstmt.setString(1, maDe);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String thoiGianThi = rs.getString("ThoiGianThi");
                String thoiGianBatDau = rs.getString("ThoiGianBatDau");
                String thoiGianKetThuc = rs.getString("ThoiGianKetThuc");

                ChiTietDeThi_POJO cn = new ChiTietDeThi_POJO(thoiGianThi, thoiGianBatDau, thoiGianKetThuc);
                dsctdt.add(cn);
                System.out.println("Lấy dữ liệu chi tiết đề thi thành công!");
            }
        } catch (SQLException e) {
            System.out.println("Lấy dữ liệu chi tiết đề thi thất bại!");
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                // Không đóng connection ở đây để duy trì kết nối
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return dsctdt;
    }
}
