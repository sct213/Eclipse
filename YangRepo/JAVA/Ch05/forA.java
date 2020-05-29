package Ch05;

import java.util.*;

public class forA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		
		int hap = 0;
		
		for(int i=1; i<=4; i++) {
			
			arr[i] = sc.nextInt();
		}
		hap = arr[0] + arr[1] + arr[2] + arr[3];
		
		System.out.print(hap);
	}

}
