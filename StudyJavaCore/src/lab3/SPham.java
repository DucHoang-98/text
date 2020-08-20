package lab3;
import java.util.Scanner;

public class SPham {
	private String tenSp;
	private double donGia;
	private double giamGia;
	
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
