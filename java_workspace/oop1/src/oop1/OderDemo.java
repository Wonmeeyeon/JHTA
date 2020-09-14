package oop1;

import java.util.Scanner;

public class OderDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Order[]orders = new Order[100];
		int saveposition =0;
		while (true) {
			System.out.println("===================================");
			System.out.println("1.조회	2.검색	3.입력	4.종료");
			System.out.println("===================================");
		
			System.out.println("숫자를 입력해주세요: ");
			int inputN = sc.nextInt();
		
			if (inputN == 1) {
				System.out.println("[회원 정보 조회]");
				System.out.println("고객명	고객등급	  총구매금액         적립포인트         사은품");
				System.out.println("===========================================");
			
			
			} else if (inputN == 2) {
				System.out.println("회원 이름을 입력해주세요: ");
				String name = sc.next();
				
			} else if (inputN == 3) {
					System.out.println("고객명을 입력해주세요");
					String name = sc.next();
					System.out.println("고객 등급을 입력해주세요");
					String grade = sc.next();
					System.out.println("총 구매 금액을 입력해주세요");
					int price = sc.nextInt();
					
					Order order = new Order();
					order.name = name;
					order.grade = grade;
					order.price = price;
					
					if (grade.equals("프리미어")) {
						order.point = (int)(order.price*0.05);
						
					} else if (grade.equals("에이스")){
						order.point = (int)(order.price*0.03);
						
					} else if (grade.equals("베스트")) {
						order.point = (int)(order.price*0.02);
					} else if (grade.equals("클래식")) {
						order.point = (int)(order.price*0.01);
					}
					orders[saveposition] = order;
					saveposition++;
//					order.point = 
////					order.gift = 
			} else if (inputN == 4) {
				System.out.println("서비스를 종료합니다.");
				break;
			}
		}
	}
}
