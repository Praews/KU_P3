import Tax.Testpackage;

public class TestModifier {

	public static void main(String[] args) {
		TestPublic obj1 = new TestPublic();
		TestPrivate obj2 = new TestPrivate();
		TestProtected obj3 = new TestProtected();
		ChieldPro obj4 = new ChieldPro();
		Testpackage obj5 = new Testpackage();
		//Public
		System.out.println("Old salary = "+obj1.salary1);
		obj1.salary1 = 30000.0f;
		System.out.println("New salary = "+obj1.salary1);
		//Private
		System.out.println("obj2 = "+obj2.getSalary2());
		obj2.setSalary2(35000.0f);
		System.out.println("new obj2 = "+obj2.getSalary2());
		//Protected ใช้ใน package เดียวกัน
		System.out.println("Mom obj3 = "+obj3.salary3);
		System.out.println("Chield obj4 = "+obj4.salary3);
		obj4.salary3 = 45000.0f;
		System.out.println("New Cheild obj4 = "+obj4.salary3);
		//Package
		System.out.println("Cheild obj5 = "+obj5.salary4);
	}

}
