//Interface class

import java.util.Scanner;

interface employee1{
	//Abstract method
	public float setOT(float s);
}

interface employee2{
	//Abstract method
	public float calOT(float s,int h);
}

//Multiple Inheritance
public class MultiInterfaceTest implements employee1,employee2{
	//implement interface (Overriding)
	public float setOT(float s) {
		return s/30;
	}
	public float calOT(float s,int h) {
		return setOT(s)*h;
	}

	public static void main(String[] args) {
		MultiInterfaceTest emp = new MultiInterfaceTest();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Salary : ");
		float salary = scan.nextFloat();
		
		System.out.println("Enter OT hour : ");
		int hr = scan.nextInt();
		
		System.out.println("OT Hour = "+hr);
		System.out.println("OT Rate = "+emp.setOT(salary));
		
		emp.setOT(salary);
		System.out.println("Total OT pay = "+emp.calOT(salary, hr));


	}

}
