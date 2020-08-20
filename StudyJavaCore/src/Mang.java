import java.util.Arrays;

public class Mang {

	public static void main(String[] args) {
		// Có 3 cách khai báo mảng
		//Khai báo với new và chỉ định các phần tử
		int [] a = new int[] {1,2,4,5};
		
		//Khai báo và gán lun các phần tử.
		int [] b = {1,3,5};
		
		//Khai bái với new và chỉ định số phần tử có thể lưu trữ
		int [] c = new int[5]; // chỉ có thể lưu 5 phần tử
		String [] d = new String[5]; //chỉ có thể lưu 5 phần tử
		
		//in ra vị trí của mảng. Vị trí thứ 2.
		//Truy xuất trực tiếp theo index(chỉ số)
		System.out.println("Giá trị ở vị trí số 2 là : " + a[2]); // xuất ra 4
		
		//xét giá trị cho vị trí thứ 3 của mảng
		d[3] = "Hello";
		
		//Hiển thị vị trí từng thành phần trong mảng. Duyệt mảng có quan tâm index(chỉ số).
		for(int i=0;i<a.length; i++) {
			//xuất ra vị trí và giá trị của vị trí đó
			System.out.println("Vị trí thứ "+ i +" có giá trị là : " + a[i]);
		}
		
		//in ra kích thước của mảng
		System.out.println("size = " + a.length);
		
		//in ra giá trị nhưng không quan tâm tới số phần tử của mảng.
		//Duyệt mảng có quan tâm nội dung.
		for(int e : a) {
			System.out.print(" " + e); //xuất ra giá trị 1,2,4,5
		}
		System.out.println();
		
		//Duyệt mảng chỉ quan tâm nội dung
		for(String e : d) {
			//Đối tượng không xét giá trị thì trả về null (String,..)
			System.out.print(" " + e); //xuất ra null
		}
		System.out.println();
		
		//Duyệt mảng chỉ quan tâm nội dung.
		for(int e : c) {
			//Kiểu nguyên thủy không xét trả giá trị mặc định (0)
			System.out.print(" " + e); // xuất ra 0
		}
		
		//Tính tổng các số chẵn trong mảng.
		
		int [] s = {9, 3, 8, 4, 2, 7, 5};
		
		//khởi tạo tổng số chẵn và gán nó = 0
		int tongSoChan = 0;
		//Duyệt hết mảng. Lấy từng giá trị bỏ xuống if.
		for(int e : s) {
			//Kiểm tra xem giá trị đó có phải là số chắn hay không. 
			//Nếu phải cộng vào, nếu không phải thì dừng và tiếp tục vòng for đến khi hết giá trị trong mảng
			if(tongSoChan%2==0) {
				tongSoChan += e;
			}
		}
		//Khi hết giá trị trong mảng, in ra kết quả
		System.out.println("\nTổng các số chẵn trong mảng là : " + tongSoChan);
		
		//sử dụng hàm sort của lớp Arrays để sắp xếp tăng dần.
		Arrays.sort(s);
		for(int i=0; i<s.length;i++) {
			System.out.print(" "+s[i]);
		}
		System.out.println();
		
		//Sắp xếp giảm dần
		for(int i=s.length -1;i>=0;i--)
		{
			System.out.print(" "+s[i]);
		}
		
		//in ra mang kieu string
		System.out.println("\n"+Arrays.toString(s));
		//thay the so 10 vao tat ca vi tri cua mang 
		Arrays.fill(s, 10);
		System.out.println(Arrays.toString(s));
	}
	
}
