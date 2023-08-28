import java.util.ArrayList;

public class ArrayListMethod {

	public static void main(String[] args) {
		ArrayList num = new ArrayList();
		for(int i =0;i<5;i++)
			num.add(i+1);
		for(int i = 0;i<num.size();i++)
			System.out.print(num.get(i)+" ");
		System.out.println();
		//add ค่า
		num.add(6);
		for(int i = 0;i<num.size();i++)
			System.out.print(num.get(i)+" ");
		System.out.println();
		//add ค่าที่ index ที่เลือก
		num.add(0,7);
		for(int i = 0;i<num.size();i++)
			System.out.print(num.get(i)+" ");
		//remove ที่ index
		System.out.println();
		num.remove(0);
		for(int i = 0;i<num.size();i++)
			System.out.print(num.get(i)+" ");
		//หา index
		System.out.println();
		System.out.println("indexof = "+num.indexOf(3));
		System.out.println("indexof = "+num.indexOf(7));
	
		//ForEachArray
		double[]score = {18.5,40.25,78.45};
		for(double fea :score)
			System.out.println(fea+" = "+(fea/100)+"/%");
		

	}

}
