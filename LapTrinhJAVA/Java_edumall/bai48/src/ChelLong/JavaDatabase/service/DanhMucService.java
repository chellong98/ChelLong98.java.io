package ChelLong.JavaDatabase.service;

import ChelLong.JavaDatabase.model.DanhMuc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class DanhMucService extends SQLServerService {
	public Vector<DanhMuc> docToanBoDanhMuc() {
		Vector<DanhMuc> vec = new Vector<>();
		try {
			String sql ="select * from DanhMuc where isDelete=0";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while(result.next()) {
				DanhMuc dm = new DanhMuc();
				dm.setMaDM(result.getString(1));
				dm.setTenDM(result.getString(2));
				dm.setIsDelete(0);
				vec.add(dm);
			}
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return vec;
	}
}
