package javaPracticeTestPackage1;

public class AverageofArrayElement {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40};
		AverageofArrayElement average=new AverageofArrayElement();
		System.out.println("Average of total Elemtnt in Array: "+average.avg(arr));
	}
	int avg(int arr[])
	{
		int sum=0;
		int av=0;
		int totarr=arr.length;
		System.out.println("Total no. of element in array is :" +totarr);
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
						
		}
		
		av=sum/totarr;
				
		return av;		
	}
}
