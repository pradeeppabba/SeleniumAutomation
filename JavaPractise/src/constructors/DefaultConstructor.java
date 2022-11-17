package constructors;

public class DefaultConstructor {
	
	float a,b;
	DefaultConstructor() {
		a=30.5f;
		b=55.6f;
		
	}
	
	public static void main(String[] args) {
		DefaultConstructor dc=new DefaultConstructor(); //jvm will check any default constructor defined by user inside the class or not
		System.out.println(dc.a);
		System.out.println(dc.b);
	}

}
