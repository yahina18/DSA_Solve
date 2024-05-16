class Solution {
    public int[] rearrangeArray(int[] nums) {
        return helperRearrangeArray(nums);
    }
    public static int[] helperRearrangeArray(int[]nums)
	{
		int[]positive = new int[nums.length/2];
		int[]negative = new int[nums.length/2];
		int[]result = new int[nums.length];
		
		int j = 0, k = 0;
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] > 0){
				positive[j]= nums[i];
				j++;				
			}
			else{
				negative[k] = nums[i];
				k++;
			}
				
		}
		j = 0;
		k= 0;
		for(int i = 0; i < nums.length ; i++)
		{
		    if(i % 2 == 0){
		    	result[i] = positive[j];
		    	j++;
		    }else{
		    	result[i]= negative[k];
		    	k++;
		    }
		    	
			
		}
		
		
		return result;
		
	}


}