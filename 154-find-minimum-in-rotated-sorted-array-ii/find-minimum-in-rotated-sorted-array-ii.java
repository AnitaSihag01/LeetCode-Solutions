class Solution {
    public int findMin(int[] nums) {
        int n = nums.length ; 
        int low = 0 ;
        int high  = n - 1 ; 
       int ans = Integer.MAX_VALUE;
      //  int index = -1 ;
         while( low <= high ){
            int mid = low + ( high - low ) / 2 ;
            if (low == high) {
            ans = Math.min(ans, nums[low]);
            break;
        }
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                ans = Math.min(ans, nums[low]);
                low++;
                high--;
            }
            else if (nums[low] <= nums[mid]) {
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            }
            else {
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }
         }
         return ans ;
    }
}