class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

       List<List<Integer>> ans = new ArrayList<List<Integer>>();
       Arrays.sort(candidates);

       findCombinationSum2(0,candidates,target,ans,new ArrayList<Integer>());
       return ans; 
       

    }

    public void findCombinationSum2(int index, int[]candidates,int target,List<List<Integer>> ans, ArrayList<Integer> list)
    {
        if(target == 0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i < candidates.length; i++)
        {
            if(i > index && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;

            list.add(candidates[i]); 
            findCombinationSum2(i+1,candidates,target-candidates[i],ans,list);
            list.remove(list.size()-1);
        }
    }

}

