package Ch04;

public class fdsfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		int j=1;
		
		while(i<=9){
			if(i==3 || i==5) {
				System.out.println("<"+ i + "단>\n");
			}
			while(j<=9){
				System.out.println(i + " X " + j + " = " + (i*j));
				j++;
			
			}
			j=1;
			i++;
			System.out.println();
		}
		
	}
	

}
