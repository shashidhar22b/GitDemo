package coreJavaTraning;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/d/yyyy");
		SimpleDateFormat s = new SimpleDateFormat("MM/d/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(s.format(d));
		System.out.println(d.toString());

	}

}
