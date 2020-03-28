static int[] selectionSort(int[] arr)
    {
        for(int  i=0;i<arr.length;i++)
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                    arr[i] = arr[j] + arr[i] - (arr[j]=arr[i]);
            }
        return arr;
    }
