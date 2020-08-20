package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLiHoTen {
	ArrayList<HoTen>  list = new ArrayList<HoTen>();
	Scanner nhap = new Scanner(System.in);
	public void menu() {
		while(true) {
			//Menu
			System.out.println("1. Nhập danh sách họ và tên.");
			System.out.println("2. Xuất danh sách vừa nhập.");
			System.out.println("3. Xuất danh sách ngẫu nhiên.");
			System.out.println("4. Xắp xếp giảm dần và xuất danh sách.");
			System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím.");
			System.out.println("0. Kết thúc.");
			System.out.print("Mời chọn : ");
			String n = nhap.nextLine();
			switch(n) {
				case "1" : this.nhap();
					break;
				case "2" : this.xuat();
					break;
				case "3" : this.ngauNhien();
					break;
				case "4" : this.sapxep();
					break;
				case "5" : this.remove();
					break;
				case "0" : System.out.println("Kết thúc!");
					return;
			}
		}
	}
	
	public void nhap() {
		System.out.print("Số lượng họ tên muốn nhập : ");
		int num = Integer.parseInt(nhap.nextLine());
		for(int i = 0; i<num; i++) {
			System.out.println("Họ tên thứ " + (i+1) + " : ");
			System.out.print("Nhập họ tên : ");
			String hoTen = nhap.nextLine();
			//Sau khi nhập tạo đối tượng họ tên
			HoTen ht = new HoTen(hoTen);
			//Lưu đối tượng vào danh sách
			list.add(ht);
		}
	}
	
	public void xuat() {
		//Hiển thị danh sách họ tên
		for(HoTen ht : list) {
			System.out.println(ht.toString());
		}
	}
	
	public void ngauNhien() {
		for(HoTen ht : list) {
			Collections.shuffle(list);
			System.out.println(ht);
		}
	}
	
	public void sapxep() {
		Collections.sort(list);
		Collections.reverse(list);
		for(HoTen ht : list) {
			System.out.println(ht);
		}
	}
	
	public void remove() {
		//Tạo đối tượng ht = null;
		HoTen ht = null;
		System.out.print("Nhập họ tên cần xóa : ");
		String hoTen = nhap.nextLine();
		//List.size() trả vè số phần tử trong arrayList và gán nó vào size
		int size = list.size();
		//Duyệt size chứa phần tử có trong arrayList
		for(int i=0; i<size; i++) {
			//Kiểm tra hoTen nhập vào = hoTen có trong list hay không
			if(list.get(i).getHoTen().equals(hoTen)) {
				//Trỏ đến nơi giá trị cần xóa đang chứa và gán nó.
				//Vì thế tạo ra một ht có giá trị riêng
				ht = list.get(i);
				break;
			}
		}
		//Xóa ht nếu giá trị của nó khác null và ngược lại
		if(ht!=null) {
			list.remove(ht);
			System.out.println("Đã xóa họ tên");
		}else {
			System.out.println("Không tồn tại họ tên để xóa");
		}
	}
}
