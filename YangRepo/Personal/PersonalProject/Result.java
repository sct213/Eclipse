package PersonalProject;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1번 계산기, 2번 별찍기, 3번 구구단 중 1,2,3으로 번호를 입력하세요. : ");
		int num1 = sc.nextInt();
		
		switch(num1) {
		case 1:
			int n1;
			int n2;
			char ch;
			
			System.out.println("첫번째 계산할 값을 입력하세요. : ");
			n1 = sc.nextInt();
			
			System.out.println("계산할 연산자를 입력하세요. : ");
			ch = sc.next().charAt(0);
			
			System.out.println("두번째 계산할 값을 입력하세요. : ");
			n2 = sc.nextInt();
			
			if(ch=='+') {
				System.out.println(n1 + "+ " + n2 + " = " + (n1+n2));
			}else if(ch=='-') {
				System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
			}else if(ch=='*') {
				System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
			}else if(ch=='/') {
				System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
			}else if(ch=='%') {
				System.out.println(n1 + " %% " + n2 + " = " + (n1%n2));
			}
			System.out.println("계산이 완료되었습니다.");
			break;
			//계산기 모드 
		case 2:
			System.out.println("1: 아래 2: 오른쪽 정렬 3: 왼쪽 정렬 ");
			int starMod = sc.nextInt();
			switch(starMod) {
				case 1:
				System.out.println("몇개의 별을 입력하시겠습니까 :");
				int starNum = sc.nextInt();
				int star;
				for(star=1; star<=starNum; star++) {
					System.out.println("*");
				}
				break;
			}
			break;
		case 3:
			break;
		}
		
		
	}

}
