package shop;

//Kế thừa lớp cha HangHoa, vì lớp cha là có hàm trừu tượng nên phải khai báo abstract.
public class Book extends HangHoa{
	//Khai báo thuộc tính của lớp sách(Book).
	private double trongLuong;
	
	//Khai báo hàm không tham số.
	public Book() {
		
	}
	
	//Khai báo hàm có tham số. Khai báo lại và kế thừa các thuộc tính của lớp cha thông qua hàm super.
	public Book(String maHH, String tenHH, String donViTinh, double donGia, double soLuong, double trongLuong) {
		super(maHH,tenHH,donViTinh,donGia,soLuong);
		this.trongLuong = trongLuong;
	}
	//Cũng như lớp cha, ta gọi hàm get và set để truyền và lấy giá trị
	public double getTrongLuong() {
		return trongLuong;
	}

	public void setTrongLuong(double trongLuong) {
		this.trongLuong = trongLuong;
	}
	
	//Nhập thông tin của lớp sách. Ghi đè hàm nhập của lớp cha và kế thừa hàm nhập của lớp cha nên ta gọi hàm super();
	public void nhap() {
		super.nhap();
		System.out.print("Nhập trọng lượng sách : ");
		trongLuong = Double.parseDouble(nhap.nextLine());//Đã giải thích bên lớp cha.
	}
	
	//Cũng như hàm nhap, hàm xuất cũng ghi đè hàm xuất của lớp cha và kế thừa hàm xuất ấy.
	public void xuat() {
		super.xuat();
		System.out.println("Trọng lượng sách : " + trongLuong + " Kg");
	}
	
	//Ghi đè phương thức trừu tượng của lớp cha.
	public double tienVanChuyen() {
		return 2000*trongLuong*getSoLuong();
	}
	
	//Ghi đè phương thức trừu tượng của lớp cha.
	public void datHangHoa() {
		System.out.println("Tiền vận chuyển : " + tienVanChuyen());
	}
}
