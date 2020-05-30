package Personal;

public class CodingTest5_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[90];
		
		int j=11;
		int hap = 0;
		for(int i=0; i<=89; i++) {
			num[i] = j;
			j++;
			
			hap += num[i];
		}
		
		int k=11;
		int i=0;
		while(k<=100) {
			System.out.printf("num[%d] = %d \n", i, k);
			i++;
			k++;
		}
		System.out.println("합은 : " + hap);
	}

}
