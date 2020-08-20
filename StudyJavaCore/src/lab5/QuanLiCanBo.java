package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLiCanBo {
	ArrayList<CanBo> list = new ArrayList<CanBo>(); 
	Scanner nhap = new Scanner(System.in);
	
	public void menu() {
		while(true) {
			System.out.println("1. Nhập thông tin danh sách cán bộ trong trường.");
			System.out.println("2. Xuất danh sách cán bộ.");
			System.out.println("3. Tổng số lương trường phải trả cho cán bộ.");
			System.out.println("4. Sắp xếp cán bột theo lương, nếu lương bằng thì sắp xếp theo tên.");
			System.out.println("5. Kết thúc.");
			System.out.print("Chọn chức năng : ");
			String num = nhap.nextLine();
			
			switch(num) {
				case "1" : this.nhap();
					break;
				case "2" : this.xuat();
					break;
				case "3" : this.tongTienLuong();
					break;
				case "4" : this.sort();
					break;
				case "5" : System.out.println("Kết thúc!");
					return;
			}
		}
	}
	
	public void nhap() {
		System.out.println("1. Giảng viên. -- 2. Nhân viên.");
		System.out.print("Chọn : ");
		String num = nhap.nextLine();
		CanBo cb = null;
		if("1".equals(num)) {
			System.out.print("Số lượng giảng viên cần nhập : ");
			int n = Integer.parseInt(nhap.nextLine());
			for(int i = 0; i<n; i++) {
				System.out.print("Họ tên giảng viên : ");
				String hoTen = nhap.nextLine();
				System.out.print("Trình độ : ");
				String trinhDo = nhap.nextLine();
				System.out.print("Số tiết dạy : ");
				int soTietDay = Integer.parseInt(nhap.nextLine());
				System.out.print("Hệ số lương : ");
				double heSoLuong = Double.parseDouble(nhap.nextLine());
				cb = new GiangVien(hoTen,trinhDo,0,soTietDay,heSoLuong);
				list.add(cb);
			}
		}else if("2".equals(num)) {
			System.out.print("Số lượng nhân viên cần nhập : ");
			int n = Integer.parseInt(nhap.nextLine());
			for(int i = 0; i<n; i++) {
				System.out.print("Họ tên nhân viên : ");
				String hoTen = nhap.nextLine();
				System.out.print("Phòng ban : ");
				String phongBan = nhap.nextLine();
				System.out.print("Số ngày công : ");
				int soNgayCong = Integer.parseInt(nhap.nextLine());
				System.out.print("Chức vụ : ");
				String chucVu = nhap.nextLine();
				System.out.print("Hệ số lương : ");
				double heSoLuong = Double.parseDouble(nhap.nextLine());
				cb = new NhanVien(hoTen,phongBan,soNgayCong,heSoLuong,0,chucVu);
				list.add(cb);
			}
		}else {
			System.out.println("Nhập sai!");
		}
	}
	
	public void xuat() {
		for(int i = 0; i < list.size() ;i++) {
			list.get(i).xuat();
		}
	}
	
	public void tongTienLuong() {
		double sum = 0;
			for(int i = 0; i < list.size(); i++) {
				sum = sum + list.get(i).tienLuong();
				System.out.println("Tổng tiền lương là : " + sum);
				
		}
	}
	public void sort() {
		Collections.sort(list, new Comparator<CanBo>() {
			@Override
			public int compare(CanBo cb1, CanBo cb2) {
				if(cb1.tienLuong()>cb2.tienLuong()) {
					return 1;
				}else {
					if(cb1.tienLuong()==cb2.tienLuong()) {
						if(cb1.getHoTen().compareToIgnoreCase(cb2.getHoTen()) > 0 ) {
							return 1;
						}else if(cb1.getHoTen().compareToIgnoreCase(cb2.getHoTen()) < 0){
							return -1;
						}
						return 0;
					}else {
						return -1;
					}
				}
			}
			
		});
		for(int i=0;i<list.size();i++) {
			list.get(i).xuat();
		}
	}
}
