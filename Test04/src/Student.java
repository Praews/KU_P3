
public class Student {
	//Attribute
	String name;
	int id;
	
	//Constructor Method
	public Student(String name ,int id) { // name ที่รับ parameter เข้ามา
		this.name = name; // this.name คือ attribute
		this.id = id;
	}

	public void printStudent() {
		
		System.out.println("Name is "+this.name);
		System.out.println("Std Id is "+this.id);
		System.out.println("=============================");
	}
}
