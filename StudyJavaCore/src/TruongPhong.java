public class TruongPhong extends NhanVien{

	private double trachNhiem;
	
	public TruongPhong(String hoTen, double luong, double trachNhiem) {
		super(hoTen, luong);
		this.trachNhiem = trachNhiem;
	}

	public void xuat() {
		super.xuat();
		System.out.println(this.trachNhiem);
	}
	public static void main(String[] args) {
		TruongPhong Tp = new TruongPhong("Tiên", 1000, 50);
		Tp.xuat();
	}

}
