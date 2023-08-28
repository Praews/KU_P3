
public class Employee {
	//Encapsulation ซ่อนข้อมูล
	private float rate = 300.0f, work = 10.0f, pay ;
	int hour;
	
	float getRate() {
		return rate;
	}
	
	float getWork() {
		return work;
	}
	
	float calOt(float b) {
		pay = (hour*rate)/work;
		if (hour>10) {
			pay += b;
		}
		return pay;
	}

}
