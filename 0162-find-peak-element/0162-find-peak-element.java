class Solution {
    public int findPeakElement(int[] nums) {
        //Arrays.sort(nums);
        return helperFindPeakElement(nums);
    }
    public int helperFindPeakElement(int[]nums)
    {
        int start = 0;
        int end = nums.length-1;
        int mid = (start + end)/2;

        while(start < end)
        {
            if(nums[mid] < nums[mid+1])
              start = mid + 1;
            else
              end = mid;

            mid = (start + end)/2;    
        }
        return mid;
    }
}