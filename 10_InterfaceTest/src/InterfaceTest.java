import java.util.Scanner;

interface employee{//Interface class
	//Abstract method
	public void setOT(float s);
	public float calOT(int h,float s);
}
public class InterfaceTest implements employee{
	//Overriding (implement interface)
	public void setOT(float s) {
		System.out.println("OT rate = "+s+" Baht/Hour.");
	}
	public float calOT(int h,float s) {
		return h*s;
	}
	
	public static void main(String[] args) {
		InterfaceTest emp = new InterfaceTest();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter OT rate : ");
		float salary = scan.nextFloat();
		
		System.out.println("Enter OT hour : ");
		int hr = scan.nextInt();
		
		System.out.println("OT Hour = "+hr);
		
		emp.setOT(salary);
		System.out.println("Total OT pay = "+emp.calOT(hr, salary));

	}

}
