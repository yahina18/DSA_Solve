class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
         ArrayList<Integer> list = new ArrayList<Integer>();
         helperCombination(candidates, target,ans,0,list);

         return ans;
        
    }
    public static void helperCombination(int[]candidate, int target,ArrayList<List<Integer>>ans,int index, ArrayList<Integer> list)
	{
        // base case 
		if(index == candidate.length){
			if(target == 0)
			     ans.add(new ArrayList<Integer>(list));
			return;
		}
			
		//include dont move index
		if(candidate[index] <= target ) {

			int element = candidate[index];
			list.add(element);
			
			helperCombination(candidate, target-candidate[index], ans, index, list);
			int Lastindex = list.size()-1;
			list.remove(Lastindex);
			//list.remove(element);
		}
		//exclude 
		helperCombination(candidate, target, ans, index+1, list);		
						
	}
	
}