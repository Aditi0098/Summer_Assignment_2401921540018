class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c) return mat;
        if(r==m && c==n) return mat;
        int newind = 0;
        int oldind = 0;
        int newmat[][] = new int [r][c];
        while(newind <r*c && oldind < m*n){
            newmat[newind/c][newind%c] = mat[oldind/n][oldind%n];
            newind++;
            oldind++;
        }
        return newmat;

    }
}
