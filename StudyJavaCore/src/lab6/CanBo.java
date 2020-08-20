package lab6;

import java.util.Scanner;

public abstract class CanBo {
	private String hoTen;
	
	public CanBo() {
		
	}
	
	public CanBo(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public void xuat() {
		System.out.println("=====>Thông tin cán bộ<=====");
		System.out.println("Họ tên : " + hoTen);
	}
	
	abstract double tienPhuCap();
	
	abstract double tienLuong();
	
	
}
