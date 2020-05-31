package Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> rL = new ArrayList <> ();
		
		rL.add("양원석");
		rL.add("홍길동");
		rL.add("임꺽정");
		rL.add("Hello");
		
		System.out.println("배열의 크기 " + rL.size());
		
		for(int i=0; i<rL.size(); i++) {
			System.out.println("[" + i + "]번째 배열의 기억공간 : " + rL.get(i));
		}
		Iterator<String> it = rL.iterator();
		
		while(it.hasNext()) {
			
			String name = (String) it.next();
			
			System.out.println("이름 : " + name);
		}
	}

}
