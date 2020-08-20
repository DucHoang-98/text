package lab5;

import java.util.Date;

public class KhachSan extends Nguoi{
	private int soNgayTro;
	private String loaiPhong;
	private double giaPhong;
	
	public KhachSan() {
		
	}
	
	public KhachSan(String hoTen, Date ngaySinh, int soCMND, int soNgayTro, String loaiPhong, double giaPhong) {
		super(hoTen,ngaySinh,soCMND);
		this.soNgayTro = soNgayTro;
		this.loaiPhong = loaiPhong;
		this.giaPhong = giaPhong;
	}
	
	public int getSoNgayTro() {
		return soNgayTro;
	}

	public void setSoNgayTro(int soNgayTro) {
		this.soNgayTro = soNgayTro;
	}

	public String getLoaiPhong() {
		return loaiPhong;
	}

	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}

	public double getGiaPhong() {
		return giaPhong;
	}

	public void setGiaPhong(double giaPhong) {
		this.giaPhong = giaPhong;
	}
	
	public double tinhTien() {
		return soNgayTro*this.giaPhong;
	}
	
	public void nhap() {
		super.nhap();
		System.out.print("Nhập số ngày trọ : ");
		soNgayTro = Integer.parseInt(nhap.nextLine());
		System.out.print("Nhập loại phòng : ");
		loaiPhong = nhap.nextLine();
		System.out.print("Nhập giá phòng : ");
		giaPhong = Double.parseDouble(nhap.nextLine());
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Số ngày trọ : " + this.soNgayTro);
		System.out.println("Loại phòng : " + this.loaiPhong);
		System.out.println("Giá phòng : " + this.giaPhong + " đồng");
	}		
}
