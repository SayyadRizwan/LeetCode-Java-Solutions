class Solution {
    public int helper(String s, int i, int num, int sign) {
        // Stop recursion if end of string OR non-digit
        if (i == s.length() || !Character.isDigit(s.charAt(i))) {
            return num * sign;
        }

        int digit = s.charAt(i) - '0';

        // ✅ Overflow check before updating num
        if (num > Integer.MAX_VALUE / 10 || 
           (num == Integer.MAX_VALUE / 10 && digit > 7)) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        num = num * 10 + digit;
        return helper(s, i + 1, num, sign);
    }

    public int myAtoi(String s) {
        s = s.trim(); // remove leading spaces
        if (s.isEmpty()) return 0; // edge case
        
        int i = 0;
        int sign = 1;

        // Handle sign at the start
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            if (s.charAt(0) == '-') sign = -1;
            i++;
        }

        return helper(s, i, 0, sign);
    }
}