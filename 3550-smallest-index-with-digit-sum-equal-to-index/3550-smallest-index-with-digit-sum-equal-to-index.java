class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int each=nums[i],sum=0;
            for(int j=nums[i];j>0;j/=10){
                int single=j%10;
                sum+=single;
            }
            if(i==sum)return i;
        }
        return -1;
    }
}