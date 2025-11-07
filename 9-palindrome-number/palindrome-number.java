class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int y=x;
        int n=Math.abs(x);

        while (n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if (y<0) return(y == rev);
        return y == rev;    
    }
}