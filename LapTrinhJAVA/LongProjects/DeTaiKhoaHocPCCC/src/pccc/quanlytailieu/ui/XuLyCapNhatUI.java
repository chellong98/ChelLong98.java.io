package pccc.quanlytailieu.ui;

import javax.swing.JOptionPane;

import pccc.detaikhoahoc.service.ThuatNguService;

public class XuLyCapNhatUI extends XuLyThemMoiUI {

	public XuLyCapNhatUI(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void addEvents() {
		// TODO Auto-generated method stub
		super.addEvents();
	}

	@Override
	protected void addControls() {
		// TODO Auto-generated method stub
		super.addControls();
		btnOk.setText("Cập nhật");
	}

	@Override
	protected void xuLyXacNhan() {
		// TODO Auto-generated method stub
		int soThuTu = QuanLyTaiLieuUI.rowSelected;
		String tenThuatNgu = txtTenThuatNgu.getText();
		String dinhNghiaThuatNgu = txtDinhNghia.getText();
		String taiLieuThuatNgu = txtTaiLieu.getText();
		
		ThuatNguService service = new ThuatNguService();
		if(service.capNhapThuatNgu(soThuTu, tenThuatNgu, dinhNghiaThuatNgu, taiLieuThuatNgu)) {
			JOptionPane.showMessageDialog(null, "cập nhật thành công");
		} else {
			JOptionPane.showMessageDialog(null, "cập nhật không thành công");
		}
		dispose();
	}

	

}
