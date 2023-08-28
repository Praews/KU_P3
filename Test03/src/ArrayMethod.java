import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMethod {

	public static void main(String[] args) {
		int age[] = {15,22,33,10,27,19};
		int age1[] = {15,22,33,10,27,19};
		System.out.println(".length ="+age.length);
		Arrays.sort(age);
		for(int i=0;i<age.length;i++) 
			System.out.printf("%d ",age[i]);
		
		//ถ้าเจอจะคืน index ที่ sort แล้ว, ถ้าไม่เจอจะคืน index ติดลบ
		int idx = Arrays.binarySearch(age, 10);
		System.out.println("\n.binarySearch = "+idx);
		//ไม่เจอ index
		idx = Arrays.binarySearch(age, 11);
		System.out.println("\n.binarySearch = "+idx);
		
		//.equals
		for(int i=0;i<age.length;i++) 
			System.out.printf("%d, ",age[i]);
		System.out.println("\n");
		for(int i=0;i<age1.length;i++) 
			System.out.printf("%d, ",age[i]);
		System.out.println("\nage == age1 : "+Arrays.equals(age, age1));
		Arrays.sort(age1);
		System.out.println("\nage == age1 : "+Arrays.equals(age, age1));
		
		

	}

}
