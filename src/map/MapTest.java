package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


interface A{
	class B{}
	interface C{}
}

public class MapTest {

	public static void main(String[] args) {
		
		
		//K-문자열, V-클래스, 리스트
		//데이터 저장 or 삽입
		//중간 삽입 없다
		
		Map<Integer, String> hashmap=new HashMap<>();
		
	
		
		hashmap.put(1, "몽여름");
		
		hashmap.put(2, "몽");
		
		hashmap.put(3, "여름");
		
		hashmap.put(null, null);
		
		
		hashmap.remove(3);
		
		
		
		hashmap.put(null, "널데이터");  
		
		hashmap.put(1, "여름몽");
	
		
		/*
		System.out.println("길이" + hashmap.size());
		
		System.out.println(hashmap.get(1));  

	
		
		System.out.println(hashmap.get(2));  //키를 통해 읽어올수 있다
		System.out.println(hashmap.get(3));  //키를 통해 읽어올수 있다
		System.out.println(hashmap.get(null));  //키를 통해 읽어올수 있다
		*/
		
		
		
		//get(키) : 키가 없는 경우 null반환
		
		//key데이터만 set계열로 변환 : keySet()메서드 활용
		
		hashmap.keySet();
		
		
		Set<Integer> keys=hashmap.keySet();
		
		
		
		for(Integer key: keys) {
			
			System.out.println(key + ":"+ hashmap.get(key));
			
		}
		
		
		//+ ":"+ hashmap.get(key)
		
		//hashmap.clear();
		//System.out.println(hashmap.size());
		
		
		
		
			
		}
	
	}

