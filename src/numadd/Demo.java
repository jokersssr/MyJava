package numadd;

public class Demo {
	
	public static int sor(int x, int y) {
		int max = x > y? x : y;
		return max;
	}
	
	public static int sor(int x, int y, int z) {
		int max = x;
		if(max < y)		max = y;
		if(max < z) 	max = z;
		return max;
	}
	
	public static double sor(double x, double y) {
		double max = x > y? x : y;
		return max;
	}
	
	public static double sor(double x, double y, double z) {
		double max = x;
		if(max < y)		max = y;
		if(max < z) 	max = z;
		return max;
	}
	
	public static void main(String []args) {

		System.out.println("6, 12的最大值为:" + sor(6,12));
		System.out.println("6, 12, 10的最大值为:" + sor(6,12,10));
		System.out.println("19.35, 28.99, 65.99的最大值为:" + sor(19.35,28.99,65.99));
		System.out.println("9.58, 18.65的最大值为:" + sor(9.58,18.65));
	}
}
