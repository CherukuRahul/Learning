public class LeetCode2 {
//https://leetcode.com/problems/search-insert-position/description/
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int target = 7 ;
    }

    public int searchInsert(int[] nums, int target) {
        for(int i =0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
            if(nums[i] > target){
                return i;
            }
        }
        return nums.length;

    }

}
