package shop;

import java.util.Scanner;

import lab4.SinhVienBiz;
import lab4.SinhVienFpt;
import lab4.SinhVienIT;

public class QuanLiShop {
	//Khởi tạo danh sách đối tượng mảng hàng hóa.
	private HangHoa[] listHH;
	//Khởi tạo tổng sinh viên
	private int size;
	
	//Đã giải thích ở lớp cha.
	Scanner nhap = new Scanner(System.in);
	
	//Hàm khởi tạo không tham số
	public QuanLiShop() {
		//Gán mảng hàng hóa là 100 đối tượng
		listHH = new HangHoa[100];
		/*
		 * Gán tổng sinh viên kích thước tổng sinh viên mặc định bằng 0.
		 * thuộc tính này có cũng được, không có cũng được vì int kiểu nguyên thủy đã là bằng 0.
		 * Ở đây khai báo chỉ để cho nhớ.
		 */
		int size = 0;
	}
	
	/*
	 * Muốn thêm hàng hóa vào thì ta phải có 1 đối tượng, ở đây đối tượng đó là hàng hóa.
	 * sau khi gán xong 1 đối tượng vào mảng danh sách thì kích thước size tăng thêm 1;
	 */
	public void add(HangHoa hangHoa) {
		listHH[size] = hangHoa;
		size += 1;
	}
	
	public void hienThi() {
		/*
		 * Chạy vòng lặp for từ 0 đến size. Kiểm tra số lượng hàng hóa có trong size.
		 * Có bao nhiêu đối tượng hàng hóa thì hiện bấy nhiêu hàng hóa. Không hiện đối tượng null.
		 */
		for(int i=0; i<size; i++) {
			listHH[i].xuat();
		}
	}
	
	//Tạo hàm nhập hàng hóa vào danh sách.
	public void nhap() {
		System.out.println("1. Sách - 2. Báo chí");
		System.out.print("Lựa chọn : ");
		String loaiSanPham = nhap.nextLine();
		//Kiểm tra nhập, nếu nhập không phải 1 hoặc 2.
		HangHoa hangHoa = null;
		boolean flag = false;
		//Nếu nhập 1 thì nhập thông tin sản phẩm về sách
		if("1".equals(loaiSanPham)) {
			System.out.print("Nhập mã hàng hóa : ");
		    String maHH = nhap.nextLine();
		    System.out.print("Nhập tên hàng hóa : ");
		    String tenHH = nhap.nextLine();
		    System.out.print("Nhập đơn vị tính : ");
		    String donViTinh= nhap.nextLine();
		    System.out.print("Nhập đơn giá : ");
		    //Ở đây ta đề phòng bị dính bộ đệm khi thay đổi kiểu String sang double. Cho nên ta dùng lệnh này nhằm xóa bộ đệm đó.
		    double donGia = Double.parseDouble(nhap.nextLine()); 
		    System.out.print("Nhập số lượng : ");
		    double soLuong = Double.parseDouble(nhap.nextLine());
		    System.out.print("Nhập trọng lượng sách : ");
			double trongLuong = Double.parseDouble(nhap.nextLine());
			hangHoa = new Book(maHH,tenHH,donViTinh,donGia,soLuong,trongLuong);
		}else if("2".equals(loaiSanPham)) { //Nếu nhập 2 thì nhập thông tin sản phẩm về báo chí
			System.out.print("Nhập mã hàng hóa : ");
		    String maHH = nhap.nextLine();
		    System.out.print("Nhập tên hàng hóa : ");
		    String tenHH = nhap.nextLine();
		    System.out.print("Nhập đơn vị tính : ");
		    String donViTinh= nhap.nextLine();
		    System.out.print("Nhập đơn giá : ");
		    //Ở đây ta đề phòng bị dính bộ đệm khi thay đổi kiểu String sang double. Cho nên ta dùng lệnh này nhằm xóa bộ đệm đó.
		    double donGia = Double.parseDouble(nhap.nextLine()); 
		    System.out.print("Nhập số lượng : ");
		    double soLuong = Double.parseDouble(nhap.nextLine());
		    System.out.print("Nhập số lượng trang : ");
			double soTrang = Double.parseDouble(nhap.nextLine());
			hangHoa = new BaoChi(maHH,tenHH,donViTinh,donGia,soLuong,soTrang);
		}else {
			System.out.println("Nhập sai!");
			flag = true;
		}
		if(!flag) { //Nếu khác điều kiện thêm tất cả vào đối tượng mảng.
			add(hangHoa);
		}
	}
	
