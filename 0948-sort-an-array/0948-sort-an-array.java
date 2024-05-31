class Solution {
    public int[] sortArray(int[] nums) {
        
        int start = 0;
        int end = nums.length-1;

        nums = mergeSort(nums,start,end);
        return nums;
    }

    public int[] mergeSort(int[]nums,int start,int end)
    {
        if(start < end)
        {
            int mid = (start + end ) / 2;
            mergeSort(nums,start,mid);
            mergeSort(nums,mid+1,end);
            merge(nums,start,mid,end);
        }
        return nums;
    }

    public void merge(int[]nums,int start, int mid, int end)
    {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[]leftArray = new int[n1];
        int[]rightArray = new int[n2];

        for(int i = 0; i < n1; i++)
          leftArray[i] = nums[start+i];

        for(int j = 0; j < n2; j++)
          rightArray[j] = nums[mid+1+j];
        
        int i = 0;
        int j = 0;
        int k = start;
        while(i < n1 && j < n2)
        {
           if(leftArray[i] <= rightArray[j]){
             nums[k] = leftArray[i];
             i++;
           }else{
            nums[k] = rightArray[j];
            j++;
           }
           k++;    
        }
        while( i < n1)
        {
            nums[k] = leftArray[i];
            i++;
            k++;
        } 
        while( j < n2)
        {
            nums[k] = rightArray[j];
            j++;
            k++;
        } 
    }
}