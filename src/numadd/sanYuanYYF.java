package numadd;

public class sanYuanYYF {
	public static void main(String []args) {
		boolean sign = false;
		int x = 451,grade = 369;
		
		sign =  grade >= x ? true:false;
		System.out.println("���ĸ߿��ܷ�: " + grade);
		System.out.println("��һ������¼ȡ������: " + x);
		if(sign)
			System.out.println("�߿������ͨ��һ��¼ȡ������");
		else
			System.out.println("�߿������δͨ��һ��¼ȡ������");
	}
}
