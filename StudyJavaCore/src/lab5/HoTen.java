package lab5;

public class HoTen implements Comparable<HoTen> {
	//Thuộc tính của lớp họ tên
	private String hoTen;

	//Hàm khởi tạo không tham số
	public HoTen() {
		
	}
	//Hàm khởi tạo có tham số
	public HoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	//Ghi đè phương thức toString
	@Override
	public String toString() {
		return "Họ và tên : " + hoTen;
	}
	
	public int compareTo(HoTen ht) {
        //Xắp xếp họ tên theo ABC
        return this.getHoTen().compareTo(ht.getHoTen());
    }


}
