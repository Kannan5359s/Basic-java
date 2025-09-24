class Solution {
    public boolean isPalindrome(String s) {
    StringBuilder r=new StringBuilder();
    s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    for(int i=s.length()-1;i>=0;i--){
        r.append(s.charAt(i));
    }
    return (s.equals(r.toString()));    
    }
}