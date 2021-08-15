class Solution {
    public int solve(int[] bin, int k) {
        if(bin.length == 0) return 0;
        int result = 0;
        int l = 0;
        int zeroCount = 0;
        for(int i=0; i<bin.length; i++){
            if(bin[i] == 0) zeroCount++;
            while(zeroCount > k){
                if(bin[l] == 0) zeroCount--;
                l++;
            }
            result = Math.max(result, i-l+1);
        }
        return result;
    }
}
