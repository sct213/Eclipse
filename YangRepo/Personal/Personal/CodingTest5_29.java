package Personal;

public class CodingTest5_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int[] num = new int[90];
				int j = 11;
				int hap = 0;
				
				for(int i=0; i<=89; i++){
					num[i] = j;
					hap += num[i];
					j++;
				}
				int l= 11;
				int k = 0;
				
				while(l<=100){
					System.out.printf("num[%d] = %d\n", k, l);
					k++;
					l++;
				}
				System.out.println(hap);
			}
		}

