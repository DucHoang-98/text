package lab4;

import java.util.Scanner;

public class ThongTin {
	
	private KhachHang[] list;
	private int size;
	Scanner nhap = new Scanner(System.in);
	
	public ThongTin() {
		list = new KhachHang[100];
		size = 0;
	}
	
	public void add(KhachHang khachhang) {
		list[size] = khachhang;
		size += 1;
	}
	
	public void xuat() {
		//Chạy vòng lặp for từ 0 đến size. Kiểm tra số lượng sinh viên có trong size.
		//Có bao nhiêu đối tượng sinh viên thì hiện bấy nhiêu sinh viên. Không hiện đối tượng null.
		for(int i = 0; i<size; i++) {
				list[i].xuat();
		}
	}
	
	public void menu() {
		while(true) {
			System.out.println("1. Thêm khách hàng.");
			System.out.println("2. Xem hóa đơn.");
			System.out.println("0. Kết thúc.");
			System.out.print("Chọn chức năng : ");
			String num = nhap.nextLine();
			switch(num) {
			case "1" : 
				KhachHang khachhang = null;
				System.out.print("Số hộ sử dụng điện : ");
				int soLuong = Integer.parseInt(nhap.nextLine());
				for(int i=1; i<=soLuong ; i++) {
					System.out.print("Tên khách hàng : ");
					String hoTen = nhap.nextLine();
					System.out.print("Số nhà : ");
					String soNha = nhap.nextLine();
					System.out.print("Mã số công tơ điện : ");
					String maSoCongToDien = nhap.nextLine();
					System.out.print("Chỉ số mới : ");
					int chiSoMoi = Integer.parseInt(nhap.nextLine());
					System.out.print("Chỉ số cũ : ");
					int chiSoCu = Integer.parseInt(nhap.nextLine());
					khachhang = new BienLai(hoTen,soNha,maSoCongToDien,chiSoCu,chiSoMoi);
					this.add(khachhang);
				}
				break;
				case "2" : this.xuat();
					break;
				case "0" : System.out.println("Kết thúc");
					return;
			}
		}
	}
}
