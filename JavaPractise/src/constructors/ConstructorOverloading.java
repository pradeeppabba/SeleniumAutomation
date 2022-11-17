package constructors;

public class ConstructorOverloading {
	int id;
	String name;
	int age;
	//creating two argument constructor
	ConstructorOverloading(int i,String n){
		id= i;
		name= n;
	}
	ConstructorOverloading(){
		id=10;
		name="hello World";
		
	}
	//creating three argument constructor
	ConstructorOverloading(int a,String m,int d){
		id=a;
		name=m;
		age=d;
	
	}
	ConstructorOverloading(String n,int i){
		name=n;
		id=i;
		
	}
	ConstructorOverloading(int i){
		id=i;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String[] args) {
		ConstructorOverloading obj=new ConstructorOverloading(20, "maneg");
		ConstructorOverloading obj1=new ConstructorOverloading(20, "testing", 35);
		ConstructorOverloading obj2=new ConstructorOverloading("java", 29);
		obj.display();
		obj1.display();
		obj2.display();
				
		
	}

}
