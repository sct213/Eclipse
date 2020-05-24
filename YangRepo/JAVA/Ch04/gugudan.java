package Ch04;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		int j=1;
		
		while(i==3 || i==5) {
			System.out.println("<" + i + ">");
			
			if(j<=9) {
				System.out.println(i + "*" + j + "=" + (i*j));
				j++;
			}
			j=1;
			i++;
			System.out.println();
		
		}
		
	}
}
