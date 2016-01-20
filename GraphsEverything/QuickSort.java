package GraphsEverything;

public class QuickSort {
    
    public static void main(String[] args) {

        int arr[]=new int[11];
        arr[0]=10;
        arr[1]=5; arr[1]=1; arr[2]=210; arr[3]=100;
        arr[4]=10;arr[5]=107;arr[6]=11;arr[7]=7;
        arr[9]=0;arr[8]=80;
        arr[10]=1111;
        for(int i=0;i<11;i++)
            System.out.print(arr[i]+" ");
        sort(arr);
        System.out.println("");
        for(int i=0;i<11;i++)
            System.out.print(arr[i]+" ");
        
    }
    public static void sort(int[] arr)
    {
        quicksortRecurse(arr, 0, arr.length - 1);
    }
    static void quicksortRecurse(int arr[],int startIndex,int lastIndex){
     int p;
	if(startIndex<lastIndex)
	{
		p=partition(arr,startIndex,lastIndex);
		quicksortRecurse(arr,startIndex,p-1);
		quicksortRecurse(arr,p+1,lastIndex);
	}
    }
    
      static int partition(int arr[],int l,int u){
                   	
	int start=l;int pivot=l;
        int end=u;
	while(start<end)
	{
		while(arr[start]<=arr[pivot])
			++start;	
		while(arr[end]>arr[pivot])
			--end;	
		if(start<end)
		{
			int tmp=arr[start];
			arr[start]=arr[end];
			arr[end]=tmp;
		}
	}
        int temp=arr[pivot];
	arr[pivot]=arr[end];
	arr[end]=temp;
	return end;
    }
}    