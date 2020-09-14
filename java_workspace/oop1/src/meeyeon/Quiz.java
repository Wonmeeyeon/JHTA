package meeyeon;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		
		String[] arr = {"O", "O", "X", "X", "O", "X", "X", "O", "O", "O"};
		
		int total = 0;
		int num = 1; 
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i].equals("O")) {
				total+=num;
				num++;
			}else {
				num=1;
			}
		}
		System.out.println(total);
	}
	

}
