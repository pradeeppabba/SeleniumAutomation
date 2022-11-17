package arrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		int a[]= {12,13,15,16,17};
		System.out.println("Array size is  ="+a.length);
		int max=a[0];
		for(int i=1;i<a.length;i++) { //13>12 ,15>13 , 16>15, 17>16  
			if(a[i]>max) {
				max=a[i];     //max=13 , max=15 , max=16 , max=17
			}
		}
		
	   System.out.println("largest element in array ="+max);
	}	

}
