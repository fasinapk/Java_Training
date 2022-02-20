package DataStructures;

public class SelectnSort {

	void Sort(int arr[])
	{
		int n=arr.length;
		//one by one move boundary of unsorted array
		for(int i=0;i<n-1;i++)
		{
			//find min elemnt in unsorted array
			int min=i;
			
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
					min=j;
			}
			//swap found min elemnt with the 1st elemnt
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
			//for debugging
//			for(int k=0;k<n;++k)
//				System.out.print(arr[k] + " ");
//			System.out.println();
		}
	}
	
	//print array
	
	void printArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		SelectnSort ob=new SelectnSort();
		int arr[] = {64,34,25,12,22,11,90};
		ob.Sort(arr);
		System.out.println("sorted array");
		ob.printArray(arr);

	}

}
