package Iterator;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
public class Iterater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> rList = new ArrayList<>();
		// List 인터페이스는 메모리에 올릴 수 없기 때문에 ArrayList 클래스를 통해 
		// 메모리를 올림
		
		//List컬렉션 프레임워크에 데이터를 추가함
		rList.add("Hello");
		rList.add("양원석");
		rList.add("Byte");
		rList.add("String");
		
		// 배열 크기 출력 
		System.out.println("배열의 크기 " + rList.size());
		
		for(int i = 0; i < rList.size(); i++) {
			System.out.println("[" + i + "] 번째 배열 기억공간 : " + rList.get(i));
		}
		
		// List 컬렉션을 통해 저장된 데이터를 가져올때 for 문을 쓰지 않고, while문으로 쓰길 권장
		Iterator<String> it = rList.iterator();
		while(it.hasNext()) { 
		// 옆 칸에 데이터가 있다면 true
			String name = (String) it.next();
			// .next() 는 한칸씩 옆으로 이동 
			System.out.println("이름 : " + name);
			
		}
	}

}
