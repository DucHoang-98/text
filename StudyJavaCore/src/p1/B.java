package p1;

public class B {
	A x = new A();
	void method() {
		x.a = 1;
		x.b = 1;
		x.c = 1;
//		x.d = 1;  Lỗi vì private int d chỉ sử dụng trong cùng class
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
