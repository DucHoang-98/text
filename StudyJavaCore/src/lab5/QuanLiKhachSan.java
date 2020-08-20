package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiKhachSan {
	ArrayList<KhachSan> list = new ArrayList<KhachSan>();
	Scanner nhap = new Scanner(System.in);
	
	public void nhap() {
		System.out.print("Nhập số lượng khách hàng : ");
		int num = Integer.parseInt(nhap.nextLine());
		KhachSan ks = null;
		for(int i=0; i<num; i++) {
			ks = new KhachSan();
			ks.nhap();
			list.add(ks);
		}
	}
	
	public void xuat() {
		for(int i=0; i<list.size();i++) {
			list.get(i).xuat();
		}
	}
	
	public void xoa() {
		//Tạo đối tượng ht = null;
		KhachSan khachsan = null;
		System.out.print("Nhập họ tên cần xóa : ");
		String hoTen = nhap.nextLine();
		System.out.print("Nhập số CMND cần xóa : ");
		int soCMND = Integer.parseInt(nhap.nextLine());
		//List.size() trả vè số phần tử trong arrayList và gán nó vào size
		int size = list.size();
		//Duyệt size chứa phần tử có trong arrayList
		for(int i=0; i<size; i++) {
			//Kiểm tra hoTen nhập vào = hoTen có trong list hay không
			if(list.get(i).getHoTen().equals(hoTen)) {
				//Kiểm tra số CMND nhập vào = hoTen có trong list hay không
				if(list.get(i).getSoCMND()==soCMND) {
					//Trỏ đến nơi giá trị cần xóa đang chứa và gán nó.
					//Vì thế tạo ra một khachsan có giá trị riêng
					khachsan = list.get(i);
					break;
				}
			}
		}
		//Xóa khachsan nếu giá trị của nó khác null và ngược lại
		if(khachsan!=null) {
			list.remove(khachsan);
			System.out.println("Đã xóa thông tin khách hàng");
		}else {
			System.out.println("Không tồn tại khách hàng để xóa");
		}
	}
	
	public void tinhTienTheoCMND() {
		System.out.print("Nhập số CMND để thanh toán : ");
		int soCMND = Integer.parseInt(nhap.nextLine());
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getSoCMND()==soCMND) {
				System.out.println("Số tiền phải thanh toán là : " + list.get(i).tinhTien() + " đồng");
			}
		}
	}
	
	public void menu() {
		while(true) {
			System.out.println("1. Nhập thông tin khách hàng.");
			System.out.println("2. Hiển thị thông tin khách hàng.");
			System.out.println("3. Xóa thông tin khách hàng.");
			System.out.println("4. Tinh tiền.");
			System.out.println("5. Kết thúc.");
			System.out.print("Chọn chức năng : ");
			String num = nhap.nextLine();
			switch(num) {
				case "1" : this.nhap();
					break;
				case "2" : this.xuat();
					break;
				case "3" : this.xoa();
					break;
				case "4" : this.tinhTienTheoCMND();
					break;
				case "5" : System.out.println("Kết thúc!");
					return;
			}
		}
	}
}
