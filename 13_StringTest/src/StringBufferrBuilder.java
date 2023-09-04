
public class StringBufferrBuilder {

	public static void main(String[] args) {
		
		System.out.println("================String================");
		String name1 = "Brown";
		name1 = name1.concat(" Smith");
		System.out.println("name1 = "+name1);
		System.out.println("================StringBuffer================");
		StringBuffer name2 = new StringBuffer("Paul");
		name2.append(" Smith");
		System.out.println("name2 = "+name2);
		

		System.out.println("================String================");
		System.out.println("name1.replace = "+name1.replace("h", "e"));
		
		System.out.println("================StringBuffer================");
		System.out.println("name2.insert = "+name2.insert(4,"a"));
		
		System.out.println("================StringBuilder================");
		StringBuilder name3 = new StringBuilder(name2);
		System.out.println("name3 = "+name3);
		System.out.println("name3.delete = "+name3.delete(4, 5));
		System.out.println("name.length = "+name3.length());
	}

}
