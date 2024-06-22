class Solution {
    public void solveSudoku(char[][] board) {
        //row check 1-9 
        // col check 1-9 
        // box check 1-9 
        
        solveBoard(board);

    }
    public boolean solveBoard(char[][]board)
    {
        int n = board.length;
        for(int row = 0; row < n ; row++)
        {
            for(int col = 0; col < n; col++)
            {
                if(board[row][col] == '.')
                {
                    for(char ch = '1'; ch <= '9'; ch++)
                    {
                        if(isSafe(board,row,col,ch))
                        {
                            board[row][col] = ch;
                            boolean ans = solveBoard(board);
                            if(ans)
                               return true;
                            else   
                               board[row][col] = '.';    
                        }
                    }
                   return false;
                }
               
            }
           
        }
        return true;
    }

   public static boolean isSafe(char[][]board , int row, int col , char ch )
    {
        int n = board.length;
        for(int i = 0; i < n; i++)
        {
            //row check
            if(board[row][i] == ch)
               return false;
            if(board[i][col] == ch)
              return false;
            System.out.println();
            int boxRow = (3 * (row/3)) + (i/3);
            int boxCol = (3 * (col/3))+(i%3);
            if((boxRow >= 0 && boxRow <= board.length-1) && (boxCol >= 0 && boxCol <= board[0].length-1)) {
            	if( board[boxRow][boxCol] == ch)
                        return false;
            }
            	
        }
        return true;
    }
}