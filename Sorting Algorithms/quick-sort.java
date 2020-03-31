public static int partition(int[] arr,int start,int end)
    {
        int pivot = arr[end];
        int pIndex = start;
        for(int i=start;i<end;i++)
        {
            if(arr[i]<=pivot)
            {
                arr[pIndex] = arr[i] + arr[pIndex] - (arr[i]=arr[pIndex]);
                pIndex++;
            }
        }
        arr[pIndex] = arr[end] + arr[pIndex] - (arr[end]=arr[pIndex]);
        return pIndex;
    }
    
    public static void quickSort(int[] arr,int start,int end)
    {
        int pIndex;
        if(start<end)
        {
            pIndex = partition(arr,start,end);
            quickSort(arr,start,pIndex-1);
            quickSort(arr,pIndex,end);
        }
    }
