class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int lefter=1;
        int righter=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=righter;
            righter=righter*nums[i];
        }
        for(int i=0;i<n;i++){
            ans[i]=ans[i]*lefter;
            lefter=lefter*nums[i];
        }
        return ans;
    }
}