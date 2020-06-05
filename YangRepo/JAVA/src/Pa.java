package src;
import java.util.*;
public class Pa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ar = new ArrayList();
		
		ar.add("객체지향 프로그래밍");
		ar.add("하둡");
		ar.add("MongoDB");
		
		int a = 1;
		
		Iterator it = ar.iterator();
		
		while(it.hasNext()) {
			
			
			System.out.println(it.next());
			if(a==1) {
				System.out.println("<" + it.next() + ">");
			}else {
				System.out.println(it);
			}
			a++;
		}
	}

}
