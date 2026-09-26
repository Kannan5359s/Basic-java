class Solution {
    public int myAtoi(String s) {

        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        int sign=1;
        if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            if(s.charAt(i)=='-' ){
                sign=-1;
                
            }
            i++;
            
        }
        
        long num=0;
        while(i<n && s.charAt(i)<='9' && s.charAt(i)>='0' ){
            int digit=s.charAt(i) -'0';

            if(num> Integer.MAX_VALUE/10 || (num==Integer.MAX_VALUE/10 && digit > (sign==1 ? 7 :8))){
                return sign==1 ? Integer.MAX_VALUE :Integer.MIN_VALUE;
            }
            num=num*10+digit;
            i++;
        }
        return (int)num*sign;
    }
}