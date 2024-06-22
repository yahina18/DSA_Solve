class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        return helperFindClosestElement(arr,k,x);
        
    }
    public List<Integer> helperFindClosestElement(int[]arr,int k,int x)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int low = 0;
        int high = arr.length-1;
        while(high-low >= k)
        {
            if(x - arr[low] > arr[high] - x)
               low++;
            else 
               high--;   
        }
        
        for(int i = low; i <= high; i++)
        {
            list.add(arr[i]);
        }
        return list;

    }
}