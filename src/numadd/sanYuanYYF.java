package numadd;

public class sanYuanYYF {
	public static void main(String []args) {
		boolean sign = false;
		int x = 451,grade = 369;
		
		sign =  grade >= x ? true:false;
		System.out.println("您的高考总分: " + grade);
		System.out.println("第一批本科录取分数线: " + x);
		if(sign)
			System.out.println("高考结果：通过一本录取分数线");
		else
			System.out.println("高考结果：未通过一本录取分数线");
	}
}
