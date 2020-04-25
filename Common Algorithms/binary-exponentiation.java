/*
    Time Complexity = O(logN)
*/

static long binaryExponentiation(int x,int n)
{
    long result=1;
    while(n>0)
    {
        if(n % 2 ==1)
            result=result * x;
        x=x*x;
        n=n/2;
    }
    return result;
}
