static int[] bubbleSort(int[] arr)
    {
        boolean sorted = true;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    arr[j] = arr[j] + arr[j+1] - (arr[j+1]=arr[j]);
                    sorted = false;
                }
            }
            if(sorted)  
                break;
        }
        return arr;
    }
