package first;

public class Car {
	String name;
	int number;
	
	public void setName(String name) {
		this.name = name;
		System.out.println("Car Name is updated succesfully.");
	}
	
	public String getName() {
		return this.name;
	}
	
	/***
	 * 
	 * @param number denotes number field in Car Class.
	 */
	public void setNumber(int number) {
		this.number = number;
		System.out.println("Car Number is updated succesfully.");
	}
	
	public int getNumber() {
		return this.number;
	}
	
}
