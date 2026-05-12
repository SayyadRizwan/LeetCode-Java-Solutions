class Solution {
    public int reverse(int x) {
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = -x;
        }

        int num = 0;
        while (x >= 1) {
            int digit = x % 10;

            // Overflow check before appending digit
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }

            num = num * 10 + digit;
            x /= 10;
        }

        return num * sign;
    }
}