class Solution {
    public int singleNumber(int[] nums) {
        int count=0;
        for(int val:nums){
            count=count^val;
        }

        
        return count;
    }
}