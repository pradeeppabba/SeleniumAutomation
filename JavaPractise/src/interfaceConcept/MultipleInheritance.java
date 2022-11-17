package interfaceConcept;


interface I1{
	void fun1();
}
interface I2{
	void fun2();
}
interface I3 extends I1,I2{
	void fun3();
}

public class MultipleInheritance implements I1,I2,I3{
	public void fun1() {
		System.out.println("fun1 defined in class");
		
	}
	public void fun2() {
		System.out.println("fun2 defined in class");
	}
	public void fun3() {
		System.out.println("fin3 defined in class");
	}

	public static void main(String[] args) {
		MultipleInheritance obj=new MultipleInheritance();
		System.out.println("w.r.t to class");
		obj.fun1();
		obj.fun2();
		obj.fun3();
		
		System.out.println("w.r.t to interface1");
		//I1 obj1=new I1(); //error cantnot instance interface
		I1 obj1=new MultipleInheritance();
		obj1.fun1();
		//obj1.fun2(); //error fun2() is undefined
		
		System.out.println("w.r.t to interface2");
		I2 obj2=new MultipleInheritance();
		obj2.fun2();
		
		System.out.println("w.r.t to interface3");
		I3 obj3=new MultipleInheritance();
		obj3.fun1();
		obj3.fun2();
		obj3.fun3();
		
		

	}

}
