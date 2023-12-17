// https://leetcode.com/problems/set-matrix-zeroes/

// Time O(n^2); Space O(m+n)

class Solution {
    public void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        boolean[] makeRows = new boolean[row];
        boolean[] makeCols = new boolean[col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == 0){
                    makeRows[i] = true;
                    makeCols[j] = true;
                }
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(makeRows[i] || makeCols[j]){
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
}
