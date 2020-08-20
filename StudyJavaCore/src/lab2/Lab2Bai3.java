package lab2;
import java.util.Scanner;

public class Lab2Bai3 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập số điện đã sử dụng : ");
		int sodien = nhap.nextInt();
		if(sodien<50) {
			int tiendien = sodien*1000;
			System.out.println("Tiền điện là : "+tiendien);
		}else {
			int tiendien = 50*1000+(sodien-50)*1200;
			System.out.println("Tiền điện là : "+tiendien);
		}
	}

}
