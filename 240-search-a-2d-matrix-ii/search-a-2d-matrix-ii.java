class Solution {
    public static boolean binarysec(int[] arr,int num){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+((high-low)/2);
            if(arr[mid]==num) return true;
            if(arr[mid] > num) high=mid-1;
            else low=mid+1;
        }
        return false;

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix[0].length;
        int n=matrix.length;
        for(int i=0;i<n;i++){
            if(binarysec(matrix[i],target)){
                return true;
            }

        }
        return false;
    }
}