	//Chức năng mua hàng
	public void muaHangHoa() {
		//Đầu tiên ta phải nhập tên sản phẩm muốn mua và số lượng cần mua
		System.out.print("Nhập tên sản phẩm muốn mua : ");
		String tenSanPham = nhap.nextLine();
		System.out.print("Nhập số lượng sản phẩm : ");
		double soLuongSanPham = Double.parseDouble(nhap.nextLine());
		for(int i=0; i<size; i++) {
			//Sau đó kiểm tra trong danh sách có tên sản phẩm đó không? Nếu có đi tiếp, không có trả trả về else
			if(listHH[i].getTenHH().equals(tenSanPham)){
				/*
				 * Nếu có sản phẩm cân mua rồi thì kiểm tra số lượng sản phẩm có trong danh sách. 
				 * Nếu số lượng nhiều hơn trong danh sách thì trả về else, nếu ít hơn hoặc bằng thì tiếp tục mua hàng.
				 */
				if(listHH[i].getSoLuong() >= soLuongSanPham) {
					//In ra thông tin sản phẩm đã mua
					System.out.println("Tên sản phẩm : " + tenSanPham);
					System.out.println("Số lượng : " + soLuongSanPham);
					System.out.println("Tiền vận chuyển : " + listHH[i].muaHangHoa()+ " VNĐ");
				}else {
					System.out.println("Không đủ số lượng sản phẩm!");
				}
			}else {
				System.out.println("Không có sản phẩm trong shop!");
			}
		}
	}
	
	//Chức năng đặt hàng hóa
	public void datHangHoa() {
		//Ở đây cũng giống hàm mua hàng, ta phải nhập tên và số lượng muốn mua.
		System.out.print("Nhập tên sản phẩm muốn mua : ");
		String tenSanPham = nhap.nextLine();
		System.out.print("Nhập số lượng sản phẩm : ");
		double soLuongSanPham = Double.parseDouble(nhap.nextLine());
		for(int i=0; i<size; i++) {
			//Cũng kiểm tra như hàm mua hàng
			if(listHH[i].getTenHH().equals(tenSanPham)){
				if(listHH[i].getSoLuong() >= soLuongSanPham) {
					//Đầy đủ điều kiện thì nhập thông tin khách hàng muốn ship và xuất thông tin về hóa đơn.
					System.out.print("Tên khách hàng : ");
					String tenKhachHang = nhap.nextLine();
					System.out.print("Địa chỉ : ");
					String diaChi = nhap.nextLine();
					System.out.print("Số điện thoại : ");
					int soDienThoai = Integer.parseInt(nhap.nextLine());
					System.out.println("Tên khách hàng : " + tenKhachHang);
					System.out.println("Địa chỉ : " + diaChi);
					System.out.println("Số điện thoại : " + soDienThoai);
					System.out.println("Tên sản phẩm : " + tenSanPham);
					System.out.println("Số lượng : " + soLuongSanPham);
					System.out.println("Tiền vận chuyển : " + listHH[i].tienVanChuyen() + " VNĐ");
				}else {
					System.out.println("Không đủ số lượng sản phẩm!");
				}
			}else {
				System.out.println("Không có sản phẩm trong shop!");
			}
		}
	}
}
