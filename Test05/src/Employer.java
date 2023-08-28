
public class Employer { // super class
	//Attribute
	public String id;
	public double salary;
	
	//Constructor method 
	public Employer() { // constructor เข้ามาทำตัวแรก
		
		salary = 0.1;
	}
	
	public Employer(String n) { // overloading constructor
		id = n;
	}
	
	public Employer(double s) {// overloading constructor
		this("e002");// เรียก constructor ในบรรทัดแรก
		salary = s;
	}
}

class Employee extends Employer{ //sub class
	//Constructor method
	public Employee(double s) {
		super("e003"); //ต้องอยู่บรรทัดแรกเท่านั้น
		salary = s;
	}
	public Employee(String n,double s) {
		//super("e002");
		id = n;
		salary = s;
	}
	
}
