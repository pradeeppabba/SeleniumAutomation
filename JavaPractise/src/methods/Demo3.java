package methods;

public class Demo3 {
	//method without parameter but with return type
	    int add() {
		int b=20;int c=30;
		int res=b+c;
		//we wont hold the result here
		//we will pass this result to its calling place by using return keyword
		return res;
		
	}

	public static void main(String[] args) {
		Demo3 obj=new Demo3();
		int total=obj.add();//here we need to hold the return value 
		//now total variable is holding that res value
		System.out.println("Sum of the b and c values are ="+total);
		

	}

}
