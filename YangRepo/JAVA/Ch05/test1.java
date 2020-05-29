package Ch05;
import java.util.*;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hap =0;
		int[] aa = new int[4];
		int[] bb = new int[4];
		
		for(int i=0; i<4; i++) {
			aa[i] = sc.nextInt();
			
			hap += aa[i];
		}
		
		for(int i=0; i<4; i++) {
			bb[i] = sc.nextInt();
			
			hap += bb[i];
		}
		System.out.println(hap);
}
}
