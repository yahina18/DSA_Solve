class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        helperPermuteUnique(nums,0,ans);
        return ans;
    }
    public void helperPermuteUnique(int[]nums,int index, List<List<Integer>>ans)
    {
        if(index == nums.length)
        {
            List<Integer> list = new ArrayList<Integer>();
            for(int num : nums)
              list.add(num);
            
            ans.add(list);
            return;
        }
        
        Map<Integer,Boolean> map = new HashMap<Integer,Boolean>();
        for(int j = index; j < nums.length; j++)
        {
            if(map.get(nums[j])!=null)
              continue;

            map.put(nums[j],true);
            swap(nums,j,index);
            helperPermuteUnique(nums,index+1,ans);
            swap(nums,j,index);

        }


    }

    public void swap(int[]nums,int i, int j )
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}