package javaPracticeTestPackage1;

public class SecondLargetArray {

	public static void main(String[] args) {

		//Find the second largest element in an array
		int arr[]= {20,40,55,66,5,43,87,46,77,35,48};
		SecondLargetArray sl=new SecondLargetArray();
		sl.secondlargest(arr);
		
	}
	void secondlargest(int arr[])
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>arr[i+1])
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i]=temp;
			}

			System.out.print("Sorted Array is :" );
			for(i=0;i<arr.length;i++)
			{				
				System.out.print(" "+arr[i]);

			}         

		}
		System.out.println(" Second Heighest No. in Array is :"+arr[1]);
	}
}