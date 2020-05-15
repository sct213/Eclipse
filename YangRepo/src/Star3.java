
public class Star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=3; i<=8; i++) {
			if(i==3) {
				System.out.println("<3단>");
			}else if(i==5){
				System.out.println("<5단>");
			}
			for(int s=1; s<=9; s++) {
				System.out.printf("%d * %d = %d \n", i, s, i*s);
			}
			System.out.println("");
		}
	}
}

