package edu.ruby.java.ch08.polymophism;

public class B4_동적바인딩 {
	//2단계 - 문제 4: 동적바인딩
	//Item 추상 클래스
	abstract class Item {
		private String name; // 제품명
		private double price; // 제품 가격
		private int stockQuantity; // 재고량

		public Item(String name, double price, int stockQuantity) {
			this.name = name;
			this.price = price;
			this.stockQuantity = stockQuantity;
		}
		
		public void reduceStock(int quantity) {
			stockQuantity -= quantity;
		}

		public void show() {
		System.out.println("name = " + name + "price = " + price + "stockQuantity = " + stockQuantity);
		}
	}

	//Electronics 클래스: Item 클래스 상속
	class Electronics extends Item {
		int madeYear;

		public Electronics(String name, double price, int stockQuantity, int madeYear) {
			super(name, price, stockQuantity);
			this.madeYear = madeYear;
		}

		@Override
		public void show() {
			super.show();
			System.out.println("madeYear = " + madeYear);	
		}
	}

	//Clothing 클래스: Item 클래스 상속
	class Clothing extends Item {
		int size;

		public Clothing(String name, double price, int stockQuantity, int size) {
			super(name, price, stockQuantity);
			this.size = size;
		}
			
		@Override
		public void show() {
			super.show();
			System.out.println("size = " + size);		
		}
	}

	//Discountable 인터페이스 정의
	interface Discountable {
		double getDiscountedPrice(double price);
}

	//SeasonalDiscount 클래스: Discountable 인터페이스 구현
	class SeasonalDiscount implements Discountable {
		private double discountRate;
		
		public double getDiscountedPrice(double price) {
		return price * (1 - discountRate);
		}
	}

	//Order 클래스
	class Order extends SeasonalDiscount {
		private final int N = 20;
		private Customer customer; // 고객명
		private Item[] items; // 주문 제품들
		private int[] quantities; // 주문 제품 수량들
		private String[] orderDates; // 주문일자들
		private static int count = 0;

		public Order(Customer customer, Item items, int quantities, String orderDates) {
			super(customer, items, quantities);
			this.count = count;
			System.out.println();
		}
		
		public void addItem(Item item, int quantity, String date) {
		}

		public double calculateTotal() {
			/*
			 * 할인없이 수량 단가로 비용 계산
			 */
			
		}

		public void printOrderSummary() {
			
		}

	//할인된 내역을 출력하는 메소드
		public void printDiscountDetails() {
			/*
			 * 정가 - 시즌 할인 적용 - 고객 할인 적용 => 할인된 가격 * 수량 > 총 지불 금액
			 */
	
		}
	}

	//Customer 추상 클래스 정의
	abstract class Customer {
		private String name;

		public Customer(String name, double price, int stockQuantity)
		
		abstract double applyDiscount(double totalAmount);
	}

	//RegularCustomer 클래스: Customer 클래스를 상속받음
	class RegularCustomer extends Customer {
		static final double REGULARDISCOUNT_RATE = 0.03;


	}

	//PremiumCustomer 클래스: Customer 클래스를 상속받음
	class PremiumCustomer extends Customer {
		static final double PREMIUMDISCOUNT_RATE = 0.1;


	}
	public class 실습과제_8장_B4_동적바인딩 {
		static void showItemsStock(Item[] items) {
			// 모든 아이템의 이름과 재고량, 가격 출력
			for (Item item : items) {
				item.show(); // 동적 바인딩에 의해 각 클래스의 show() 메서드가 호출됨
			}
		}

		public static void main(String[] args) {
			// Item 타입의 배열 생성
			Item[] items = new Item[4];

			// 배열에 전자제품과 의류패션 객체 추가
			items[0] = new Electronics("노트북", 1500, 100, 23);
			items[1] = new Clothing("티셔츠", 50, 100, 95);
			items[2] = new Electronics("휴대폰", 800, 100, 24);
			items[3] = new Clothing("청바지", 80, 100, 90);

			// 모든 아이템의 이름과 재고량, 가격 출력
			showItemsStock(items);

			// 고객 생성
			Customer regularCustomer = new RegularCustomer("홍길동");
			Customer premiumCustomer = new PremiumCustomer("강감찬");

			// 주문 생성 및 계산 (RegularCustomer)
			Order regularOrder = new Order(regularCustomer);
			regularOrder.addItem(items[0], 1, "240901");
			regularOrder.addItem(items[1], 2, "240902");

			regularOrder.printOrderSummary();
			regularOrder.printDiscountDetails(); // 할인된 내역 출력

			// 주문 생성 및 계산 (PremiumCustomer)
			Order premiumOrder = new Order(premiumCustomer);
			premiumOrder.addItem(items[1], 1, "240901");
			premiumOrder.addItem(items[3], 2, "240903");

			premiumOrder.printOrderSummary();
			premiumOrder.printDiscountDetails(); // 할인된 내역 출

			// 모든 아이템의 이름과 재고량, 가격 출력
			showItemsStock(items);
		}
	}
}
