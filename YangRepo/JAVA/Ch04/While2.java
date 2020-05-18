package Ch04;

public class While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		sum = 0;
		int i=0;
		
		while(sum <=100) {
			System.out.printf("%d - %d\n", i, sum);
			sum += ++i;
		}
	}

}
