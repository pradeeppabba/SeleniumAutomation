package arrays;

public class SmallestElementInArray {

	public static void main(String[] args) {
		int b[]= {15,18,6,81,14,17};
		System.out.println("Array size is :"+b.length);
		int min=b[0];
		
		for(int i=0;i<b.length;i++) {
			if(b[i]<min) {
				min=b[i];
			}
		}
		System.out.println("Smallest Element in Array is :"+min);
		
		
		

	}

}
