package lab4;

public class HinhVuong extends HinhChuNhat{
	//Khởi tạo thuộc tính canh của hình vuông
	private double canh;

	//Get set thuộc tính
	public double getCanh() {
		return canh;
	}

	public void setCanh(double canh) {
		canh = canh;
	}
	//Hàm khởi tạo không tham số
	public HinhVuong() {
		
	}
	//Hàm khởi tạo có tham số
	public HinhVuong(double canh) {
		super(canh,canh);
	}
	//Tính chu vi hình vuông. Ghi đè hàm của hình chữ nhật
	public double getChuVi() {
		return canh*4;
	}
	//Tính diện tích hình vuông. Ghi đè hàm của hình chữ nhật
	public double getDienTich() {
		return canh*canh;
	}
	//Ghi đè hàm xuất
	public void xuat() {
		System.out.println("---Hình vuông---");
		System.out.println("Chiều dài : " + canh);
		System.out.println("Chu vi : " + getChuVi());
		System.out.println("Diện tích : " + getDienTich());
	}
}
