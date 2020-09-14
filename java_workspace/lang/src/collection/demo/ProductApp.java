package collection.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import vo.Product;

public class ProductApp {
	public static void main(String[] args) {
		ProductRepo repo = new ProductRepo(); 
		
		// 상품정보를 저장하는 ArrayList객체 생성
		ArrayList<Product> db = new ArrayList<Product>();
		
		while (true) {
			try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("========================================");
			System.out.println("1.전체조회   2.검색  3.등록   4.종료");
			System.out.println("========================================");
			
			System.out.println("메뉴를 선책하세요: ");
			int menuNo = scanner.nextInt();
			
			if (menuNo ==1) {
				System.out.println("[전체 상품 조회]");
				
				ArrayList<Product> products = repo.getAllProducts();
				if (products.isEmpty()) {
					System.out.println("### 조회된 상품이 없습니다.");
				} else {
					System.out.println("상품번호\t상품명\t가격");
					System.out.println();
					for (Product product : products) {
						System.out.print(product.getNo()+"\t");
						System.out.print(product.getName()+"\t");
						System.out.println(product.getPrice()+"\t");
					}
				}
			} else if (menuNo==2) {
				System.out.println("[상품 검색]");
				
				System.out.print("검색어를 입력하세요: ");
				String keyword = scanner.next();
				
				ArrayList<Product> products = repo.searchProducts(keyword);
				if (products.isEmpty()) {
					System.out.println("### ["+keyword+"] 검색어에 해당하는 상품을 찾을 수 없습니다.");
				} else {
					System.out.println("전체 ["+products.size()+"]건이 조회되었습니다.");
					
					System.out.println("상품번호\t상품명\t가격");
					for (Product product : products) {
						System.out.print(product.getNo()+"\t");
						System.out.print(product.getName()+"\t");
						System.out.println(product.getPrice()+"\t");
					}
				}
				
			} else if (menuNo==3) {
				System.out.println("[신규 상품 등록]");
				
				System.out.println("상품명을 입력하세요: ");
				String name = scanner.next();
				System.out.println("제조사를 입력하세요: ");
				String maker = scanner.next();
				System.out.println("가격을 입력하세요: ");
				int price = scanner.nextInt();
				
				Product product = new Product();
				product.setName(name);
				product.setMaker(maker);
				product.setPrice(price);
				
				repo.insertProducts(product);
				System.out.println("### 신규 상품이 등록되었습니다.");
			} else if (menuNo==0) {
				break;
				
			}
			} catch (Exception e) {
				System.out.println("### 메인메뉴로 되돌아갑니다.");
			}
		}
		
	}

}
