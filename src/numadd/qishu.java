package numadd;

public class qishu {
	public static void main(String []args) {
		int box[] = new int[15];
		int j = 0;
		for(int i = 30; i > 0; i--) {
			if(i % 2 != 0) {
				box[j++] = i;
			}
		}
		
		System.out.println("30���ڴӴ�С��ǰ12������Ϊ��");
		for(int i = 0; i < 12; i++) {
			System.out.println(box[i]);
		}
	}
}
