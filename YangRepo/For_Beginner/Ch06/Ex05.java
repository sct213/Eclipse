package Ch06;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int i;
		int num1, num2, num3;
		
		System.out.println("시작값 입력 : ");
		num1 = sc.nextInt();
		System.out.println("끝값 입력 : ");
		num2 = sc.nextInt();
		System.out.println("증가값 입력 : ");
		num3 = sc.nextInt();
		
		for(i=num1; i<=num2; i+=num3) {
			result = result + i;
		}
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합: %d \n", num1, num2, num3, result);
	}	

}
