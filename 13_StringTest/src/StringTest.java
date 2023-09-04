import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String msg1 = "JAVA";
		
		System.out.print("Enter msg2 = ");
		String msg2 = scan.nextLine();
		System.out.println("msg1 = "+msg1);
		System.out.println("msg2 = "+msg2);
		
		if(msg1==msg2) //to compare
			System.out.println("msg1 = msg2");
		else
			System.out.println("msg1 != msg2");
		
		msg1=msg2; //giving value
		System.out.println("msg1 = "+msg1);
		System.out.println("msg2 = "+msg2);
		if(msg1==msg2) //to compare
			System.out.println("msg1 == msg2");
		else
			System.out.println("msg1 != msg2");
		
		
		String msg3 = "JAVA";
		if(msg1.equals(msg3)) //to compare
			System.out.println("msg1 is equal to msg3");
		else
			System.out.println("msg1 is not equal to msg3");
		
		int n = msg1.compareTo(msg3);
		System.out.println("Result is "+n);
		
		msg1 = "Programming in ";
		msg3 = " Language";
		String msg0 = msg1.concat(msg2);//เชื่อม string
		System.out.println(msg0);
		msg0 = msg0+msg3;
		System.out.println(msg0);
		
		msg0 = msg1.substring(0,7);
		System.out.println("SubString = "+msg0);
		
		msg0 = "Programming in JAVA Language";
		msg0 = msg0.replace("JAVA", "PYTHON");
		System.out.println("Replace = "+msg0);
		
		msg0 = msg2.toUpperCase();
		System.out.println("UpperCase: " + msg0);
		
		msg0 = msg2.toLowerCase();
		System.out.println("LowerCase: " + msg0);
		
		System.out.println("Length: " + msg0.length());
		
		int char_at = 2;
		System.out.println("CharAt ["+char_at+"]: "+ msg2.charAt(char_at));
		System.out.println("Index Of [" + char_at + "]: " +msg2.indexOf("v"));
		
		System.out.println(msg2.indexOf("A"));
		System.out.println(msg2.startsWith("va"));
		System.out.println(msg2.endsWith("va"));
		
		System.out.println(msg2.lastIndexOf("a"));
		System.out.println(msg2.lastIndexOf("j"));
		
	}

}
