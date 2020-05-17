package Ch06;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		int dan;
		
		System.out.println(" 몇 단을 출력하시겠습니까 ?");
		dan = sc.nextInt();
		
		for(i=1; i<=9; i++) {
			System.out.printf("%d X %d = %d \n", dan, i, dan*i);
			}
		}
	}


