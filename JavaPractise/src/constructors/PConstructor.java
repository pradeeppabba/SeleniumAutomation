package constructors;

public class PConstructor {
	int a;
	float b;
	
	PConstructor(int x,float y){
		
		a=x;
		b=y;
		System.out.println("The value of a :"+a);
		System.out.println("The value of a :"+b);
		
	}
	
	public static void main(String[] args) {
		PConstructor obj1=new PConstructor(11,22.5f);
		PConstructor obj2=new PConstructor(15, 19.5f);
		PConstructor obj3=new PConstructor(20, 33.5f);
		PConstructor obj4=new PConstructor(15, 110.2f);
		
	}

}
