public static int[] merge(int[] left,int[] right,int[] arr)
    {
        int nL = left.length;
        int nR = right.length;
        int k=0,i=0,j=0;
        while(i<nL && j<nR)                     //Filling up array while sorting
        {
            if(left[i]>right[j])
            {
                arr[k] = right[j];
                k++;
                j++;    
            }
            else
            {
                arr[k] = left[i];
                k++;
                i++;
            }
        }
        while(i<nL)                             //Filling up with remaining elements
        {                                       //if other array goes empty
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<nR)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
        return arr;
    }
    
    public static void mergeSort(int[] arr)
    {
        int n = arr.length;
        if(n<2)                                 //Base condition
            return;
        else
        {
            int mid = n/2;
            int[] left = new int[mid];
            int[] right = new int[n-mid];
            for(int i=0;i<mid;i++)
                left[i] = arr[i];
            for(int i=mid;i<n;i++)
                right[i-mid] = arr[i];
            mergeSort(left);                    //Recursive calls to continously
            mergeSort(right);                   //divide array
            merge(left,right,arr);
        }
    }
