static void insertionSort(int[] arr)
    {
        int temp;
        int holeIndex;
        for(int i=1;i<arr.length;i++)
        {
            temp = arr[i];
            holeIndex = i;
            while(holeIndex>0 && arr[holeIndex-1]>temp)
            {
                arr[holeIndex] = arr[holeIndex-1];
                holeIndex--;                                                
            }
            arr[holeIndex] = temp;
        }
        return arr;
    }
