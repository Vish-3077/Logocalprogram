package Array;

public class Copy1arraytoanother {

	public static void main(String[] args) {
		
		int arr1[]= {10,20,3,0,15};
		int arr2[]= new int [arr1.length];
		
		for(int i =0;i<=arr1.length-1;i++)
		{
			arr2[i]=arr1[i];
			System.out.print(arr2[i] + ",");
		}
	}

}
