class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start + 1 < end){
            int mid = start + (end - start)/2;
            if (mid == 0 || mid == nums.length - 1){
                return mid;
            }
            else if (nums[mid] < nums[mid - 1]){
                end = mid;
            }
            else if (nums[mid] < nums[mid + 1]){
                start = mid;
            }
            else{
                return mid;
            }
        }

        return (nums[start] > nums[end])?start:end;
    }
}