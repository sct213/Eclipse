package Ch05;
import java.util.*;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hapB = 0;
		int hap = 0;
		int[] aa = new int[4];
		int[] bb = new int[4];
		
		for(int i=0; i<4; i++) {
			aa[i] = sc.nextInt();
			
			hap += aa[i];
		}
		System.out.println(hap);
		
		for(int i=0; i<4; i++) {
			bb[i] = sc.nextInt();
			
			hapB += bb[i];
		}
		System.out.println(hapB);
		
		System.out.println(hap + hapB);
		
	}

}
