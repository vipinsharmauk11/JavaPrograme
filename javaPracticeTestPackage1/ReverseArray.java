package javaPracticeTestPackage1;
public class ReverseArray {
	
	int[] ReverseArray(int array[])
	{
		//int a[]=new int[array.length];
		int reverseArray[]=new int[array.length];
		System.out.println("Your original array is:");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] +" ");
		}		
		System.out.println();
		System.out.println("Reverse Array is : ");
		
		for(int i=0;i<array.length;i++)
		{
			reverseArray[i]=array[(array.length-i)-1];
		}
		return reverseArray;
	}

	public static void main(String[] args) {
		int array[]= {10,20,30,40};

		ReverseArray rev=new ReverseArray();
		int result[]=rev.ReverseArray(array);
		
        //System.out.println(result);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}

		
	}

}
