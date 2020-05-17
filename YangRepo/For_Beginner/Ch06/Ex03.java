package Ch06;

public class Ex03 {
public static void main(String [] args) {
	int hap=0;
	int i;
	
	for(i=501; i<=1000; i+=2) {
		hap += i;
	}
	System.out.printf(" 500에서 1000까지의 홀수의 합 : %d \n", hap);
}
}
