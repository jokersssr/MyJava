package numadd;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class sDate {
	public static void main(String []args) {
		String str = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(str);
		
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 12 - 1, 10, 10, 30, 00);  //�·ݴ�0��ʼ���� ��Ҫ-1
		
		Date date = cal.getTime();
		System.out.println(sdf.format(date));
	}
}