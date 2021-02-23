package javaclassesandobjects;

public class Pet {
	private  String name, location, type;
	private  int age;
	public  String empty, allAttributes;

	public Pet() {

	}
	//@Overloaded Constructor
	public Pet(String Name, String Type, int Age) {
		name = Name;
		type = Type;
		age = Age;
	}
	public String getName(){
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getType() {
		return type;
	}
	 void setName(String Name) {
		name = Name;
	}
	 void setAge(int Age) {
		age = Age;
	}
	 void setLocation(String Location) {
		location = Location;
	}

}
