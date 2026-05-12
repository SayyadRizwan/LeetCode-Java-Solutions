class Solution {
    public int mirrorDistance(int n) {
      int rem=0;
        int copy=n;
        while(n!=0){
 rem=rem*10+(n%10);
            n/=10;
            
        }
        return Math.abs(copy-rem);
    }
}