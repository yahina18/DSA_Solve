class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

         int n = matrix.length;
		 int m = matrix[0].length;
		 ArrayList<Integer> ans = new ArrayList<Integer>();
		 //System.out.println(" Row : "+n+" Col : "+m);
		 
		 int startingRow = 0;
		 int endingCol = m-1;
		 int endingRow = n-1;
		 int startingCol = 0;
		 
		 //System.out.println("StartingRow : "+startingRow+" StartingCol : "+startingCol+" EndingCol :  "+endingCol+" EndingRow : "+endingRow );
		 
		 
		 int total_element = n * m;
		 int count = 0; 
		 
		 while(count < total_element)
		 {
			 //Print starting row 
			 for(int col = startingCol; col <= endingCol && count < total_element; col++)
			 {
			      ans.add(matrix[startingRow][col]);
				  count++;
			 }
			 startingRow++;
			 
			 
			 //Print ending col
			 for(int row = startingRow; row <= endingRow && count < total_element; row++)
			 {
				 ans.add(matrix[row][endingCol]);
				 count++;
			 }
			 
			 endingCol--;
			 
			 //Print ending row 
			 for(int col = endingCol; col >= startingCol && count < total_element; col--)
			 {
				 ans.add(matrix[endingRow][col]);
				 count++;
			 }
			 
			 endingRow--;
			 
			 //Print starting col
			 for(int row = endingRow ; row >= startingRow && count < total_element ; row--){
				 ans.add(matrix[row][startingCol]);
				 count++;
			 }
			 startingCol++;
				 
		 }

         return ans;
    }
}