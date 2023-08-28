import java.util.Scanner;

public class EncapTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Enter OT hour: ");
		emp.hour = scan.nextInt();
		
		System.out.println("Total OT pay = "+emp.getRate()+" * "
		+emp.hour+" / "+emp.getWork()+" = "+emp.calOt(100)+" Baht");

	}

}
