public static class QuickUnion
    {
        private static int[] id;
        private static int[] size;
        
        public QuickUnion(int n)
        {
            id = new int[n];
            size = new int[n];
            for(int i=0;i<n;i++)
                id[i] = i;
            for(int i=0;i<n;i++)
                size[i] = 1;
        }
        
        public static int root(int p)
        {
            while(p!=id[p])
            {
                id[p] = id[id[p]];
                p = id[p];
            }
            return p;
        }
        
        public static boolean connected(int p,int q)
        {
            return id[p]==id[q];
        }
        
        public static void union(int p,int q)
        {
            int i = root(p);
            int j = root(q);
            if(i==j)
                return;
            if(size[i]>size[j])
            {
                id[j] = i;
                size[i] += size[j];
            }
            else
            {
                id[i] = j;
                size[j] += size[i];
            }
        }
    }
