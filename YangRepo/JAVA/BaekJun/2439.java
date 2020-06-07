import java.util.*;
 
class Main {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i=0; i<num; i++) { 
			
			for(int j=i+1; j<num; j++) {
			
				System.out.print(" ");
				
				
			}
			
			for(int k=num-i; k<=num; k++) {
				
				System.out.print("*");   
			}            
					 
			System.out.println();            
		}
	}
}
