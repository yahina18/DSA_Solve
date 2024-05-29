class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        System.out.println("RowCount : "+rowCount+" colCount : "+colCount);
         
        if(helperSearchMatrix(matrix,rowCount,colCount,target)==true)
            return true;
        else
           return false;
        
    }
    public boolean helperSearchMatrix(int[][]matrix,int rowCount, int colCount, int target)
    {
        int start = 0;
        int end = rowCount * colCount - 1;
        int mid = (start + end) /2;
        while(start<=end)
        {
            int rowIndex = mid / colCount;
            int colIndex = mid % colCount;

            if(matrix[rowIndex][colIndex] == target)
            {
              return true;

            }else if(matrix[rowIndex][colIndex] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            mid = (start + end)/2;
        }
        return false;

    }
}