class Solution {
    public int countArrangement(int n) {
         
         int currNum = 1;
         int[]arr = new int[n+1];
         Arrays.fill(arr, 0);
         ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
         helperFindNumberOfBeautifulArrangement(n,currNum,arr,ans);
         return ans.size();
    }

    public void helperFindNumberOfBeautifulArrangement(int n,int currNum,int []arr,List<List<Integer>> ans)
	{
		if(currNum == n+1) {
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 1; i <= n; i++){
				list.add(arr[i]);
			}
			ans.add(list);
			
			return;
		}
			
		
		for(int i = 1 ; i <= n;i++)
		{
			if(arr[i] == 0 && (currNum % i == 0 || i % currNum == 0))
			{
				arr[i] = currNum;
				helperFindNumberOfBeautifulArrangement(n, currNum+1, arr, ans);
				arr[i] = 0;
			}
		}
		
	}

}