package map;

import java.util.LinkedHashMap;
import java.util.Map;

class MyCache<K, V> extends LinkedHashMap<K, V> {

	private int capacity;

	public MyCache(int capacity) {
		super(capacity, 0.75f, true); // 초기 요량, 로드백터, 접근 순서

		this.capacity = capacity;

	}

	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		//캐시의 크리가 용량을 초과했을때, 가장 오래된 항복 제거 
		//return super.removeEldestEntry(eldest);
		return size()>capacity;
		
	}
	
	

}

public class LinkedHashMapTest01 {

	public static void main(String[] args) {

		Map<Object, Object> map = new LinkedHashMap<Object, Object>(3);

		map.put(1, "1");
		map.put(2, "2");
		map.put(3, "3");
		map.put(4, "4");

		System.out.println(map.size());

		// LinkedHashMap<Object, Object> cache=new LinkedHashMap<Object, Object>(3,
		// 0.75f, true);
		
		MyCache<Integer,String> cache=new MyCache<>(3);
		
		cache.put(1, "사과");
		cache.put(2, "배");
		cache.put(3, "바나나");
		
		System.out.println(cache.keySet());
		
		cache.get(1);
		System.out.println(cache.keySet());
		
		cache.put(4,"체리");
		System.out.println(cache.size());
		System.out.println(cache.keySet());
		
		

	}

}
