class Solution {
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<List<String>>();
         List<String> board = new ArrayList<String>();
         
         for(int i = 0; i < n; i++)
         {
        	 StringBuilder sb = new StringBuilder("");
        	 for(int j = 0; j < n; j++)
        	 {
        		 sb.append(".");
        	 }
        	 board.add(sb.toString());
         }
         
         
         solveQueen(board,0,n,ans);
         return ans;
         
    }

    public void solveQueen(List<String>board,int col, int n,List<List<String>>ans)
	{
		//base case 
		if(col==n) {
			ans.add(new ArrayList<String>(board));
			return;
		}
		
		for(int row = 0; row < n; row++)
		{
			if(isSafe(board,row,col,n))
			{
				StringBuilder sb = new StringBuilder(board.get(row));
				sb.setCharAt(col, 'Q');
				board.set(row, sb.toString());
				
				solveQueen(board, col+1, n,ans);
				
				sb.setCharAt(col, '.');
				board.set(row, sb.toString());

				
			}
		}		  
		
	}

    public static boolean isSafe(List<String>board,int row,int col,int n)
	{
		int i = row;
		int j = col;
		
		//row check
		while(j >= 0)
		{
			if(board.get(i).charAt(j) == 'Q')
				return false;
		--j;
		}
		
		//upper left diagonal
		i = row;
		j = col;
		
		while(i >= 0 && j >= 0)
		{
			if(board.get(i).charAt(j) == 'Q')
				return false;
			--i;
			--j;
		}
		i = row;
		j = col;
		//bottom left diagonal
		while( i < n && j >= 0)
		{
			if(board.get(i).charAt(j) == 'Q')
				return false;
			++i;
			--j;
		}
		return true;
	}
	

}