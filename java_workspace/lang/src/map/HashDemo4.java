package map;

import java.util.ArrayList;
import java.util.HashMap;

public class HashDemo4 {
	
	public static void main(String[] args) {
		
		ArrayList<String> addresses = new ArrayList<String>();
		addresses.add("서울특별시 종로구 봉익동");
		addresses.add("경기도 부천시 원미동");
		addresses.add("경상남도 구미시");
		addresses.add("경상북도 영주시");
		addresses.add("경기도 고양시");
		addresses.add("서울특별시 종로구 봉익동");
		
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		for (String addr : addresses) {
			int endPoint = addr.indexOf(" ");
			String sido = addr.substring(0, endPoint);
			
			if(result.containsKey(sido)) {
				int count = result.get(sido);
				result.put(sido, count + 1);
			} else {
				result.put(sido, 1);
			}
		}
	}

}
