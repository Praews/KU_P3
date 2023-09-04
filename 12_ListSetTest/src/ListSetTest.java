import java.util.*;
public class ListSetTest {

	public static void main(String[] args) {
		// List
		LinkedList A = new LinkedList();
		LinkedList B = new LinkedList();
		
		A.add("Ant");
		A.add("Bat");
		A.add("Cat");
		A.add(1,"Dog");
	
		System.out.println("Element number = "+A.size());
		for(int i =0;i<A.size();i++)
			System.out.print(A.get(i)+" , ");
		System.out.println();
		if(A.contains("Cat")) { //หา index ของคำที่ต้องการ
			System.out.println("index of "+A.indexOf("Cat")+" = "+A.get(A.indexOf("Cat")));
		}
		
		
		
		
		

	}

}
