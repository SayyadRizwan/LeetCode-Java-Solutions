class Solution {
   void helper(int n,int len,ArrayList<Integer> arr){
while(n>10){
   
    int pow=(int)(Math.pow(10,len-1));
arr.add((n/pow)*pow);
    n%=(int)Math.pow(10,len-1);
      len=(String.valueOf(n)).length();
}
       if(n>0 && n<=10) arr.add(n);




       
   //     //base case
   //     if(n<10){
   // arr.add(n);
   //         return;
   //     }
   //     int base=Math.pow(10,len-1);
   //     arr.add(n/base);
   //     helper((n%base),String.valueOf(n).length(),arr);
       
   }
    
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer> arrlist= new ArrayList<>();
  
       int len=String.valueOf(n).length(); 
        helper(n,len,arrlist);
        int[] arr=arrlist.stream().mapToInt(Integer :: intValue).toArray();
        return arr;
    }
}