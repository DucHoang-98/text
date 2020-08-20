
public class NhanVien {
	private String hoTen;
	private double luong;
	
	public NhanVien(String hoTen, double luong) {
		this.hoTen = hoTen;
		this.luong = luong;
	}
	
	public void xuat() {
		System.out.println(this.hoTen+" - "+this.luong);
	}

}
