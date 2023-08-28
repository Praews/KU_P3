
public class ConstructorTest {

	public static void main(String[] args) {
		//default constructor Employer
		Employer obj1 = new Employer();
		System.out.println(obj1.id+"-->"+obj1.salary);
		
		//เรียก employer ที่รับค่าเป็น String
		Employer obj2 = new Employer("001");
		System.out.println(obj2.id+"-->"+obj2.salary);
		
		//เรียก employer ที่รับค่าเป็นตัวเลข
		Employer obj3 = new Employer(20000);
		System.out.println(obj3.id+"-->"+obj3.salary);
		
		Employee obj4 = new Employee(30000);
		System.out.println(obj4.id+"-->"+obj4.salary);
		
		Employee obj5 = new Employee("e004",20000);
		System.out.println(obj5.id+"-->"+obj5.salary);
		
		//Constructor (Shapes)
		TwoDim shapes1 = new TwoDim(5,10);
		System.out.println("Width = "+shapes1.getWidth()+" | Height = "+shapes1.getHeight());

		//Constructor (Shapes)
		TwoDim shapes2 = new TwoDim();
		System.out.println("Width = "+shapes2.getWidth()+" | Height = "+shapes2.getHeight());
		
		TwoDim shapes3 = new TwoDim();
		shapes3.showDim();
		
		//เรียก method triangle
		Triangle shapes4 = new Triangle("Triangle",15,30);
		shapes4.showStyles();
		System.out.println("Area = "+shapes4.area());
		
		Rectangle shapes5 = new Rectangle(9,9);
		System.out.println("\nIs Square : "+shapes5.isSquare());
		System.out.println("Area = "+shapes5.area());
	}

}
