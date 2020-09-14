package characterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo1 {
	
	public static void main(String[] args)  throws IOException{
		FileReader fr = new FileReader("c:/files/data.txt");
		
		//텍스트 파일을 읽기위해서는 무조건 이것을 써야함
		BufferedReader br = new BufferedReader(fr);
		
		int totalOrderPrice = 0;
		String text = null;
		while ((text=br.readLine()) !=null) {
			if (!text.isEmpty()) {
				String[] items = text.split(",");
				System.out.println(items[4]);
				int price = Integer.parseInt(items[4]); //"28000" ---> 28000
				totalOrderPrice += price;
			}
		}
		System.out.println("총 구매금액: " + totalOrderPrice);
		
		br.close();
	}
}
