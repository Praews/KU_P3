
public class TestVariable {

	public static void main(String[] args) {
		// VariableTest
		int i =1;	float f = 1.2f; double d = 2.5d;
		char c = 'A'; boolean bl = true;
		final double tax_rate = 0.5d; //ตัวแปรที่แก้ไขค่าไม่ได้
		String st = "Hello";
		
		System.out.println("char = "+c);
		System.out.println("int = "+i);
		System.out.println("boolean = "+bl);
		System.out.println("float = "+f);
		System.out.println("double = "+d);
		System.out.println("tax_rate = "+tax_rate);
		System.out.println("string = "+st);
		
		//AsciiTest
		System.out.println("Ascii of "+c+" is "+(int)c);
		System.out.println("Convert to BinaryAscii = "+Integer.toBinaryString((int)c));
		
		//BooleanTest
		boolean x = false;
		boolean y = true;
		boolean z = x||y;
		System.out.println("!x = "+!x);
		System.out.println("x&&y = "+(x&&y));
		System.out.println("x || y = "+z);
		
		//UnaryTest
		int A,B;
		A = 5;  B = A++;
		System.out.println("A = "+A+" B = "+B);
		A = 5;  B = ++A;
		System.out.println("A = "+A+" B = "+B);
		A = 5;  B = A-- + 4;
		System.out.println("A = "+A+" B = "+B);
		A = 5;  B = ++A + 4;
		System.out.println("A = "+A+" B = "+B);
		A = 5;  B = 5*A --;
		System.out.println("A = "+A+" B = "+B);
		
		//ImlicitTest แปลง
		float first = 5;
		int second = 4;
		System.out.println("float = "+first);
		System.out.println("int = "+second);
		first = second;
		System.out.println("float = "+first);
		
		//ExplicitTest
		double tax1; float vat1 = 0.07f;
		int price1 = 250;
		tax1 = (double)(vat1*price1);
		System.out.println("Tax1 = "+tax1);
		
		int tax2; float vat2 = 0.07f;
		int price2 = 250;
		tax2 = (int)(vat2*price2);
		System.out.println("Tax2 = "+tax2);
		
		//parseType แปลง string เป็น number
		String u = "25",v = "25.125";
		System.out.println(u+v);
		int u1 = Integer.parseInt(u);
		float v1 = Float.parseFloat(v);
		System.out.println(u1+v1);
		
		//toString
		int r = 25; float s = 25.25f;
		System.out.println(r+s);
		String r1 = Integer.toString(r);
		String s1 = Float.toString(s);
		System.out.println(r1+s1);
		
	}

}
