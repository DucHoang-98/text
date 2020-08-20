package lab4;

public class SinhVienIT extends SinhVienFpt{
	//Khai báo các thuộc tính của sinhvienIT
	private double diemJava;
	private double diemCss;
	private double diemHtml;
	private String nameMyLove;
	//Get và set các thuộc tính
	public double getDiemJava() {
		return diemJava;
	}
	public void setDiemJava(double diemJava) {
		this.diemJava = diemJava;
	}
	public double getDiemCss() {
		return diemCss;
	}
	public void setDiemCss(double diemCss) {
		this.diemCss = diemCss;
	}
	public double getDiemHtml() {
		return diemHtml;
	}
	public void setDiemHtml(double diemHtml) {
		this.diemHtml = diemHtml;
	}
	//Hàm khởi tạo không tham số
	public SinhVienIT() {
		
	}
	//Hàm khởi tạo có tham số, kế thừa thuộc tính hoTen của lớp sinhvienfpt 
	public SinhVienIT(String hoTen, String nghanh, double diemJava, double diemCss, double diemHtml, String nameMyLove) {
		super(hoTen, nghanh);
		this.diemJava = diemJava;
		this.diemCss = diemCss;
		this.diemHtml = diemHtml;
		this.nameMyLove = nameMyLove;
	}
	//Ghi đè hàm getDiem của sinhvienfpt
	@Override
	public double getDiem() {
		return (2*diemJava + diemCss + diemHtml)/4;
	}
	//Ghi đè và kế thừa hàm xuất của sinhvienfpt. Kế thừa hàm xuất
	public void xuat() {
		super.xuat();
		System.out.println("Điểm Java : " + diemJava);
		System.out.println("Điểm Css : " + diemCss);
		System.out.println("Điểm Html : " + diemHtml);
	}
	
	public void showNameMyLove() {
		System.out.println("Tên người yêu : " + nameMyLove);
	}
}
	