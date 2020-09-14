package array;

import java.util.Scanner;

public class ArrayDemo13 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int savePosition =0;
		String[] names = new String[20];
		int[] korArr = new int[20];
		int[] engArr = new int[20];
		int[] mathArr = new int[20];
		
		while (true) {
			System.out.println();
			System.out.println("[성적관리 프로그램]");
			System.out.println("----------------------------");
			System.out.println("1.조회  2.검색  3.입력  0.종료");
			System.out.println("----------------------------");
			
			System.out.print("메뉴선택> ");
			int menuNo=sc.nextInt();
			
			
			if (menuNo == 1) {
				System.out.println("[성적 조회]");   
				System.out.println("순번             이름            국어             영어           수학          총점           평균");
				for (int i=0; i<savePosition; i++) {
					System.out.print(i+1+"\t");
					System.out.print(names[i] + "\t");
					System.out.print(korArr[i]+ "\t");
					System.out.print(engArr[i]+ "\t");
					System.out.print(mathArr[i]+ "\t");
					int total = korArr[i] + engArr[i] + mathArr[i];
					int avg = total/3;
					System.out.print(total+"\t");
					System.out.print(avg);
				}
		
			} else if (menuNo ==2 ) {
				System.out.println("[성적 검색]");
				
				System.out.print("조회할 학생이름을 입력하세요: ");
				String searchName = sc.next();
				int index = -1;
				
				for (int i =0; i<savePosition; i++) {
					if (searchName.equals(names[i])) {
						index = i;
					}
				}
				if (index != -1) {
					System.out.println("[조회결과]");
					System.out.println("----------------------------------------");
					System.out.println("학생이름: " + names[index]);
					System.out.println("국어점수: " + korArr[index]);
					System.out.println("영어점수: " + engArr[index]);
					System.out.println("수학점수: " + mathArr[index]);
					int total = korArr[index] + engArr[index] + mathArr[index];
					System.out.println("총      점: " + total);
					System.out.println("평      균: " + total/3);
					System.out.println("----------------------------------------");
					
				}else {
					System.out.println("["+searchName+"]과 일치하는 성적정보가 존재하지 않습니다.");
				}
			
			} else if (menuNo ==3) {
				System.out.println("[성적 입력]");
				
				System.out.print("이름을 입력하세요: ");
				String name = sc.next();
				System.out.print("국어점수를 입력하세요: ");
				int kor = sc.nextInt();
				System.out.print("영어점수를 입력하세요: ");
				int eng = sc.nextInt();
				System.out.print("수학점수를 입력하세요: ");
				int math =sc.nextInt();
				
				names[savePosition] = name;
				korArr[savePosition] = kor;
				engArr[savePosition] = eng;
				mathArr[savePosition] = math;
				
				savePosition++;
				System.out.println("성적 정보가 저장되었습니다.");
				
			} else if (menuNo ==0) {
				break;
			}
			
			
		}
		System.out.println("[성적관리 프로그램]을 종료합니다.");
	}

}
