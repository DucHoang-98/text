package lab5;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
	    ArrayList<Serializable> al = new ArrayList<Serializable>();
	    Point p = new Point(1,1);
	    Integer i = new Integer(2);
	    Double d = new Double(3);
	    al.add(p);
	    al.add(i);        
	    al.add(d);
	    //Cấu trúc for – each trong java: duyệt tất cả các phần tử của arrayList
	    for (Object o:al) {      
	            System.out.println(o);      
	    }    
	}
}
