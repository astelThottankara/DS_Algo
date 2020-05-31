class MA
{
    private static int[] lps;
    private static String s;
    
    MA(String s)
    {
        this.s = s;
        util(s);
    }
    
    static void util(String g)
    {
        int n = g.length();
        String s = modifiedString(g);
        lps = new int[s.length()];
        int centre=0,right=0,mirror=-1;
        for(int i=1;i<s.length()-1;i++)
        {
            mirror = 2*centre-i;
            if(i<right)
                lps[i] = Math.min(right-i,lps[mirror]);
            while(s.charAt(i+(1+lps[i]))==s.charAt(i-(1+lps[i])))
                lps[i]++;
            if(i+lps[i]>right)
            {
                centre = i;
                right = i+lps[i];
            }
        }
    }
    
    static String modifiedString(String s)
    {
        StringBuilder a = new StringBuilder();
        a.append('$');
        a.append('#');
        for(int i=0;i<s.length();i++)
        {
            a.append(s.charAt(i));
            a.append('#');
        }
        a.append('@');
        String g = a.toString();
        return g;
    }
    
    static long palindromes()
    {
        long count=0;
        for(int i=1;i<s.length()-1;i++)
        {
            if(lps[i]==0)
                continue;
            if(i%2==0)
            {
                count+= (lps[i]-1)/2+1;
            }
            else
            {
                count += lps[i]/2;
            }
        }
        return count;
    }
    
    static long longestPalindromeSubstring()
    {
        return lpsUtil(lps);
    }
    
    static long lpsUtil(int[] a)
    {
        Arrays.sort(j);
        return a[a.length-1];
    }
}
