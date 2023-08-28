
public class PassByRef {

	public static void main(String[] args) {
		
		Student myStudent = new Student("Noppasorn",64216);
		
		System.out.println("In main()Before");
		myStudent.printStudent();
		
		changeStudent(myStudent,"John",64211);//ส่งค่า pass by reference
		System.out.println("In main()After");
		myStudent.printStudent();

	}
	//ส่งตำแหน่งอ้างอิง
	public static void changeStudent(Student st,String name,int id) {
		st.name = name;
		st.id = id;
		System.out.println("In changeStudentName Method");
		st.printStudent();
		
	}

}
