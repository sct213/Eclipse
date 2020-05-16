
package Ch06;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int hap = 0;
		int i;
		int num;
		
		System.out.printf("값 입력 : ");
		num = sc.nextInt();
		
		for(i=1; i<=num; i++) {
			hap = hap + i;
		}
		System.out.printf("1에서 %d까지의 합 : %d\n", num, hap);
	}

}
