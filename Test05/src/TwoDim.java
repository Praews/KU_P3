
public class TwoDim {
	//Attribute
	private double width,height; //private ต้องมีการ getter setter

	//Constructor method 
	TwoDim(){
		width = 0;
		height = 0;
	}
	
	//constructor method (overloading)
	TwoDim(double w,double h){
		width = w;
		height = h;
	}
	
	void showDim() {
		System.out.println("Width = "+width+" | Height = "+height);
	}
	
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	double area() {
		return 0;
	}
}

class Triangle extends TwoDim{
	private String styles;
	
	//Constructor method
	Triangle(String s,double w,double h){
		super(w,h);
		styles = s;
	}
	
	void showStyles() {
		System.out.println("Styles = "+styles);
		System.out.println("Width = "+getWidth()+", Width = "+getHeight());
	}
	
	double area() {//overriding method มีชื่อเดียวกับคลาสแม่
		
		//attribute เป็น private เลยต้องเรียกใช้ผ่าน method get()
		return (getWidth()*getHeight())/2;
	}
}
class Rectangle extends TwoDim{
	//Constructor method
	Rectangle(double w,double h){
		super(w,h);
	}
	
	double area() {//overriding method
		return (getWidth()*getHeight());
	}
	boolean isSquare() {
		if(getWidth()== getHeight()) {
			return true;
		}
		return false;
	}
}
