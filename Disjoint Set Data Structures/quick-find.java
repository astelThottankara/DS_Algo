public static class QuickFind
    {
        private static int[] id;
        
        public QuickFind(int n)
        {
            id = new int[n];
            for(int i=0;i<n;i++)
                id[i] = i;
        }
        
        public static boolean connected(int p,int q)
        {
            return id[p]==id[q];
        }
        
        public static void union(int p,int q)
        {
            int pid = id[p];
            int qid = id[q];
            for(int i=0;i<id.length;i++)
                if(id[i] == pid)
                    id[i] = qid;
        }
    }
