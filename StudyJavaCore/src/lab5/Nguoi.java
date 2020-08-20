package lab5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private Date ngaySinh;
	private int soCMND;
	
	Scanner nhap = new Scanner(System.in);
	public Nguoi() {
		
	}
	
	public Nguoi(String hoTen, Date ngaySinh, int soCMND) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.soCMND = soCMND;
	}
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = chuyenStringDate(ngaySinh);
	}

	public int getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(int soCMND) {
		this.soCMND = soCMND;
	}

	public void nhap() {
		System.out.print("Nhập họ tên khách hàng : ");
		hoTen = nhap.nextLine();
		System.out.print("Nhập ngày sinh (dd-MM-yyyy) : ");
		String ns = nhap.nextLine();
		this.ngaySinh = chuyenStringDate(ns);
		System.out.print("Nhập 	số CMND : ");
		soCMND = Integer.parseInt(nhap.nextLine());
	}
	
	public void xuat() {
		System.out.println("Họ tên : " + hoTen);
		System.out.println("Ngày sinh : " + ngaySinh);
		System.out.println("CMND : " + soCMND);
	}
	
	public Date chuyenStringDate(String str) {
		Date ns = null;
	    SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
	    try {
	    	ns = s.parse(str);
	    }catch(Exception e){
	        System.out.println("Lỗi định dạng thời gian!");
	    }
	    return ns;
	}
}
