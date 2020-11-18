/*
 	작성자: 20174046 채희찬
 	작성일: 2020.10.02
	프로그램명: JAVA프로그래밍 예제 4-3
*/
public class Circle {
	int radius;
	String name;
	
	public Circle() {
		radius = 1;		//radius의 초기값은 1
		name = "";	
	}
	
	public Circle(int r, String n) {
		radius = r;
		name = n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle(10, "자바피자");		//Circle 객체 생성, 반지름 10
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
