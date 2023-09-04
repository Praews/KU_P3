import java.util.Scanner;
import java.util.*;
class ProductDetail{
	String pcode,date,id,size,name;
	int n;
	ArrayList code = new ArrayList();
	void inputdata() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter product code => ddmmyyyy0000MName (Press x to exit) : ");
		do {
			System.out.print("product code : ");
			pcode = scan.nextLine();
			if(!(pcode.equalsIgnoreCase("x"))) {
				code.add(pcode);
			}
		}while(!(pcode.equalsIgnoreCase("x")));
	}
	void showdata() {
		if(code.size()>0) {
			System.out.printf("%-8s %-6s %-5s %-20s\n","date","id","size","name");//-ขยับมา 8 ช่องทางซ้าย
			for(int i=0;i<code.size();i++) {
				date = getinfo(code.get(i).toString(),0,8);//method ตัดค่า
				id = getinfo(code.get(i).toString(),8,12);
				size = getinfo(code.get(i).toString(),12,13);
				name = getinfo(code.get(i).toString(),13,code.get(i).toString().length());
				
				System.out.printf("%-8s %-6s %-5s %-20s\n",date,id,size,name);
			}
			
		}
	}
	String getinfo(String code,int a,int b) {
		String info = code.substring(a,b);
		return info;
	}
}
public class StringProject {

	public static void main(String[] args) {
		
		ProductDetail product = new ProductDetail();
		product.inputdata();
		product.showdata();

	}

}
