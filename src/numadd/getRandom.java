package numadd;

import java.util.Random;

public class getRandom {
	public static void main(String[] args) {
		int n = 100000;
		Random random = new Random();
		if(args[0].equals("GET")) {
			System.out.println(n + random.nextInt(999999));
		}
	}
}
