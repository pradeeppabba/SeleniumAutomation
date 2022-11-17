package methods;

public class Demo2 {
	//with parameter without return type
	public void sum (int a,int b) {
		int res=a+b;
		System.out.println("sum of two values ="+res);
		
	}

	public static void main(String[] args) {
		Demo2 obj=new Demo2();
		obj.sum(25, 35);
		

	}

}
