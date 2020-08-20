package lab4;

import java.util.Scanner;

public class KhachHang {
	//Khai báo thuộc tính của lớp khách hàng
	private String hoTen;
	private String soNha;
	private String maSoCongToDien;
	//get và set các thuộc tính
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSoNha() {
		return soNha;
	}
	public void setSoNha(String soNha) {
		this.soNha = soNha;
	}
	public String getMaSoCongToDien() {
		return maSoCongToDien;
	}
	public void setMaSoCongToDien(String maSoCongToDien) {
		this.maSoCongToDien = maSoCongToDien;
	}
	//Hàm khởi tạo không tham số.
	public KhachHang() {

	}

	//Hàm khởi tạo có tham số.
	public KhachHang(String hoTen, String soNha, String maSoCongToDien) {
		this.hoTen = hoTen;
		this.soNha = soNha;
		this.maSoCongToDien = maSoCongToDien;
	}
	
	public void xuat() {
		System.out.println("Họ và tên : " + getHoTen());
		System.out.println("Số nhà : " + getSoNha());
		System.out.println("Mã số công tơ điện : " + getMaSoCongToDien());
	}
	
}
