package lab4;

public class Lab4Bai2_3 {
	public static void main(String[] agrs) {
		Lab4Bai2_3 lb23 = new Lab4Bai2_3();
		SinhVienFpt fpt = new SinhVienFpt() {
			@Override
			public double getDiem() {
				return 0;
			}
		};
		SinhVienBiz biz = new SinhVienBiz("Tiên","Công nghệ thông tin",4,8,"Tiên");
		SinhVienIT it = new SinhVienIT("Tiên","IT",8,9,8,"Tiên");
		
		biz.xuat();
		it.xuat();
	}
}
