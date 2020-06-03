package Ch07;
import java.util.Scanner;	
public class length9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.println("문자열 입력 ==> ");
		str = s.nextLine();
		
		System.out.println("출력 문자열 ==> ");
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'o')
				System.out.printf("%c", '$');
			else
				System.out.printf("%c", str.charAt(i));
		}
	}

}
