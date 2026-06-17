
        class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int ptr1 = 0; // child
        int ptr2 = 0; // cookie

        while (ptr1 < g.length && ptr2 < s.length) {
            if (s[ptr2] >= g[ptr1]) {
                ptr1++;
            }
            ptr2++;
        }

        return ptr1;
    }
}
       
    
