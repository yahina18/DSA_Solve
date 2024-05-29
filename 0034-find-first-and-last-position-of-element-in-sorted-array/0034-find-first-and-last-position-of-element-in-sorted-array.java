class Solution {
    public int[] searchRange(int[] nums, int target) {

         int start = 0;
         int end = nums.length-1;
         int mid = start + (end - start)/2;
         int[]ans = {-1,-1};

         //find first ouccurrence
         while(start <= end)
         {
            if(nums[mid] == target){
                ans[0] = mid;
                end = mid -1;
            
            }else if(nums[mid] < target)
                   start = mid+1;                
            else
                   end = mid-1;
           
            mid = start + (end - start) / 2; 
               
         }

         start = 0;
         end = nums.length-1;
         mid = start + (end - start)/2;

         //find last ouccurrence
         while(start <= end)
         {
            if(nums[mid] == target){
                ans[1] = mid;
                start = mid + 1;
            
            }else if(nums[mid] < target)
                   start = mid+1;                
            else
                   end = mid-1;
           
            mid = start + (end - start) / 2; 
               
         }

         return ans;
    }
}