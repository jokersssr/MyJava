package numadd;

import java.text.NumberFormat;

public class Bignum {
	public static void main(String []args) {
		double x = 7100000000.0;
		double y = 1400000000.0;
		
		NumberFormat nf = NumberFormat.getInstance(); 	//格式化数字
		nf.setGroupingUsed(false);						//取消科学计数法
		
		System.out.println("2019年世界人口总数约：" + nf.format(x));
		System.out.println("2019年中国人口总数约：" + nf.format(y));
	}
}
