class Solution {
    public int arrayPairSum(int[] nums) 
    {
        int result=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i=i+2)
        {
            result=result+nums[i];
        }
        return result;
       
    }
}
