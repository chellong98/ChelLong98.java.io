package pccc.detaikhoahoc.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import pccc.detaikhoahoc.model.ThuatNgu;

public class ThuatNguService extends SQLServerService {
	
	public int themThuatNgu(Vector<ThuatNgu> vec) {
		int ret = 0;
		try {
			for(ThuatNgu tt : vec) {
				String sql = "insert into thuatngu values(?,?,?,?,?)";
				PreparedStatement preStatement = conn.prepareStatement(sql);
				preStatement.setInt(1, tt.getSoThuTu());
				preStatement.setString(2, tt.getTenThuatNgu());
				preStatement.setString(3, tt.getDinhNghiaThuatNgu());
				preStatement.setString(4, tt.getTaiLieuThuatNgu());
				preStatement.setInt(5, 0);
				if(preStatement.executeUpdate()>0) {
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
		Vector<ThuatNgu>vec = new Vector<>();
		ten = ten.toLowerCase();
		try {
			String sql = "select * from ThuatNgu WHERE TenThuatNgu like ?";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.setString(1, "%"+ten+"%");
			ResultSet result = preStatement.executeQuery();
			while(result.next()) {
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
			String sql = "select * from ThuatNgu where isimportant=?";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.setInt(1, 0);
			ResultSet result = preStatement.executeQuery();
			while(result.next()) {
				ThuatNgu tt = new ThuatNgu();
				tt.setSoThuTu(result.getInt(1));
				tt.setTenThuatNgu(result.getString(2));
				tt.setDinhNghiaThuatNgu(result.getString(3));
				tt.setTaiLieuThuatNgu(result.getString(4));
				tt.setIsImportant(0);
				vec.add(tt);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return vec;
	}
	
}
