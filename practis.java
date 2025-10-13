class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;

        // Move all non-val numbers to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }

        // count is the new length of the array
        return count;
    }
}
