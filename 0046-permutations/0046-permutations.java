class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        List<Integer> list=  Arrays.stream(nums)
         .boxed()
         .collect(Collectors.toList());
         
         helperFindPermutation(list,0,ans);
         
         return ans;
    }
    public static void helperFindPermutation(List<Integer>nums,int index,List<List<Integer>> ans)
	{
		if(index >= nums.size())
		{
			System.out.println("From if "+nums);
			ans.add(new ArrayList<>(nums));
			return;
		}
			
		
		for(int j = index ; j < nums.size(); j++)
        {
            swap(nums,index,j);
            helperFindPermutation(nums,index+1,ans);
            swap(nums, index, j);
        }
		
	
		
	}
	
	public static void swap(List<Integer>nums,int i, int j )
	{
		int temp = nums.get(i);
		nums.set(i, nums.get(j));
		nums.set(j, temp);
		
		
	}

   
}