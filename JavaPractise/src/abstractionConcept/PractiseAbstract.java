package abstractionConcept;

abstract class Demo1 {
	abstract void fun1();

}
class Demo2 extends Demo1{
	void fun1() {
		System.out.println("fun1 of practiseAbstract");
	}
	
}
public class PractiseAbstract{
	public static void main(String[] args) {
		Demo1 obj=new Demo2();
		obj.fun1();
	}
	
}
