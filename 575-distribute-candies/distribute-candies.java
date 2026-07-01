class Solution {
    public int distributeCandies(int[] candyType) {
       Set<Integer> h=new HashSet<>();
       int n=candyType.length/2;
       for(int c:candyType){
        h.add(c);
       }
       if(h.size() == 1) return 1;
       else if(h.size() ==n) return n;
       else if(h.size() < n) return h.size();
       
       return n;
    }
}