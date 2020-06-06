import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] num = new int[k];

		float avg = 0;
		
		for(int i=0; i<num.length; i++){
			num[i] = sc.nextInt();
			avg += num[i];
		}
		System.out.printf("%2f", (avg/k));
		
	}
}