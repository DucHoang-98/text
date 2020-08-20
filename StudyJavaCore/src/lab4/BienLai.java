package lab4;

import java.util.Scanner;

public class BienLai extends KhachHang{
	
	//Khai báo thuộc tính có trong biên lai
	private int chiSoMoi;
	private int chiSoCu;
	
	//get và set các thuộc tính
	public int getChiSoMoi() {
		return chiSoMoi;
	}
	public void setChiSoMoi(int chiSoMoi) {
		this.chiSoMoi = chiSoMoi;
	}
	public int getChiSoCu() {
		return chiSoCu;
	}
	public void setChiSoCu(int chiSoCu) {
		this.chiSoCu = chiSoCu;
	}
	
	//Hàm khởi tạo không tham số
	public BienLai() {
		
	}
	//Hàm khởi tạo có tham số
	public BienLai(String hoTen, String soNha, String maSoCongToDien, int chiSoCu, int chiSoMoi) {
		super(hoTen,soNha,maSoCongToDien);
		this.chiSoCu = chiSoCu;
		this.chiSoMoi = chiSoMoi;
	}
	
	//Hàm tính tiền điện
	public double tienDienTheoThang() {
		return (chiSoMoi - chiSoCu) * 750;
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Chỉ số mới : " + getChiSoMoi());
		System.out.println("Chỉ số cũ : " + getChiSoCu());
		System.out.println("Tiền điện : " + tienDienTheoThang());
	}
}
