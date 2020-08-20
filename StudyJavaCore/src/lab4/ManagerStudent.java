package lab4;

import java.util.Scanner;

public class ManagerStudent {
	private SinhVienFpt[] list;
	private int size;
	Scanner nhap = new Scanner(System.in);
	
	public ManagerStudent() {
		list = new SinhVienFpt[100];
	}
	
	public void addStuden(SinhVienFpt sinhvien) {
		list[size] = sinhvien;
		size++;
	}
	
	public void sortDiem() {
		for(int i = 0; i < size; i++) {
			//giảm số lần hoán đổi.... nên size - i
			for(int j = 1; j < size - i; j++) {
				if(list[j-1].getDiem() > list[j].getDiem()) {
					SinhVienFpt sinhvien = list[j-1];
					list[j-1] = list[j];
					list[j] = sinhvien;
				}
			}
		}
		for(int i = 0; i < size; i++) {
			list[i].xuat();
		}
	}
	
	private void xuat() {
		System.out.println("Sinh viên");
		
		for(int i = 0; i < size; i++) {
			list[i].xuat();
		}
	}
	
	private void showHocLuc() {
		for(int i =0; i<size; i++) {
			//Kiểm tra, nếu điểm GPa>=8 thì in ra danh sách thông tin liên quan đến sinh viên đó.
			if("Giỏi".equals(list[i].getHocLuc())) {
				list[i].xuat();
			}
		}
	}
	
	private void printListSinhVien() {
		for(int i = 0; i < size; i++) {
			list[i].xuat();
			if(list[i] instanceof SinhVienIT) {
				((SinhVienIT)list[i]).showNameMyLove();
			}else {
				((SinhVienBiz)list[i]).showNameFather();
			}
		}
	}
	public void menu() {
		while(true) {
			System.out.println("1. Nhập danh sách sinh viên.");
			System.out.println("2. Xuất thông tin danh sách sinh viên.");
			System.out.println("3. Xuất danh sách sinh viên có học lực giỏi.");
			System.out.println("4. Sắp xếp danh sách sinh viên theo điểm.");
			System.out.println("5. Kết thúc.");
			System.out.print("Nhập chức năng : ");
			String n = nhap.nextLine();
			switch(n) {
				case "1" : this.nhap();
					break;
				case "2" : this.xuat();
					break;
				case "3" : this.showHocLuc();
					break;
				case "4" : this.sortDiem();
					break;
				case "5" : 
					return;
				default : System.out.println("Nhập sai vui lòng nhập lại");
					break;
			
			}
		}
	}
	
	private void nhap() {
		System.out.println("1. Sinh viên IT - 2. Sinh viên Biz");
		System.out.print("Lựa chọn : ");
		String loaiSinhVien = nhap.nextLine();
		//Kiểm tra nhập, nếu nhập không phải 1 hoặc 2.
		SinhVienFpt sinhvien = null;
		boolean flag = false;
		//Nếu nhập 1 thì nhập thông tin IT
		if("1".equals(loaiSinhVien)) {
			System.out.print("Họ tên : ");
			String hoTen = nhap.nextLine();
			System.out.print("Ngành : ");
			String nghanh = nhap.nextLine();
			System.out.print("Điểm Java : ");
			double diemJava = Double.parseDouble(nhap.nextLine());
			System.out.print("Điểm Css : ");
			double diemCss = Double.parseDouble(nhap.nextLine());
			System.out.print("Điểm Html : ");
			double diemHtml = Double.parseDouble(nhap.nextLine());
			System.out.println();
			String nameMyLove = nhap.nextLine();
			sinhvien = new SinhVienIT(hoTen, nghanh, diemJava, diemCss, diemHtml, nameMyLove);
		}else if("2".equals(loaiSinhVien)) { //Nếu nhập 2 thì nhập thông tin Biz
			System.out.print("Họ tên : ");
			String hoTen = nhap.nextLine();
			System.out.println("Ngành : ");
			String nghanh = nhap.nextLine();
			System.out.print("Điểm Marketing : ");
			double diemMarketing = Double.parseDouble(nhap.nextLine());
			System.out.print("Điểm Sales : ");
			double diemSales = Double.parseDouble(nhap.nextLine());
			System.out.println();
			String nameFather = nhap.nextLine();
			sinhvien = new SinhVienBiz(hoTen, nghanh, diemMarketing, diemSales, nameFather);
		}else {
			System.out.println("Nhập sai rồi");
			flag = true;
		}
		if(!flag) {
			addStuden(sinhvien);
		}
	}
}
