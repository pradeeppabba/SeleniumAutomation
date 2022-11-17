package abstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		HDFCBank obj=new HDFCBank(); // direct obj create to the child class
		obj.loan();
		obj.credit();
		obj.debit();
		obj.funds();
		//obj.fundsI();
		
		Bank obj1=new HDFCBank();
		obj1.loan();
		obj1.credit();
		obj1.debit();
		//obj1.funs(); //funds method specially design for HDFCBank but not in Bank
		
		//Bank obj1=new Bank();//we cannot create object of abstract class directly
		
		
		ICICBank obj2=new ICICBank();
		obj2.loan();
		obj2.debit();
		obj2.credit();
		obj2.fundsI();
		//obj2.funds();
		

	}

}
