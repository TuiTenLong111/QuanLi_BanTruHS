/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import POJO.DBA_ROLE_PRIVS;
import java.sql.*;
import java.util.ArrayList;
import POJO.NhanVien_POJO;
import POJO.DBA_SYS_PRIVS;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import javax.crypto.Cipher;

/**
 *
 * @author Admin
 */
public class NhanVien_DAO {
      public static ArrayList<NhanVien_POJO> LayThongTinNhanVien() {
        ArrayList<NhanVien_POJO> dsnv = new ArrayList<NhanVien_POJO>();

        try {
            String sql = "SELECT * FROM NV001.NHANVIEN";
            DBConnect conn = new DBConnect();
            conn.GetConnect();           
            ResultSet rs = conn.executeQuery(sql);           
            while (rs.next()) {  
                String maNV = rs.getString("MaNV");
                String tenNV = rs.getString("TenNV");
                String gioiTinh = rs.getString("GioiTinh");
                Date ngaySinh = rs.getDate("NgaySinh");
                String chucvu = rs.getString("ChucVu");
                String diaChi = rs.getString("DiaChi");
                String email = rs.getString("Email"); 
                String sdt = rs.getString("SoDT");
                String trinhdo = rs.getString("TrinhDo");
                String chuyenmon = rs.getString("ChuyenMon");
                String noidaotao = rs.getString("NoiDaoTao");
                int namtotnghiep = rs.getInt("NamTotNghiep");
                byte[] hinhanh = rs.getBytes("HinhAnh");

                NhanVien_POJO nv = new NhanVien_POJO(maNV, tenNV, gioiTinh, ngaySinh.toString(), chucvu, diaChi, email, sdt, trinhdo, chuyenmon, noidaotao, String.valueOf(namtotnghiep), Base64.getEncoder().encodeToString(hinhanh));
                dsnv.add(nv);
                System.out.println("Lay du lieu nhan vien thanh cong!");
            }             
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsnv;
    }
      
     public static ArrayList<NhanVien_POJO> TimKiemNhanVien(String manv) {
        ArrayList<NhanVien_POJO> dsnv = new ArrayList<NhanVien_POJO>();

        try {
            String sql = "SELECT * FROM NV001.NHANVIEN WHERE UPPER(MaNV) = UPPER('" + manv + "')";

            DBConnect conn = new DBConnect();
            conn.GetConnect();           
            ResultSet rs = conn.executeQuery(sql);           
            while (rs.next()) {  
                String maNV = rs.getString("MaNV");
                String tenNV = rs.getString("TenNV");
                String gioiTinh = rs.getString("GioiTinh");
                Date ngaySinh = rs.getDate("NgaySinh");
                String chucvu = rs.getString("ChucVu");
                String diaChi = rs.getString("DiaChi");
                String email = rs.getString("Email"); 
                String sdt = rs.getString("SoDT");
                String trinhdo = rs.getString("TrinhDo");
                String chuyenmon = rs.getString("ChuyenMon");
                String noidaotao = rs.getString("NoiDaoTao");
                int namtotnghiep = rs.getInt("NamTotNghiep");
                byte[] hinhanh = rs.getBytes("HinhAnh");

                NhanVien_POJO nv = new NhanVien_POJO(maNV, tenNV, gioiTinh, ngaySinh.toString(), chucvu, diaChi, email, sdt, trinhdo, chuyenmon, noidaotao, String.valueOf(namtotnghiep), Base64.getEncoder().encodeToString(hinhanh));
                dsnv.add(nv);
                System.out.println("Lay du lieu nhan vien thanh cong!");
            }             
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsnv;
    }

    
    public static ArrayList<DBA_SYS_PRIVS> LayThongTinNhanVien2() {
        ArrayList<DBA_SYS_PRIVS> dsp = new ArrayList<DBA_SYS_PRIVS>();
        try {          
            String sql = "SELECT GRANTEE, OWNER, TABLE_NAME, GRANTOR, PRIVILEGE FROM USER_TAB_PRIVS WHERE GRANTEE != 'SYS' AND PRIVILEGE IN ('SELECT', 'UPDATE', 'DELETE', 'INSERT')";
            DBConnect conn = new DBConnect();
            conn.GetConnect();           
            ResultSet rs = conn.executeQuery(sql);           
            while (rs.next()) {  
            String GRANTEE = rs.getString("GRANTEE");
            String OWNER = rs.getString("OWNER");
            String TABLE_NAME = rs.getString("TABLE_NAME");
            String GRANTOR = rs.getString("GRANTOR");
            String PRIVILEGE = rs.getString("PRIVILEGE");

            DBA_SYS_PRIVS ds = new DBA_SYS_PRIVS(GRANTEE, OWNER, TABLE_NAME, GRANTOR, PRIVILEGE);
            dsp.add(ds);
            System.out.println("Lay du lieu nhan vien thanh cong!");
        }             
        } catch (Exception e) {
            //System.err.println("Lay du lieu nhan vien that bai!");
            e.printStackTrace();
        }
        return dsp;
    }
    public static ArrayList<DBA_ROLE_PRIVS> LayThongTinQuyen() {
        ArrayList<DBA_ROLE_PRIVS> dsp = new ArrayList<DBA_ROLE_PRIVS>();
        try {          
            String sql = "SELECT * FROM DBA_ROLE_PRIVS WHERE GRANTEE LIKE 'NV%'";
            DBConnect conn = new DBConnect();
            conn.GetConnect();           
            ResultSet rs = conn.executeQuery(sql);           
            while (rs.next()) {  
            String GRANTEE = rs.getString("GRANTEE");
            String GRANTED_ROLE = rs.getString("GRANTED_ROLE");
            String ADMIN_OPTION = rs.getString("ADMIN_OPTION");
            String DELEGATE_OPTION = rs.getString("DELEGATE_OPTION");
            String DEFAULT_ROLE = rs.getString("DEFAULT_ROLE");
            String COMMON = rs.getString("COMMON");

            DBA_ROLE_PRIVS ds = new DBA_ROLE_PRIVS(GRANTEE, GRANTED_ROLE, ADMIN_OPTION, DELEGATE_OPTION, DEFAULT_ROLE,COMMON);
            dsp.add(ds);
            System.out.println("Lay du lieu nhan vien thanh cong!");
        }             
        } catch (Exception e) {
            //System.err.println("Lay du lieu nhan vien that bai!");
            e.printStackTrace();
        }
        return dsp;
    }
    public static int ThemXoaSuaNhanVien(String sql) {
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
        // Giải mã dữ liệu bằng khóa riêng tư
    public static String decrypt_RSA(String encryptedData, PrivateKey privateKey) {
        try {
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] encryptedBytes = Base64.getDecoder().decode(encryptedData);
            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
            return new String(decryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    // Phân tích khóa riêng tư từ chuỗi Base64
    public static PrivateKey decodePrivateKey_RSA(String privateKeyBase64) {
        try {
            byte[] privateKeyBytes = Base64.getDecoder().decode(privateKeyBase64);
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(privateKeyBytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            return keyFactory.generatePrivate(keySpec);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void capQuyen(String action, String tenBang, String manv) {
        String sql = "{CALL NV001.CapQuyenUser('" + tenBang + "','" + manv + "','" + action + "')}";
        if (ThemXoaSuaNhanVien(sql) == 0) {
            System.out.println("Chuc nang thuc hien thanh cong");
        }
    }
    public static void thuHoiQuyen(String action, String tenBang, String manv) {
        String sql = "{CALL NV001.ThuHoiQuyenUser('" + tenBang + "','" + manv + "','" + action + "')}";
        if (ThemXoaSuaNhanVien(sql) == 0) {
            System.out.println("Chuc nang thuc hien thanh cong");
        }
    }
}
