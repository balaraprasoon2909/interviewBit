class Solution {
    public int nTriang(int[] a) {
        if(a.length < 3) return 0;
        int result = 0;
        Arrays.sort(a);
        for(int i=0; i<a.length-2; i++){
            int k = i+2;
            for(int j=i+1; j<a.length-1; j++){
                while(k < a.length && a[i] + a[j] > a[k]) k++;
                if(k > j) result += k-j-1;
                result = result%1000000007;
            }
        }
        return result;
    }
}
