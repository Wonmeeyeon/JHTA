package jeongseok_examples.Chapter04;

public class Ex4_9 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
		for(int i=1;i<=5;i++) {
			System.out.print(i);
			System.out.println();
		}
		//System.out.println("i: "+i); for문 안에서 (int i =1; 어쩌고 하면서 i를 만들면 for문 밖으로 안 나옴 
		

		int i;
		for (i=2; i<=5; i++) {
			i++;
		}
		System.out.println("i: "+i); // for문 앞에 int i; 해놓고 for문에서 (i=2 어쩌고 하면서 갖다 쓰면 for문 밖으로 나옴
		
		
	
	}
	
}
