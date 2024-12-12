class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        int freq=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(freq==0){
                ans=nums[i];
            }
            if(ans==nums[i]){
                freq++;
            }
            else{
                freq--;
            }
            
        }      
        return ans;
       
        
    }
}