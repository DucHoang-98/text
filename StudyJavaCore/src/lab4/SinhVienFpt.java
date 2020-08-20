package lab4;

abstract public class SinhVienFpt {
	//Thuộc tính của sinh viên fpt
	private String hoTen;
	private String nganh;
	
	//Get và set các thuộc tính
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	//Hàm khởi tạo không tham số
	public SinhVienFpt() {
		
	}
	//Hàm khởi tạo có tham số
	public SinhVienFpt(String hoTen, String nganh) {
		this.hoTen = hoTen;
		this.nganh = nganh;
	}
	//Phương thức trừu tượng. CHưa pít điểm cụ thể
	abstract public double getDiem();
	
	//Hàm gét học lực, vẫn sử dụng getDiem để xét học lực dù không biết điểm
	public String getHocLuc() {
		double diemTb = getDiem();
		if (diemTb <5) {
			return "Học lực yếu";
		} else if (diemTb>= 5 && diemTb < 6.5) {
			return "Học lực trung bình";
		} else if (diemTb >= 6.5 && diemTb < 7.5) {
			return "Học lực khá";
		} else if (diemTb>= 7.5 && diemTb < 9) {
			return "Học lực giỏi";
		} else {
			return "Học lực xuất sắc";
		}
	}

	//Hàm in ra màn hình
	public void xuat() {
		System.out.println("Tên : " + hoTen);
		System.out.println("Ngành : " + nganh);
		System.out.println("Học lực : " + getHocLuc());
	}
	
}
