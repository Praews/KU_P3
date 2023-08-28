import java.util.Arrays;
import java.util.Scanner;

public class ArratTest {

	public static void main(String[] args) {
		double sum = 0.00, avg;
		//ประกาศและใส่ค่าตัวแปร array 1 มิติ
		double score[] = {5,10,15,20};
		for(int i =0; i<score.length; i++)
			System.out.println(score[i]);
		
		//ประกาศ array 3 มิติ
		int[][][]room; //ประกาศ
		room = new int[2][3][4]; //สร้าง array 3 มิติ
		int[][]num = new int[3][2]; //ประกาศ+สร้าง array 2 มิติ
		
		//วนใส่ค่า array 2 มิติ
		for(int i=0; i<num.length; i++)//แถว
			for(int j=0; j<num[i].length;j++)//หลัก
				num[i][j] = i+1;
		
		//แสดงค่าใน  array 2 มิติ
		for(int i=0; i<num.length; i++)
			for(int j=0; j<num[i].length;j++)
				System.out.println(num[i][j]);
		
		//เติมเลขใน array
		Arrays.fill(score, 0);
		//แสดงค่าใน array 1 มิติ
		for(int i=0; i<score.length ; i++)
			System.out.printf("%.1f ,",score[i]);
		//วนใส่ค่าใน array 1 มิติ
		for(int i=0; i<score.length; i++)
			score[i] = i*2;
		System.out.println("\n");
		for(int i=0; i<score.length; i++)
			System.out.printf("%.1f,",score[i]);
		System.out.println("\n");
		
		//วนรับค่า array 1 มิติ
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<score.length; i++) {
			System.out.printf("Enter Number: "+(i+1)+"-->");
			score[i] = scan.nextDouble();
			//หาค่าเฉลี่ย
			sum += score[i];
			
		}
		//แสดงค่าใน array
		for(int i =0;i<score.length;i++)
			System.out.printf("%.1f, ",score[i]);
		//แสดงค่าเฉลี่ย
		avg = sum/score.length;
		System.out.println("\nAverage score = "+avg);
		
		
		
	}

}
