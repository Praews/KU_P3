import java.util.Scanner;

class Employee{ //Super Class
	//protected คลาสแม่กับลูก ใช้ได้
	protected  float rate = 350;
}

class Daily_emp extends Employee{ //Sub Class
	
}
class Monthly_emp extends Employee{ //Sub Class
	
}
public class SupSubClassTest {

	public static void main(String[] args) {
		
		float r;
		Employee emp1 = new Employee();
		System.out.println("Employee Rate : "+emp1.rate+" Baht");
		
		System.out.print("Enter Daily Employee Rate = ");
		Scanner scan = new Scanner(System.in);
		r = scan.nextFloat();
		
		Daily_emp emp2 = new Daily_emp();
		emp2.rate = r;
		System.out.println("Daily Employee Rate : "+emp2.rate+" Baht");
		
		System.out.print("Enter Monthly Employee Salary = ");
		r = scan.nextFloat();
		Monthly_emp emp3 = new Monthly_emp();
		emp3.rate = r;
		System.out.print("Monthly Employee Rate : "+emp3.rate/30+" Baht");
}

}
