public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        helper(ans,new ArrayList<Integer>(),nums,0);
        
        return ans;
    }
    
    private void helper(List<List<Integer>> ans, List<Integer> temp,int[] nums, int start){
        ans.add(new ArrayList<>(temp));
        
        for(int i = start; i < nums.length; i++){
            temp.add(nums[i]);
            helper(ans,temp,nums,i + 1);
            temp.remove(temp.size()-1);
        }
    }
}
