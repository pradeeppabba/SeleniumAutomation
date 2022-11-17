package abstractionConcept;

abstract class A{
	public void fun3() {
		System.out.println("fun3 of class A");
	}
	abstract void fun1();
}
class B extends  A{
	void fun2() {
		System.out.println("fun2 of class B");
	}
	
	void fun1() {
		System.out.println("fun1 of class A");
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
	//	A obj=new A(); //direct obj create abstract class
		A obj=new B(); //indirect object create abstract class
		obj.fun1();
		obj.fun3();
	//	obj.fun2(); //jvm will serach in parent class ,if it is their then
		B obj1=new B(); // direct object create to the child class
		obj1.fun1();
		obj1.fun2();
		obj1.fun3();

	}

}
