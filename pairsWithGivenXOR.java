class Solution {
    public int solve(int[] nums, int k) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        for(int i : nums){
            if(set.contains(i) && set.contains(i^k)){
                result++;
                set.remove(i);
                set.remove(i^k);
            }
        }
        return result;
    }
}
