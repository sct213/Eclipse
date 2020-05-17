package Personal;

public class Num01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2; i<=9; i++) {
			while(i==3) {
				System.out.println("<3단>");
			}
				System.out.println("<5단>");
			
			for(int s=2; s<=9; s++) {
				System.out.printf("%d * %d = %d\n", i, s, i*s);
			}
			System.out.println("");
		}
	}
}
