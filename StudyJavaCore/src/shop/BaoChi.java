package shop;

//Kế thừa lớp cha HangHoa, vì lớp cha là có hàm trừu tượng nên phải khai báo abstract.
public class BaoChi extends HangHoa{
	//Khai báo thuộc tính của lớp báo chí.
	private double soTrang;
	
	//Khai báo hàm không tham số.
	public BaoChi() {
		
	}
	
	//Khai báo hàm có tham số. Khai báo lại và kế thừa các thuộc tính của lớp cha thông qua hàm super.
	public BaoChi(String maHH, String tenHH, String donViTinh, double donGia, double soLuong, double soTrang) {
		super(maHH,tenHH,donViTinh,donGia,soLuong);
		this.soTrang = soTrang;
	}
	//Cũng như lớp cha, ta gọi hàm get và set để truyền và lấy giá trị
	public double getTrongLuong() {
		return soTrang;
	}

	public void setTrongLuong(double trongLuong) {
		this.soTrang = trongLuong;
	}
	
	//Nhập thông tin của lớp báo chí. Ghi đè hàm nhập của lớp cha và kế thừa hàm nhập của lớp cha nên ta gọi hàm super();
	public void nhap() {
		super.nhap();
		System.out.print("Nhập số trang báo : ");
		soTrang = Double.parseDouble(nhap.nextLine());//Đã giải thích bên lớp cha.
	}
	
	//Cũng như hàm nhap, hàm xuất cũng ghi đè hàm xuất của lớp cha và kế thừa hàm xuất ấy.
	public void xuat() {
		super.xuat();
		System.out.println("Số trang báo : " + soTrang + " trang");
	}
	
	//Ghi đè phương thức trừu tượng của lớp cha.
	public double tienVanChuyen() {
		return 1000*soTrang*getSoLuong();
	}
	
	//Ghi đè phương thức trừu tượng của lớp cha.
	public void datHangHoa() {
		System.out.println("Tiền vận chuyển : " + tienVanChuyen());
	}
}
