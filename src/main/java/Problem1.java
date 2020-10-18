public class Problem1 {

    /*
    My algorithm looks through the array for any "0's or 2's" since we know that each array will contain "0,1 and 2."
    When every the array finds a "0" it switches the number at the front of the array to where the zero was found and
    sets the first position of the array as 0 and vice versa whenever finding a 2 but instead at the end of the array.
    My algorithm also shortens the array when a 2 is found to prevent searching through the 2's placed at the end.
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int k = 0;
        int start = 0;
        int end = nums.length-1;
        for (int i = 0; i < nums.length-k; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[start];
                nums[start] = 0;
                start++;
            }
            if (nums[i] == 2) {
                nums[i] = nums[end];
                nums[end] = 2;
                end--;
                k++;
            }
            }
        }
    }

