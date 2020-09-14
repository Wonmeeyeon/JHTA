package oop4;

public class ProductService {
	
	Product[] db =new Product[20];
	int position = 0;
	

	// 배열에 저장된 모든 상품정보를 출력한다.
	void printAllProducts() {
		System.out.println("========== 모든 상품 정보 =========");
		System.out.println("상품명       제조사         카테고리          가격       할인율        재고량       품절여부");
		for (int i=0; i<position; i++) {
			Product product = db[i];
			System.out.print(product.name+"\t");
			System.out.print(product.maker+"\t");
			System.out.print(product.category+"\t");
			System.out.print(product.price+"\t");
			System.out.print(product.discountRate+"\t");
			System.out.print(product.stock+"\t");
			System.out.println(product.isSoldOut+"\t");
		}
		
	}
	// 상품객체(새상품, 이월상품)를 전달받아서 배열에 저장한다.
	void insertProduct(Product product) {
		db[position] = product ;
		position++;
		
	}
	// 상품명과 입고량을 전달받아서 이미 배열에 저장된 상품의 재고량을 증가시킨다.
	void addProductStock(String name, int amount) {
		Product product = null;
		
		for (int i=0; i<position; i++) {
			if (name.equals(db[i].name)) {
				product = db[i];
				break;
			} 
		}
		if (product != null ) {
			product.stock += amount;
			
		}
	}
	// 상품명과 출고량을 전달받아서 배열에서 해당 상품을 찾아서 재고량을 감소시킨다.
	// 단, 재고량보다 출고량이 많은 경우 오류 메세지를 표시한다.
	// 단, 재고량이 0이 되면 해당상품의 절판여부를  true로 설정한다.
	
	void exportProduct(String name, int amount) {
	
		Product product = null;
		
		for (int i=0; i<position; i++) {
			if (name.equals(db[i].name)) {
				product = db[i];
				break;
			} 
		}
		if (product != null && product.stock >= amount ) {
			product.stock -= amount;
			
		} else if (product != null && product.stock < amount) {
			System.out.println("재고량이 부족합니다.");
		}
		if (product != null && product.stock == 0 ) {
			product.isSoldOut = true;
		}
	}	
	
	// 상품명을 전달받아서 배열에서 상품명이 일치하는 상품정보를 출력한다.
	void printProductsByName (String name) {
		
	}
	// 제조사명을 전달받아서 배열에서 제조사명이 일치하는 상품정보를 출력한다.
	void printProductsBymaker (String maker) {
		
	}
	// 카테고리명을 전달받아서 배열에서 카테고리명이 일치하는 상품정보를 출력한다.
	void printProductsBycategory (String category) {
		
	}
	// 최고가격과 최저가격을 전달받아서 배열에서 최고가격과 최저가격 범위에 속하는 상품정보를 출력한다.
	void printProductsByPrice (int minPrice, int maxPrice) {
		
	}
}
