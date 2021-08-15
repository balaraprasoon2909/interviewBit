class Solution {
    public int solve(int[] a, int k) {
        int result = 0;
        for(int i=0; i<a.length; i++){
            int sum = 0;
            for(int j=i; j<a.length; j++){
                sum += a[j];
                if(sum < k) result++;
                else break;
            }
        }
        return result;
    }
}
