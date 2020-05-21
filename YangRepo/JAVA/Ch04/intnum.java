package Ch04;

import java.util.Scanner;

public class intnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 단부터 출력하시겠습니까?");
		int num = sc.nextInt();
		int j=1;
		if(num>9) {
			System.out.println("이 프로그램은 9단까지 출력가능합니다.");
		}
		
		while(num<=9) {
			
			if(num==3 || num==5) {
				System.out.println("<" + num + ">");
 			}
			while(j<=9) {
				System.out.println(num + " * " + j + " = " + (num*j));
				j++;
			}
			j=1;
			num++;
			System.out.println();
		}
		
	}

}
