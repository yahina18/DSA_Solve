class Solution {
    public int minimumChairs(String s) {
        
        int cnt = 0;
        int ans = 0;

        for(int ch = 0; ch < s.length(); ch++)
        {
            if(s.charAt(ch) == 'E')
               cnt++;
            else
               cnt--;

            ans = Math.max(ans,cnt);      
        }
      
      return ans;
    }
}