package javaPracticeTestPackage1;

public class SortArray {

	int [] SortArray(int array[])
	{
		int temp=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				}				
			}
		}
		
		return array;
	}
	public static void main(String[] args) {
		
		int array[]= {20,40,55,66,5,43,87,46,77,35,48};
		SortArray sa=new SortArray();
		int sortedArray[]=sa.SortArray(array);
		for(int i=0;i<sortedArray.length;i++)
		{
		System.out.print(sortedArray[i] +" ");
		}
	}

}