package shop;

import java.util.Scanner;


public abstract class HangHoa {
	//Khai báo thuộc tính của lớp hàng hóa
	private String maHH;
	private String tenHH;
	private String donViTinh;
    private double donGia;
    private double soLuong;
    
    /*
     * Tạo lớp Scanner nhằm cho phép ta nhập dữ liệu từ bàn phím.
     * Sử dụng lớp Scanner ta buộc phải khai báo thư viện Scanner.
     */
    Scanner nhap = new Scanner(System.in);
    
    //Hàm khởi  tạo không tham số
    public HangHoa() {
    	
    }
    
    //Hàm khởi tạo có tham số
    public HangHoa(String maHH, String tenHH, String donViTinh, double donGia, double soLuong) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.donViTinh = donViTinh;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    
    /*
     * Get và set các thuộc tính của lớp hàng hóa
     * Với Set là truyền giá trị cho các biến private
     * Còn Get là lấy giá trị các biến truyền vào.
     */
	public String getMaHH() {
		return maHH;
	}

	public void setMaHH(String maHH) {
		this.maHH = maHH;
	}

	public String getTenHH() {
		return tenHH;
	}

	public void setTenHH(String tenHH) {
		this.tenHH = tenHH;
	}

	public String getDonViTinh() {
		return donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(double soLuong) {
		this.soLuong = soLuong;
	}
	
	//Hàm nhập các thông tin(thuộc tính) của lớp hàng hóa
    public void nhap() {
    	System.out.print("Nhập mã hàng hóa : ");
    	maHH = nhap.nextLine();
    	System.out.print("Nhập tên hàng hóa : ");
    	tenHH = nhap.nextLine();
    	System.out.print("Nhập đơn vị tính : ");
    	donViTinh= nhap.nextLine();
    	System.out.print("Nhập đơn giá : ");
    	//Ở đây ta đề phòng bị dính bộ đệm khi thay đổi kiểu String sang double. Cho nên ta dùng lệnh này nhằm xóa bộ đệm đó.
    	donGia = Double.parseDouble(nhap.nextLine()); 
    	System.out.print("Nhập số lượng : ");
    	soLuong = Double.parseDouble(nhap.nextLine());
    }
    
  //Hàm xuất các thông tin(thuộc tính) của lớp hàng hóa
    public void xuat() {
    	System.out.println("Mã hàng hóa : " + maHH);
    	System.out.println("Tên hàng hóa : " + tenHH);
    	System.out.println("Đơn vị tính : " + donViTinh + " VNĐ");
    	System.out.println("Đơn giá : " + donGia);
    	System.out.println("Số lượng : " + soLuong);
    }
    
    /*
     * Ở đây ta sử dụng phương thức trừu tượng vì ta chưa biết được tiền vận chuyển của hàng hóa như thế nào.
     * Tiền vận chuyển hàng hóa : gồm báo và sách. Chưa xác định rõ công thức tính tiền vận chuyển.
     * Nói cụ thể là tiền vận chuyển sách và tiền vận chuyển báo có số tiền vận chuyển khác nhau nên ta sử dụng hàm trừu tượng.
     * Vì thế ở lớp con chỉ việc gọi làm hàm tiền vận chuyển này và ghi đè hàm lớp cha.
     */
    abstract public double tienVanChuyen();
    
    abstract public void datHangHoa();
    
    //Khách hàng mua hàng hóa trực tiếp tại shop.
    public double muaHangHoa() {
    	return soLuong*donGia;
    }
    
}
