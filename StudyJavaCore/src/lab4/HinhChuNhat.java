package lab4;

public class HinhChuNhat {
	//Khai báo các thuộc tính của hình chữ nhật
	private double chieuDai;
	private double chieuRong;
	
	//Get và set
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	//Hàm khởi tạo không tham số
	public HinhChuNhat() {
		
	}
	//Hàm khởi tạo có tham số
	public HinhChuNhat(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	//Hàm tính chu vi
	public double getChuVi() {
		return (chieuDai+chieuRong)*2;
	}
	//Hàm tính diện tích
	public double getDienTich() {
		return chieuDai*chieuRong;
	}
	//Hàm in ra màn hình kết quả
	public void xuat() {
		System.out.println("---Hình chữ nhật---");
		System.out.println("Chiều dài : " + chieuDai);
		System.out.println("Chiều rộng : " + chieuRong);
		System.out.println("Chu vi : " + getChuVi());
		System.out.println("Diện tích : " + getDienTich());
	}
	
}
