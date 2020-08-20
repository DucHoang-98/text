package lab6;

public class GiangVien extends CanBo{
	private String trinhDo;
	private int phuCap;
	private int soTietDay;
	private double heSoLuong;
	
	public GiangVien(){
		
	}
	
	public GiangVien(String hoTen, String trinhDo, int phuCap, int soTietDay, double heSoLuong) {
		super(hoTen);
		this.trinhDo = trinhDo;
		this.phuCap = phuCap;
		this.soTietDay = soTietDay;
		this.heSoLuong = heSoLuong;
	}
	
	public String getTrinhDo() {
		return trinhDo;
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	public int getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(int phuCap) {
		this.phuCap = phuCap;
	}

	public int getSoTietDay() {
		return soTietDay;
	}

	public void setSoTietDay(int soTietDay) {
		this.soTietDay = soTietDay;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
		
	public double tienPhuCap() {
		if("Tiến sĩ".equals(trinhDo)) {
			phuCap = 1000;
		}else if("Thạc sĩ".equals(trinhDo)){
			phuCap = 500;
		}else {
			phuCap =300;
		}
		return phuCap;
	}
	
	public double tienLuong() {
		return heSoLuong*730+phuCap+soTietDay*45;
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("----- Giảng viên -----");
		System.out.println("Trình độ : " + trinhDo);
		System.out.println("Phụ cấp : " + tienPhuCap() + " usd");
		System.out.println("Số tiết dạy : " + soTietDay + " tiết");
		System.out.println("Hệ số lương : " + heSoLuong);
		System.out.println("Tiền Lương : " + tienLuong() + " usd");
		System.out.println("==========================");
	}
}
