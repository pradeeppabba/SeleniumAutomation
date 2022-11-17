package constructors;

class CopyConstruct {
	int a,b; //variable declaration
	CopyConstruct(){ //default constructor
		a=1;b=2; 
		System.out.println("the value of a ="+a);
		System.out.println("the value of a ="+b);
	}
	CopyConstruct(CopyConstruct obj){ //copy constructor
		a=obj.a;
		b=obj.b;
		System.out.println("value of a="+a);
		System.out.println("value of a="+b);
	}
}
	public class CopyConstructor{
		public static void main(String[] args) {
			CopyConstruct obj1=new CopyConstruct();
			System.out.println("the value of a in obj1="+obj1.a);
			System.out.println("the value of b in obj1="+obj1.b);
			
			CopyConstruct obj2=new CopyConstruct(obj1);
			System.out.println("the value of a in obj2="+obj2.a);
			System.out.println("the value of b in obj2="+obj2.b);
		}
		
	}


