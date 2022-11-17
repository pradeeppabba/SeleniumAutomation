package inheritance;

class person{
	public void show() {
		System.out.println(" i am from person class");
	}
}
class person1 extends person{
	public void read() {
		System.out.println(" i am from person1 class");
	}
}
class person2 extends person{
	public void close() {
		System.out.println(" i am from person2 class");
	}
}

public class MultipleInheritance extends person2 {
	
	 

	public static void main(String[] args) {
		person2 obj=new person2();
		
		

	}

}
