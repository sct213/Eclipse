package Collection;

import java.util.HashMap;
import java.util.Map;

public class ArrayListHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> pMap = new HashMap<>();
		
		pMap.put("name", "양원석");
		pMap.put("email", "yang991211@naver.com");
		pMap.put("dept", "데이터분석");
		
		System.out.println("--------------------");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("email"));
		System.out.println(pMap.get("dept"));
		System.out.println(pMap.get("오타"));
		System.out.println("--------------------");
	}

}
