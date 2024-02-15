class Solution {
    public int reverse(int x) {
    //     if(x<=2147483647 && x>=(-2147483648)){
    //     int  result=0;
    //     int integer=x;
    //     if(x<0){
    //         integer=-1*x;
    //     }
    //     while(integer!=0){
    //         int rem=integer%10;
    //         result=result*10+rem;
    //         integer=integer/10;
    //     }
    //     if(x<0){
    //         return result*-1;
    //     }
    //     else{
    //         return result;
    //     }
    //     }
        
    //    return 0;
    int flag = x < 0 ? -1 : 1;  // Set flag based on the sign of x
        long ans = 0;               // Use long to handle potential overflow
        x = Math.abs(x);            // Get the absolute value of x

        while (x > 0) {
            int digit = x % 10;     // Get the rightmost digit of x
            ans = (ans * 10) + digit;  // Append digit to ans
            x /= 10;                // Move to the next digit
        }

    // Check if the reversed integer is within the 32-bit signed integer range
        if (ans >= Integer.MIN_VALUE && ans <= Integer.MAX_VALUE) {
            return (int) (ans * flag);  // Return the reversed integer with the original sign
        } else {
            return 0;
        }


    }
}