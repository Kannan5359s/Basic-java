class Solution {
    public int addDigits(int num) {
        int s=0;
        while ((num>0 )&& (num!=s)){
            s=0;
            int d=num%10;
            s+=d;
            num=num/10;
            num+=s;
        }
        return s; 
    }
}