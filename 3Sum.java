class Solution {
    public int threeSumClosest(int[] nums, int sum) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[nums.length-1];
        for(int i=0; i<nums.length-2; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j < k){
                int temp = nums[i] + nums[j] + nums[k];
                if(temp == sum) return temp;
                if(temp > sum) k--;
                if(temp < sum) j++;
                if(Math.abs(temp-sum) < Math.abs(result-sum)) result = temp;
            }
        }
        return result;
    }
}
