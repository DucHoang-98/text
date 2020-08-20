package p3;

import p1.A;

public class D extends A{

	void method() {
		a = 1;
		b = 1;
//		c = 1; Lỗi vì int c chỉ sử dụng trong cùng package
//		d = 1; Lỗi vì private chỉ sử dụng trong cùng class
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
