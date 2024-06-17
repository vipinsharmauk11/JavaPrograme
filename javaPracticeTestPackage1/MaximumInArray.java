package javaPracticeTestPackage1;

public class MaximumInArray {

	public static void main(String[] args) {
		
		int arr[]= {20,40,55,66,5,43,87,46,77,35,48};
		
		MaximumInArray mx=new MaximumInArray();
		System.out.println(mx.max(arr));
         
	}

	
	int max(int arr[])
	{
		int maximum=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(maximum<arr[i])
			{
				maximum=arr[i];
			}
		}
		
		return maximum;
	}
	
	
}
