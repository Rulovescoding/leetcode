//
// Follow up for "Remove Duplicates":
// What if duplicates are allowed at most twice?
//
//
// For example,
// Given sorted array nums = [1,1,1,2,2,3],
//
//
// Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
//


class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1 || nums.length == 2) return nums.length;

        int j = 0;
        int count = 1;

        for (int i = 1; i < nums.length; i++){

            if (nums[i] == nums[j]) {
                count++;
                if (count <= 2) {
                    j++;
                    nums[j] = nums[i];
                }
            } else if (nums[i] > nums [j]){
                j++;
                nums[j] = nums[i];
                count = 1;
            }
        }

        return j+1;
    }
}
