package numadd;

public class sum {
	public static void main(String []args) {
		int sum = 0;
		
		for(int i = 0; i <= 1000; i++) {
			if(i == 40 || i == 48)
				continue;
			else {
				if(i % 2 == 0)
					sum += i;
				if(sum + i + 2 >= 25000)
					break;
			}
		}
		
		System.out.println("0��1000֮��(40,48���������ڵ���25000����)ż���ĺ�Ϊ��" + sum);
	}
}
