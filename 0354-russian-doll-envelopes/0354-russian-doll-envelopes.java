class Solution {
    public int maxEnvelopes(int[][] envelopes) {

       // sort by width, and if width same compare heigth.
       Arrays.sort(envelopes,(a,b) -> {
			
			if(a[0] == b[0])
				return b[1]-a[1];
			else
				return a[0]-b[0]; 
		}); 

      return helperMaxEnvelopes(envelopes);
        
    }

    public int helperMaxEnvelopes(int[][]envelopes)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(ans.size() == 0)
          ans.add(envelopes[0][1]);

        for(int i = 1; i < envelopes.length; i++)
        {
           if(ans.get(ans.size()-1) < envelopes[i][1])
             ans.add(envelopes[i][1]);
           else{
              
              int index = Collections.binarySearch(ans,envelopes[i][1]);
              if(index < 0)
                index = -(index+1);

              ans.set(index,envelopes[i][1]);  

           }

        }

        return ans.size();  

    }
}