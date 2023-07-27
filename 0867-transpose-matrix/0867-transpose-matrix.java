class Solution {
    public int[][] transpose(int[][] matrix) {
        int column=matrix.length;
        int row=matrix[0].length;
        int[][] transpose=new int[row][column];
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                transpose[i][j]=matrix[j][i];
            }
        }
        
        return transpose;
    }
}