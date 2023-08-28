import java.util.Scanner;
class employee{ //Super Class
	protected float rate = 300.0f, work = 10.0f,pay;
	
	public employee(int h) {//Constructor Method
		pay = h*rate/work;
	}
	public employee(int h,float r) {//Overloading Constructor Method
		pay = h*rate/work;
	}
	public employee(int h,float r,float b) {//Overloading Constructor Method
		pay = h*rate/work;
	}
}
class daily_emp extends employee{//SubClass
	public daily_emp(int h,float r) {//Constructor Method of SubClass
		super(h,r);
	}
}
class mothly_emp extends employee{//SubClass
	public mothly_emp(int h,float r,float b) {//Constructor Method of SubClass
		super(h,r,b);
	}
}



public class InheritOverLoadTest {

	public static void main(String[] args) {
		float rate ,bonus;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter OT hour : ");
		int hour = scan.nextInt();
		
		
		employee emp1 = new employee(hour);
		System.out.println("Employee OT Pay : "+hour+" * "
		+emp1.rate+" / "+emp1.work+" = "+emp1.pay+" Baht");
		
		System.out.println("Enter Daily Employee Rate : ");
		rate = scan.nextFloat();
		daily_emp emp2 = new daily_emp(hour,rate);
		System.out.println("Daily Employee OT Pay : "+hour+" * "+rate+
				" / "+emp2.work+" = "+emp2.pay+" Baht");

		System.out.println("Enter Monthly Employee Rate : ");
		float salary = scan.nextFloat();
		rate = salary/30;
		System.out.println("Enter Bonus : ");
		bonus = scan.nextFloat();
		mothly_emp emp3 = new mothly_emp(hour,rate,bonus);
		System.out.println("Monthly Employee OT Pay : "+hour+" * "+rate+
				" / "+emp3.work+" = "+emp3.pay+" Baht");
	}

}
