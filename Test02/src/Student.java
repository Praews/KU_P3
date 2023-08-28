
public class Student {
	//Attribute
	String name;
	int age;
	
	//Method
	public void setData() {
		name = "Java";
		age = 20;
	}
	
	public void getData() {
		System.out.println("Name is: "+name);
		System.out.println("Age is : "+age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
