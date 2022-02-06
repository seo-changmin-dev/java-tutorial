package first;

public class CarExam {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.name = "Morning";
		car2.number = 7942;
		
		String name = car1.name;
		System.out.println(name);
		
		car1.name = "Genesis";
		System.out.println(name);
		
		car2.setName("Porter");
		car2.setNumber(3141);
		
		System.out.println(car2.getName());
		System.out.println(car2.getNumber());
	}
}
