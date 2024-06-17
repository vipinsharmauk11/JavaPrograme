package javaPracticeTestPackage1;
import java.util.Scanner;
public class SearchElementInArray {

	void search(int array[] )
	{
		System.out.println("Enter the no. for searched Elemnt in Array: ");
		System.out.println("[ 20, 40, 55, 66, 5, 43, 87, 46, 77, 35, 48]");
		Scanner sc = new Scanner(System.in);
		int searchElement=sc.nextInt();
		int i;
		int count=0;
		for( i=0;i<array.length;i++)
		{	
			if(searchElement==array[i])
			{
				System.out.println("Element found at index : "+i);
				count++;
				break;
			}
		}

		if(count==0)
			System.out.println("elemnt not found in  array list ............");
	}	

public static void main(String[] args) {

	int array[]= {20,40,55,66,5,43,87,46,77,35,48};

	SearchElementInArray sc=new SearchElementInArray();
	sc.search(array);

}


}
