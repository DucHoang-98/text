package lab1;
import java.util.Scanner;

public class Lab1Bai1 {

	public static void main(String[] args) {
		
		Scanner nhap = new Scanner(System.in);
		
		System.out.print("Nhập họ và tên : ");
		String hoten = nhap.nextLine();
		System.out.print("Nhập điểm trung bình : ");
		double diemtb = nhap.nextDouble();
		
		System.out.println("Họ và tên : "+hoten);
		System.out.println("Điểm trung bình : "+diemtb);
	}

}
