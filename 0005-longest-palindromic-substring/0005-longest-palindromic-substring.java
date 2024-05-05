class Solution {
    public String longestPalindrome(String s) {
        
        if(s.length() <=1)
           return s;

        return helperFindLPS(s);
        
    }


    public  String helperFindLPS(String s)
	{ 
        
		int maxlen = 1;
		String maxstr = s.substring(0,1);
		//find all substring...
		
		for(int i = 0; i < s.length() ; i++)
		{
			for(int j = i+maxlen; j <= s.length() ; j++)
			{
				if(j-i> maxlen && isPalindrome(s.substring(i, j)))
				{
					maxlen = j-i;
					maxstr = s.substring(i,j);
				}
			}
		}
	
		return maxstr;
		
	}
	
	public boolean isPalindrome(String s)
	{
		int left = 0;
		int right = s.length()-1;
		
		while(left < right)
		{
			if(s.charAt(left)!= s.charAt(right))
				return false;
			
			left++;
			right--;
		}
		return true;
	}

}