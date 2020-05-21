package Ch04;

public class Ex5 {
public static void main(String [] args) {
	
	for(int i=1; i<=5; i++) {// 행의 개수 
			for(int s=1; s<=i; s++) { // 열의 갯수 
				System.out.print("*");
			
			}
			System.out.println();
		}
	}
}
