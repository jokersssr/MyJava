package numadd;

public class numadd {
	public static void main(String []args) {
		int x = Integer.parseInt(args[0]);;
		int[] box = new int[6];
		box[0] = 0;
		box[1] = x;
		
		for(int i = 2; i <= 5; i++) {
			box[i] = box[i - 1] * 10 + x;
		}
		
		System.out.println(2 * box[1] + 2 * box[2] +  2 * box[3] +  2 * box[4] + box[5]);
	}
}
