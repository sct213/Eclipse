
public class Star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int s;
		
		for(i=1; i<=6; i++) {
			for(s=1; s<i; s++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(i=1; i<=7; i++) {
			for(s=7; s>i; s--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}