class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int max_ones = -1;
        int max_ones_index = -1;

        for (int i = 0; i < mat.length; i++) {

            int no_ones = 0;

            for (int j = 0; j < mat[i].length; j++) {

                if (mat[i][j] == 1) {
                    no_ones++;
                }
            }

            if (no_ones > max_ones) {
                max_ones = no_ones;
                max_ones_index = i;
            }
        }

        return new int[]{max_ones_index, max_ones};
    }
}