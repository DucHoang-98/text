package lab5;

import java.util.HashMap;

import lab3.SinhVien;

public class Deno2 {

	public static void main(String[] args) {
		HashMap<String, SinhVien> sv = new HashMap<String, SinhVien>();
		SinhVien s1 = new SinhVien(0, "12345-12", 0, "Nguyễn Văn Anh", 0);
		SinhVien s2 = new SinhVien(0, "98765-00", 0, "Trần Thị Bình", 0);
		SinhVien s3 = new SinhVien(0, "71024-91", 0, "Chu Cảnh Chiêu", 0);
		sv.put(s1.getName(), s1);
		sv.put(s2.getName(), s2);
		sv.put(s3.getName(), s3);
		String ms = "98765-00";
		System.out.println("Hãy nhập mã số sinh viên = " + ms);
		SinhVien x = sv.get(ms); 
		if (x != null) {
		        System.out.println("Sinh viên mã " + ms + " tên là " + x.getName());
		} else {
		        // không có Student nào như vậy
		        System.out.println("Mã số không hợp lệ: " + ms);
	        }


	}

}
