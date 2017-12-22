package ChelLong.JavaDatabase.service;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import ChelLong.JavaDatabase.model.SanPham;

public class SanPhamService extends SQLServerService {
	
	public int luuSanPham(SanPham sp) {
		try {
			String sql = "insert into sanpham values(?,?,?,?,?,?)";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.setString(1, sp.getMaSp());
			preStatement.setString(2, sp.getTenSp());
			preStatement.setInt(3, sp.getSoLuong());
			preStatement.setInt(4, sp.getDonGia());
			preStatement.setString(5, sp.getMaDanhMuc());
			preStatement.setInt(6, 0);
			return preStatement.executeUpdate(); //trả về số dòng bị ảnh hưởngt
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return -1;
	}
	
	public ArrayList<SanPham> docSanPhamTheoDanhMuc(String madm) {
		ArrayList<SanPham> dssp = new ArrayList<>();
		try {
			//hỏi thầy là nếu như có 1 bảng dữ liệu như trong word, viết câu truy vấn để lấy ra các tên thuật ngữ chứa chũ cháy thì phải làm sao?
			String sql = "select * from sanpham where maDanhMuc=? and isdelete=0";
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.setString(1, madm);
			
			ResultSet result = preStatement.executeQuery();
			while(result.next()) {
				SanPham sp = new SanPham();
				sp.setMaSp(result.getString(1));
				sp.setTenSp(result.getString(2));
				sp.setSoLuong(result.getInt(3));
				sp.setDonGia(result.getInt(4));
				sp.setMaDanhMuc(result.getString(5));
				sp.setIsDelete(0);
				dssp.add(sp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dssp;
	}
}
