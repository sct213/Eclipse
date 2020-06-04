import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int mm = m - 45;
		// 항상 45분 일찍 설정하기에 -45를 한다.
		int hh = h;
		if(mm < 0){ // M이 0보다 작은 값이면 그 값에 60을 더한다.
			mm += 60;
			hh--; // 그리고 H를 1 줄인다.
			if(hh < 0){ // H가 0보다 작으면 24를 더한다.
				hh += 24;
			}
		}
		System.out.println(hh + " " + mm);

	}
}