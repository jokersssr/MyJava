package numadd;

import java.text.NumberFormat;

public class Bignum {
	public static void main(String []args) {
		double x = 7100000000.0;
		double y = 1400000000.0;
		
		NumberFormat nf = NumberFormat.getInstance(); 	//��ʽ������
		nf.setGroupingUsed(false);						//ȡ����ѧ������
		
		System.out.println("2019�������˿�����Լ��" + nf.format(x));
		System.out.println("2019���й��˿�����Լ��" + nf.format(y));
	}
}
