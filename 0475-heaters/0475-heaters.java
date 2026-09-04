class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int count = 0;
        int max = 0;
        for(int i=0;i<houses.length;i++){
            int min = Integer.MAX_VALUE;
           
            for(int j=0;j<heaters.length;j++){
            int diff = Math.abs(houses[i]-heaters[j]);
            min = Math.min(diff,min);
            }
            max = Math.max(min,max);

        }
        return max;
    }
}