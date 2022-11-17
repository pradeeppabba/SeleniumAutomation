package abstractionConcept;

public abstract class  Bank {

	public abstract void loan();
	
	public void credit() {
		System.out.println("Bank--Credit");
	}
	public void debit() {
		System.out.println("Bank--Debit");
		
	}
}
