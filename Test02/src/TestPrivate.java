
public class TestPrivate {
	private float salary2 = 30000.0f;//ถ้าจะเข้าถึง att. private ต้องสร้าง set get

	public float getSalary2() {
		return salary2;
	}

	public void setSalary2(float salary2) {
		this.salary2 = salary2;
	}
}
