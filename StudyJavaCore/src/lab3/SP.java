package lab3;
import java.util.Scanner;

public class SP {
	private String tenSp;
	private double donGia;
	private double giamGia;
	
	public String getTenSp() {
		return this.tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public double getDonGia() {
		return this.donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getGiamGia() {
		return this.giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	public void nhap() {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Tên sản phẩm : ");
		tenSp = nhap.nextLine();
		System.out.print("Đơn giá : ");
		donGia = nhap.nextDouble();
		System.out.print("Giảm giá : ");
		giamGia = nhap.nextDouble();
	}
	
	 double getThueNhapKhau(double donGia) {
		return (donGia*10)/100;
	}
	
	public void xuat() {
		System.out.println("Tên sản phẩm : " + tenSp);
		System.out.println("Đơn giá : " + donGia + " đồng");
		System.out.println("Giảm giá : " + (giamGia*donGia)/100 + "%");
		System.out.println("Thuế : " + getThueNhapKhau(donGia) + " đồng");
	}

	
}
