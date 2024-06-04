class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++)
        {
            if(bs_method(nums,i+1,nums[i]+k)!=-1)
               map.put(nums[i],nums[i]+k);
        }
        return map.size();

    }

    public int bs_method(int[]nums,int i, int val)
    {
        int start = i;
        int end = nums.length-1;
        int mid = (start+end)/2;
        
        while(start <= end)
        {
            if(nums[mid] == val) 
               return 1;
            else if(nums[mid] < val)
               start = mid + 1;
            else 
               end = mid - 1;
            mid = (start + end)/2;   

        }
        return -1;
        
    }
}