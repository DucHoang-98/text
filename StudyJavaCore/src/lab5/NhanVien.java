package lab5;

public class NhanVien extends CanBo{
	private String phongBan;
	private double soNgayCong;
	private double heSoLuong;
	private int phuCap;
	private String chucVu;
	
	public NhanVien() {
		
	}
	
	public NhanVien(String hoTen, String phongBan, double soNgayCong, double heSoLuong, int phuCap, String chucVu) {
		super(hoTen);
		this.phongBan = phongBan;
		this.soNgayCong = soNgayCong;
		this.heSoLuong = heSoLuong;
		this.phuCap = phuCap;
		this.chucVu = chucVu;
	}

	public String getPhongBan() {
		return phongBan;
	}

	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}

	public double getSoNgayCong() {
		return soNgayCong;
	}

	public void setSoNgayCong(double soNgayCong) {
		this.soNgayCong = soNgayCong;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public int getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(int phuCap) {
		this.phuCap = phuCap;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	
	public double tienPhuCap() {
		if("Trưởng Phòng".equals(chucVu)||"TP".equals(chucVu)||"Tp".equals(chucVu)||"tp".equals(chucVu)||"truong phong".equals(chucVu)) {
			phuCap = 2000;
		}else if("Phó phòng".equals(chucVu)||"PP".equals(chucVu)||"Pp".equals(chucVu)||"pp".equals(chucVu)||"pho phong".equals(chucVu)) {
			phuCap = 1000;
		}else {
			phuCap = 500;
		}
		return phuCap;
	}
	
	public double tienLuong() {
		return heSoLuong*730+phuCap+soNgayCong*45;
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("----- Nhân viên -----");
		System.out.println("Phòng ban : " + phongBan);
		System.out.println("Số ngày công : " + soNgayCong + " ngày");
		System.out.println("Chức vụ : " + chucVu);
		System.out.println("Hệ số lương : " + heSoLuong);
		System.out.println("Phụ cấp : " + tienPhuCap() + " usd");
		System.out.println("Tiền lương : " + tienLuong() + " usd");
		System.out.println("===========================");
	}
}	
