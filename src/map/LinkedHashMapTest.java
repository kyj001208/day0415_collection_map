package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		
		
		LinkedHashMap<Integer, String> map=new LinkedHashMap<>();
		
		map.put(1, "사과");
		map.put(2, "배");
		map.put(3, "바나나");
		map.put(4, "체리");
		
		
		
		for(Integer key :map.keySet()) {
			
			System.out.println(key + map.get(key));
		}
		
		
		
		System.out.println();
		for(Map.Entry<Integer, String>entry:map.entrySet()) {
			
			Integer key=entry.getKey();
			
			String value=entry.getValue();
			
			System.out.println(key + value);
		}
		
		
		
		//순서를 제공하는 특징을 활용한 메서드 
		String data=map.getOrDefault(1,"과일");
		System.out.println(data);
		
		//키가 존재하지 않으면 null이 아닌 default에 정의된 값을 리턴 
		String data1=map.getOrDefault(5,"과일");
		System.out.println(data1);
	
	}

}
