package map;

import java.util.Hashtable;
import java.util.Map;

class AAA{
	
	String type;
	public AAA(String type) {
		this.type=type;
	}
	
}

class BBB{}

public class HashtableTest {
	
	public static void main(String[] args) {
		
		
		Map<String, Object> map=new Hashtable<String, Object>();
		//Object 경우 언박싱을 통해 사용해야한다.
		
		//데이터 추가(저장)
		map.put("name", "몽여름");
		map.put("old", 10);
		map.put("클래스", new AAA("생성자"));  //Object박스에 AAA객체 포장해서 넣었다. 박스이름은 "클래스"
		map.put("4", new BBB());  //
		
		
		//데이터 읽기
		
		System.out.println(map.get("name"));
		System.out.println(map.get("old"));
		System.out.println(map.get("클래스"));
		
		AAA map3=(AAA) map.get("클래스"); //클래스 박스를 언박싱 하기 위해 AAA에서 꺼내야하는데 캐스팅 통하여 언박싱
		
		System.out.println(map3.type);
		
		//수정
		map.put("4", 1000);
		
		
		//삭제
		
		map.remove("4");
		
		
	}

}
