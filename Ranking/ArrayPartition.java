//Input: [1,4,3,2]
//Output: 4
//Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).


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
