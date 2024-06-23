class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        return helperFindClosestElement(arr,k,x);
        
    }
    //Binary search method 
    public int bs_method(int []arr,int x)
    {
        int start =0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        while(start<=end)
        {   
            if(arr[mid] < x)
                start = mid + 1;
            else
                end = mid - 1;
            mid = (start + end)/2;
              
        }
        return start;
    }
    public List<Integer> helperFindClosestElement(int[]arr,int k,int x)
    {
         ArrayList<Integer> list = new ArrayList<Integer>();
      
        if(arr.length == 1){
            list.add(arr[0]);
            return list;
        }    

        int high = bs_method(arr,x);
        int low = high-1;

        while(k > 0)
        {
            if(high >= arr.length)
               low--;
            else if( low < 0)
              high++;
            else if(x - arr[low] > arr[high] - x)
               high++;
            else 
               low--;             
            k--;
            
        }
        
        for(int i = low+1; i <= high-1; i++)
        {
            list.add(arr[i]);
        }
        return list;

}
}