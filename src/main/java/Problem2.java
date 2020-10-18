public class Problem2 {

    /*
    My algorithm uses multiple sets of ints to change the count each time an integer changes within the array to show
    the length of an array without any duplicates. Every time an integer doesn't match the number previously set,
    the algorithm changes the set number and count how many times the set number has changed.
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        int k = 1;
        int i;
        int main = nums[0];
        for(i = 1; i < k; i++){
            if(nums[i] != main){
                main = nums[i];
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
         // place holder
    }

