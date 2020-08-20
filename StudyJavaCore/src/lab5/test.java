package lab5;

import java.util.Scanner;

public class test {

	private static Scanner nhap;

	public static void main(String[] args) {
		nhap = new Scanner(System.in);
		while(true) {
			System.out.println("1. Tiệm sách");
			System.out.println("2. Kết thúc");
			System.out.print("Chọn chức năng : ");
			int num = nhap.nextInt();
			switch(num) {
				case 1 :
						System.out.println("1. Quay lại");
						System.out.println("2. Kết thúc");
						System.out.print("Chọn chức năng : ");
						int number = nhap.nextInt();
						switch(number) {
							case 1 : 
								continue ; 
							case 2 : System.out.println("Kết thúc");
								return;
						}
						continue;
				case 2 : System.out.println("kết thúc");
					return;
			}
			continue;
		}

	}

}
