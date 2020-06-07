import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] list = new int[num];
		
		int nNum = sc.nextInt();
		
		for(int i=0; i<num; i++){
			list[i] = sc.nextInt();
		}
		
		int i=0;
		while(i < list.length){
			if(nNum > list[i]){
				System.out.println(list[i]);
				i++;
			} else {
				i++;
			}
		}
	}
}