import java.util.Arrays;

public class LeetCode1 {
    //https://leetcode.com/problems/sort-array-by-parity/?envType=daily-question&envId=2023-09-28
    public static void main(String[] args) {
        int input[] = {3,1,2,4};
        int output[] = sortArrayByParity(input);
        System.out.println(Arrays.toString(output));
    }

    public static int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1){
            return nums;
        }
        int start = 0;
        int end = nums.length-1;
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            if(nums[i]%2 ==0){
                ans[start] = nums[i];
                start++;
            }else{
                ans[end] = nums[i];
                end--;
            }
        }
        return ans;
    }

}

