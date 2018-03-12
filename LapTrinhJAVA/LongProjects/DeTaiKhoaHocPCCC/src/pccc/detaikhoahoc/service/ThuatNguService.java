package pccc.detaikhoahoc.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JOptionPane;

import pccc.detaikhoahoc.model.ThuatNgu;
import pccc.quanlytailieu.ui.QuanLyTaiLieuUI;

public class ThuatNguService extends SQLServerService {

	public int thuatNguQuanTrong(int soThuTu, int important) {
		try {
			String sql = "update thuatngu set isimportant=? where sothutu=?";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.setInt(1, important);
			preStatement.setInt(2, soThuTu);
			return preStatement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return -1;
	}

	public int themThuatNgu(Vector<ThuatNgu> vec) {
		int ret = 0;
		try {
			for (ThuatNgu tt : vec) {
				String sql = "insert into thuatngu values(?,?,?,?,?)";
				PreparedStatement preStatement = conn.prepareStatement(sql);
				preStatement.setInt(1, tt.getSoThuTu());
				preStatement.setString(2, tt.getTenThuatNgu());
				preStatement.setString(3, tt.getDinhNghiaThuatNgu());
				preStatement.setString(4, tt.getTaiLieuThuatNgu());
				preStatement.setInt(5, 0);
				if (preStatement.executeUpdate() > 0) {
					ret++;
				}
			}
			return ret;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return -1;
	}

	public Vector<ThuatNgu> timTheoTenThuatNgu(String ten) {
		Vector<ThuatNgu> vec = new Vector<>();
		ten = ten.toLowerCase();
		try {
			String sql = "select * from ThuatNgu WHERE TenThuatNgu like ?";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.setString(1, "%" + ten + "%");
			ResultSet result = preStatement.executeQuery();
			while (result.next()) {
				ThuatNgu tt = new ThuatNgu();
				tt.setSoThuTu(result.getInt(1));
				tt.setTenThuatNgu(result.getString(2));
				tt.setDinhNghiaThuatNgu(result.getString(3));
				tt.setTaiLieuThuatNgu(result.getString(4));
				vec.add(tt);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return vec;
	}

	public Vector<ThuatNgu> docToanBoThuatNgu() {
		Vector<ThuatNgu> vec = new Vector<>();
		try {
			String sql = "select * from ThuatNgu";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			// preStatement.setInt(1, 0);
			ResultSet result = preStatement.executeQuery();
			while (result.next()) {
				ThuatNgu tt = new ThuatNgu();
				tt.setSoThuTu(result.getInt(1));
				tt.setTenThuatNgu(result.getString(2));
				tt.setDinhNghiaThuatNgu(result.getString(3));
				tt.setTaiLieuThuatNgu(result.getString(4));
				tt.setIsImportant(result.getInt(5));
				vec.add(tt);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return vec;
	}

	public Vector<ThuatNgu> docToanBoThuatNguQuanTrong() {
		Vector<ThuatNgu> vec = new Vector<>();
		try {
			String sql = "select * from ThuatNgu where isimportant=?";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.setInt(1, 1);
			ResultSet result = preStatement.executeQuery();
			while (result.next()) {
				ThuatNgu tt = new ThuatNgu();
				tt.setSoThuTu(result.getInt(1));
				tt.setTenThuatNgu(result.getString(2));
				tt.setDinhNghiaThuatNgu(result.getString(3));
				tt.setTaiLieuThuatNgu(result.getString(4));
				tt.setIsImportant(result.getInt(5));
				vec.add(tt);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return vec;
	}
	public boolean ThemMoiThuatNgu(String tenThuatNgu, String dinhNghiaThuatNgu, String taiLieuThuatNgu) {
		try {
			String sql = "insert into thuatngu values(?,?,?,?,?)";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.setInt(1, ++QuanLyTaiLieuUI.size);
			preStatement.setString(2, tenThuatNgu);
			preStatement.setString(3, dinhNghiaThuatNgu);
			preStatement.setString(4, taiLieuThuatNgu);
			preStatement.setInt(5, 0);
			if(preStatement.executeUpdate()>0) {
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean capNhapThuatNgu(int soThuTu, String tenThuatNgu, String dinhNghia, String taiLieu) {
		try {
			String sql = "update thuatngu set tenthuatngu=?, dinhnghiathuatngu=?, tailieuthuatngu=? where sothutu=?";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.setString(1, tenThuatNgu);
			preStatement.setString(2, dinhNghia);
			preStatement.setString(3, taiLieu);
			preStatement.setInt(4, soThuTu+1);
			if(preStatement.executeUpdate()>0) {
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean xoaThuatNgu(int row) {
		try {
			String sql = "delete from thuatngu where SoThuTu=?";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.setInt(1, row);
			if(preStatement.executeUpdate()>0) {
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean kiemTraDangNhap(String strUsername, String strPassword) {
		try {
			String sql = "select * from DangNhap where Username=? and Password=?";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.setString(1, strUsername);
			preStatement.setString(2, strPassword);
			ResultSet result = preStatement.executeQuery();
			if (result.next()) {
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	

}
