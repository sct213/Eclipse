package Ch04;

import java.util.Scanner;

public class While4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; //1~100 사이의 임의의 수 저
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("1과 100 사이의 정수를 입력하세요. >>");
			input = sc.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			}else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		}while(input!=answer); // 거짓이 돼서 끝
		System.out.println("정답입니다!");
	}

}
// 수를 입력한 횟수를 저장하여 점수를 매기는 시스템을 도입하면 좋을듯.