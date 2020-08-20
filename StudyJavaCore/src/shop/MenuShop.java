package shop;

import java.util.Scanner;

public class MenuShop {
	
		//Đã ghi chú cụ thể bên lớp cha.
		Scanner nhap = new Scanner(System.in);
		
		public static void main(String[] args) {
			
			QuanLiShop ql = new QuanLiShop();
			
			//Đã ghi chú cụ thể bên lớp cha.
			Scanner nhap = new Scanner(System.in);
			
			while(true) {
				System.out.println("<---Chào mừng đến với Shop--->");
				System.out.println("1. Nhân viên.");
				System.out.println("2. Khách hàng");	
				System.out.println("3. Kết thúc!");
				System.out.print("Mời bạn chọn chức năng : ");
				String num = nhap.nextLine();
				
				switch(num) {
				//Ở đây, muôn vào mục nhân viên bạn phải có mật khẩu để vào. Nhằm không cho khách hàng vào sửa thông tin.
					case "1" : System.out.print("Nhập mật khẩu : ");
							String matKhau = nhap.nextLine();
							/*
							 * Hàm equals là so sánh chuỗi. 
							 * Nếu đúng cho đăng nhập vào giao diện của nhân viên.
							 * Nếu sai hiện thông báo.
							 */
							if("nhanvienshop".equals(matKhau)) {
								System.out.println("<--Menu nhân viên-->");
								System.out.println("1. Thêm sản phẩm.");
								System.out.println("2. Hiển thị tất cả thông tin sản phẩm.");
								System.out.println("3. Quay lại.");
								System.out.println("4 .Kết thúc.");
								System.out.print("Mời bạn chọn chứng năng : ");
								String ma = nhap.nextLine();
								
								switch(ma) {
									case "1" : ql.nhap();
										break;
									case "2" : ql.hienThi();
										break;
									case "3" : continue;
									case "4" : System.out.println("Kết thúc! Hẹn gặp lại!");
										return;
									default : System.out.println("Nhập sai!");
									break;
								}
							}else {
								System.out.println("Nhập sai! Nhập lại!");
							}
							continue;
					case "2" : System.out.println("<--Menu khách hàng-->");
						System.out.println("1. Hiển thị.");
						System.out.println("2. Mua hàng.");
						System.out.println("3. Đặt hàng.");
						System.out.println("4. Quay lại");
						System.out.println("5. Kết thúc.");
						System.out.print("Mời bạn chọn chức năng : ");
						String n = nhap.nextLine();
						switch(n) {
							case "1" : ql.hienThi();
								break;
							case "2" : ql.muaHangHoa();
								break;
							case "3" : ql.datHangHoa();
								break;
							case "4" : continue;
							case "5" : System.out.println("Kết thúc! Hẹn gặp lại!");
								return;
							default : System.out.println("Nhập sai! Nhập lại");
						}
						continue;
					case "3" : System.out.println("Kết thúc! Hẹn gặp lại!");
						return;
					default : System.out.println("Nhập sai! Nhập lại");
						break;
				}
			}
		}
}
