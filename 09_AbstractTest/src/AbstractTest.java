import java.util.Scanner;

abstract class Employee{ //Abstract class
	
	public abstract void setOT(float s); //Abstract Method
	
	public float calOT(int h,float s) {	//Concrete Method
		
		return h*s;
	}
}
public class AbstractTest extends Employee{
	//Overriding method
	public void setOT(float s) {
		System.out.println("OT rate : "+s+" Baht/Hour.");
	}
	
	public static void main(String[] args) {
		AbstractTest emp = new AbstractTest();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter OT rate : ");
		float salary = scan.nextFloat();
		
		System.out.println("Enter OT hour : ");
		int hr = scan.nextInt();
		
		emp.setOT(salary);
		System.out.println("Total OT pay = "+"("+hr+"*"+salary+") = "+emp.calOT(hr, salary)+" Baht.");
		
		


	}

}
