package javaPracticeTestPackage1;

public class FindSumArray {

	public static void main(String[] args) {
		
		// Pragram to find the sum of all Elements in Array 
		
		int a[]= {10,20,30,40,50};
		FindSumArray fs = new FindSumArray();
		int result=fs.arr(a);
		System.out.println(result);

	}

	int arr(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
        return sum;
	}
	
}
