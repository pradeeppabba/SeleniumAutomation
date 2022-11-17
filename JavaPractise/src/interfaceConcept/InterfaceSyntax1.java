package interfaceConcept;

interface Demo1{
	int a=10;
	void fun1();
}

public class InterfaceSyntax1 implements Demo1 {
	public void fun1() {
		System.out.println("fun1 of class");
	}
	

	public static void main(String[] args) {
		Demo1 obj=new InterfaceSyntax1();
		System.out.println(obj.a);
		obj.fun1();

	}

}
