class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int result = 0;
        int left = 0;
        int right = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while(left < nums.length && right < nums.length){
            map.put(nums[right], map.getOrDefault(nums[right],0)+1);
            while(map.size() > k){
                map.put(nums[left], map.get(nums[left])-1);
                if(map.get(nums[left]) == 0) map.remove(nums[left]);
                left++;
            }
            int prev = left;
            while(left <= right && map.size() == k){
                map.put(nums[left], map.get(nums[left])-1);
                if(map.get(nums[left]) == 0) map.remove(nums[left]);
                left++;
                result++;
            }
            while(prev != left){
                left--;
                map.put(nums[left], map.getOrDefault(nums[left],0)+1);
            }
            right++;
        }
        return result;
    }
}
