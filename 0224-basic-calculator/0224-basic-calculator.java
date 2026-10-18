class Solution {
    public int calculate(String s) {
       int num=0;
       int result=0;
       int sign =1;
       Stack<Integer> st = new Stack<>();
       char[] arr = s.toCharArray(); 
       for(int i=0;i<arr.length;i++){
        char curr = arr[i];
        if(curr=='('){
            st.push(result);
            st.push(sign);
            result =0;
            num=0;
            sign=1;
        }
      else if(curr==')'){
    result += num * sign;  // CHANGE: process pending number
    num = 0;               // CHANGE: reset number

    result *= st.pop();
    result += st.pop();
}
        else if(curr == '+'){
            result = result + num*sign;
            num =0;
            sign =1;
        }
        else if(curr=='-'){
            
            result = result + num*sign;
            num=0;
            sign =-1;
        }
        else if(curr == ' '){
            continue;
        }
        else{
            num = (num *10)+ (curr-'0');
        }
       }
    result = result + num * sign;
       return result;
    }
}