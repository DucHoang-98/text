package lab4;

public class SinhVienBiz extends SinhVienFpt {
	//Khai báo thuộc tính của sinhvienbiz
	private double diemMarketing;
	private double diemSales;
	private String nameFather;
	//Get và set các thuộc tính
	public double getDiemMarketing() {
		return diemMarketing;
	}
	public void setDiemMarketing(double diemMarketing) {
		this.diemMarketing = diemMarketing;
	}
	public double getDiemSales() {
		return diemSales;
	}
	public void setDiemSales(double diemSales) {
		this.diemSales = diemSales;
	}
	//Hàm khởi tạo không tham số
	public SinhVienBiz() {
		
	}
	//Hàm khởi tạo có tham số. Kế thừa hoTen và nghanh từ lớp sinhvienfpt
	public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales, String nameFather) {
		super(hoTen,nganh);
		this.diemMarketing = diemMarketing;
		this.diemSales = diemSales;
		this.nameFather = nameFather;
	}
	//Ghi đè hàm getDiem của lớp sinhvienfpt
	@Override
	public double getDiem() {
		return (2*diemMarketing + diemSales)/3;
	}
	//ghi đè và kế thừa hàm xuat của lớp sinhvienfpt
	public void xuat() {
		super.xuat();
		System.out.println("Điểm Marketing : " + diemMarketing);
		System.out.println("Điểm Sales : " + diemSales);
	}
	
	public void showNameFather() {
		System.out.println("Tên bố : " + nameFather);
	}
}
