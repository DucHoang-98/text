package lab3;

public class Lab3TongHop {

	public static void main(String[] args) {
		SPham sp = new SPham();
		sp.nhap();
		sp.xuat();
		SPham sp1 = new SPham();
		sp1.nhap();
		sp1.xuat();
		SPham sp2 = new SPham();
		sp2.nhap();
		sp2.xuat();
		Sanpham sp4  = new Sanpham("muối",10000,7);
		sp4.nhap();
		sp4.xuat();
		Sanpham sp5 = new Sanpham("Đường",20000);
		sp5.nhap();
		sp5.xuat();
		SP sp6 = new SP();
		sp6.nhap();
		sp6.xuat();
	}

}
