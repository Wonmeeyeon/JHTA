package oop1;

import java.util.Scanner;

public class OrderDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Order[]orders = new Order[100];
		int savePosition = 0;
		while (true) {
			System.out.println();
			System.out.println("=============================================");
			System.out.println("1.조회	2.검색	3.입력	0.종료");
			System.out.println("=============================================");
			
			System.out.println("번호를 입력하세요: ");
			int menuNum = sc.nextInt();
			
			if (menuNum ==1 ) {
				System.out.println("[고객 주문내용 조회]");
				if(savePosition ==0) {
					System.out.println("고객 주문내용이 존재하지 않습니다.");
				}else {
					System.out.println("고객명\t고객등급\t구매금액\t적립포인트\t사은품");
					System.out.println("=============================================");
					for (int i=0; i<savePosition; i++) {
						Order order = orders[i];
						System.out.print(order.name + "\t");
						System.out.print(order.grade + "\t");
						System.out.print(order.price + "\t");
						System.out.print(order.point + "\t");
						System.out.print(order.gift);
						
					}
				}
			} else if(menuNum ==2 ) {
				System.out.println("[고객 주문내용 검색]");
				
				System.out.println("검색조건을 입력하세여(N:이름, G:사은품)");
				String option = sc.next();
				System.out.println("검색내용을 입력하세요");
				String text =sc.next();
				
				System.out.println("고객명\t고객등급\t구매금액\t적립포인트\t사은품");
				System.out.println("=============================================");
				for (int i=0; i<savePosition; i++) {
					Order order = orders[i];
					
					boolean isFound = false;
					if (option.equals("N") && text.equals(order.name)) {
						
					}else if (option.equals("G") && text.equals(order.gift)) {
						isFound = true;
						
					}
					if (isFound) {
						System.out.println(order.name + "\t");
						System.out.println(order.grade + "\t");
						System.out.println(order.price + "\t");
						System.out.println(order.point + "\t");
						System.out.println(order.gift);
					}
				}
			} else if (menuNum == 3) {
				System.out.println("[고객 주문내용 입력]");
				
				System.out.println("이름을 입력하세요");
				String name = sc.next();
				System.out.println("등급을 입력하세요");
				String grade = sc.next();
				System.out.println("총구매금액을 입력하세요");
				int price = sc.nextInt();
				
				Order order =new Order();
				order.name =name;
				order.grade = grade;
				order.price = price;
				
				if (order.grade.equals("프리미어")) {
					order.point = (int) (order.price*0.05);
				} else if (order.grade.equals("에이스")) {
					order.point = (int) (order.price*0.03);
				} else if (order.grade.equals("베스트")) {
					order.point = (int) (order.price*0.02);
				} else if (order.grade.equals("클래식")) {
					order.point = (int) (order.price*0.01);
				}
				
				if (order.price >=5000000) {
					order.gift = "숙박권";
					
				} else if (order.price >= 1000000) {
					order.gift = "상품권";
				} else if (order.price >= 500000) {
					order.gift = "할인권";
				} else {
					order.gift = "주차권";	
				}
				
				orders[savePosition] = order;
				savePosition ++;
			} else if (menuNum == 0 ) {
				System.out.println("[고객 주문내용 관리 프로그램 종료]");
				break;
				
			}
			
		}
		sc.close(); //스캐너 기능 반납처리법 while(반복문) 밖에 반드시 위치해야 한다.
		
		
		
		
		
		
		
	}

}
