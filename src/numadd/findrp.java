package numadd;
import java.util.HashSet;

public class findrp {
public static void main(String[] args) {
	
		int num[] = {2,8,6,2,7,3,9,2,8,6,7,9,1};
		boolean sign[] = new boolean[num.length];
		
		for(int i = 0; i < num.length; i++) {
			sign[i] = false;
		}
		
//		HashSet<Integer> set = new HashSet<Integer>();   //重复出现的
//        for(int i = 0; i < num.length; i++) {
//            if(!set.add(num[i])) {
//            	System.out.println(num[i]);
//            	break;
//            }
//        }
		
		for(int i = 0; i < num.length; i++) {             //只出现一次的
			if(!sign[i]) {
				for(int j = i + 1; j < num.length; j++) {
					if(num[i] == num[j]) {
						sign[i] = true;
						sign[j] = true;
					}
				}
			}
		}
		
		for(int i = 0; i < num.length; i++) {
			if(!sign[i]) {
				System.out.println(num[i]);
			}
		}
		
		
        
	}
}
