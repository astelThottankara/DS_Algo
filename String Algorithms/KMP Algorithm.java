/*
    String Searching Algorithm
*/

public static void KMP_Algorithm(String pattern,String original)
    {
        int originalSize = original.length();
        int patternSize = pattern.length();
        int lps[] = new int[patternSize];
        lpsArray(lps,patternSize,pattern);
        int i=0;
        int j=0;
        int count=0;
        while(i<originalSize)
        {
            if(original.charAt(i)==pattern.charAt(j))
            {
                i++;
                j++;
            }
            if(j==patternSize)
            {
                count++;
                j = lps[j-1];
            }
            else if(i<patternSize && original.charAt(i)!=pattern.charAt(j))
            {
                if(j!=0)
                    j = lps[j-1];
                else    
                    i++;
            }
        }
        System.out.println(count);
    }

public static void generateLpsArray(int[] lps,int patternSize,String pattern)
    {
        int j = 0;
        int i = 1;
        lps[0] = 0;
        while(i<patternSize)
        {
            if(pattern.charAt(i)==pat.charAt(len))
                lps[i++] = ++j;
            else
            {
                if(j!=0)
                    length = lps[j-1];
                else
                    lps[i++] = j;
            }
        }
    }
