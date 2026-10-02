class Solution {
    public double myPow(double x, int n) {
          long nn=n;
          double ans=1;
          if(nn<0) nn=-1*nn;
          while(nn>0){
            if(nn%2==1){
                ans=ans*x;
                nn=nn-1;
            }
            else{
                x=x*x;
                nn=nn/2;
            }
          }
    return(n<0 ? (double)1.0/ans : ans);
    }
}