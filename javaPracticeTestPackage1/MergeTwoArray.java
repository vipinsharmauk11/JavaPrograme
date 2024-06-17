package javaPracticeTestPackage1;

public class MergeTwoArray {

	int [] mergeArray(int a[],int b[])
	{
		int aLength=a.length;
		int bLength=b.length;
		
		int cLength=aLength+bLength;
		int c[]=new int[cLength];
		for(int i=0;i<aLength;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<bLength;i++)
		{
		  c[aLength+i]=b[i];
		}
		
		return c;	
		
	}
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40};
		int b[]= {50,60,70,80};
		
		MergeTwoArray mg=new MergeTwoArray();
		
		int mergeArray[]=mg.mergeArray(a, b);
		System.out.println("Merge array is :");
		for(int i=0;i<mergeArray.length;i++)
		{
		System.out.print(+mergeArray[i] +"  ");
		}

	}

}
