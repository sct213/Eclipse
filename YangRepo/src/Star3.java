
public class Star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int s;
		
		for(i=1; i<7; i++) {
			
			for(s=6; s>0; s--) {
				if(i<s) {
				System.out.print(" ");
			} else {
				System.out.print("*");
				}
		}
		System.out.println("");
	}
	}
}

