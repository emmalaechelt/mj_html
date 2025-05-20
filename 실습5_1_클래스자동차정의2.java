package edu.ruby.java.ch06;

class Car {
	String manufacturer; // 제조사
	String model; // 모델명
	double weight; // 차중량 (kg)
	int length; // 전장(mm)
	int width; // 전폭(mm)
	int speed;

	public Car(String manufacturer, String model, double weight, int length, int width, int speed) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.speed = speed;
	}

	public String getSegment() {
		if (length < 4200)
			return "B-세그먼트(소형차)";
		else if (length < 4600)
			return "C-세그먼트 (준중형, 소형 패밀리카)";
		else if (length < 4900)
			return "D-세그먼트 (중형차, 패밀리 세단)";
		else if (length < 5100)
			return "E-세그먼트 (대형차, 고급 세단)";
		else
			return "F-세그먼트 (초대형차, 플래그십 세단)";
	}

	public void checkSpeeding(int speedLimit) {
		if (speed > speedLimit) {
			System.out.println("과속 경고!");
		} else {
			System.out.println("정상 주행");
		}
	}
	public void checkSpeeding() {
        if (speed > 60) {
            System.out.println("과속 경고!");
        } else {
            System.out.println("정상 주행");
        }
    }

	public String toString() {
		return "제조사=" + manufacturer + ", 모델= " + model + ", 중량= " + weight + ", 전장= " + length + ", 전폭= " + width + ", 속도= " + speed;
	}
}
     
public class 실습5_1_클래스자동차정의2 {
	public static void main(String[] args) {
	        // 자동차 객체 생성
		
	   Car car1 = new Car("Hyundai", "Sonata", 1400,4600,1800, 95);
	   Car car2 = new Car("BMW", "M3", 1200, 4500, 1700, 110);

	   // 도로별 제한 속도 설정
	   int cityLimit = 50;  // 도심 제한 속도
	   int highwayLimit = 100; // 고속도로 제한 속도

	        // 과속 여부 확인
	        System.out.println("도심 주행 테스트:");
	        car1.checkSpeeding(cityLimit); // 도심에서 주행
	        car2.checkSpeeding(cityLimit);
	        
	        car1.checkSpeeding(); // method overloading
	        car2.checkSpeeding(); // method overloading
	        
	        System.out.println("고속도로 주행 테스트:");
	        car1.checkSpeeding(highwayLimit); // 고속도로에서 주행
	        car2.checkSpeeding(highwayLimit);
	        
	        System.out.println("차량 크기 분류:");
	        System.out.println(car1.getSegment());
	        System.out.println(car2.getSegment());
	        
	        System.out.println("차량 객체의 출력:");
	        System.out.println(car1);
	        System.out.println(car2);
	    }
}
