package Ch05;
import java.util.*;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] aa = new int[4];
		int[] bb = new int[5];
		int hap = 0;
		for(int i=0; i<4; i++) {
			System.out.printf("aa[%d]의 값을 입력하세요. ", i);
			aa[i] = sc.nextInt();
			hap += aa[i];
		}
		
		for(int i=0; i<5; i++) {
			System.out.printf("bb[%d]의 값을 입력하세요. ", i);
			
			bb[i] = sc.nextInt();
			
			hap += bb[i];
		}
		System.out.println("합은 " + hap);
	}

}
