package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
	
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		
		names.add("홍길동");
		names.add("홍길동");
		names.add("김유신");
		names.add("강감찬");
		names.add("이순신");
		names.add("류관순");
		names.add("안중근");
		
		// 꺼내기
		// Enhanced-for문  // 값을 꺼낼 때 Enhanced-for문이 가장 적합
		for (String x: names) {
			System.out.println(x);
		}
		System.out.println();
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			String data = itr.next();
			System.out.println(data);
		}
		System.out.println();
		
		// 저장된 객체의 객수 조회
		int size = names.size();
		System.out.println("저장된 객체의 객수 : "+ size);
		//전부삭제
		names.clear();
		System.out.println("전체 객체 삭제 완료");
		
		// 비어있으면 true를 반환
		boolean empty = names.isEmpty();
		System.out.println("비어있는가? " + empty);
		
		System.out.println(names);
	}

}
