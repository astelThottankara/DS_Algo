/*

    Preferred when array is sorted

*/

public static int binarySearch(int[] a,int value)
{
    int start = 0;
    int end = a.length-1;
    
    while(start>=end)                                   //flow control condition
    {
        if(a[mid]==value)
            return mid;
        else if(value>a[mid])
            start = mid+1;
        else
            end = mid-1;
    }
    
    return -1;
}
