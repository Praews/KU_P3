
public class TestClass_Object {

	public static void main(String[] args) {
		Student std = new Student();
		std.setData();
		std.getData();
		
		std.setName("noppasorn");
		std.setAge(20);
		System.out.println(std.getName());
		System.out.println(std.getAge());
	}

}
