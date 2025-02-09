package Array;

public class removeDuplicat {
 
        public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
    
            int k = 1; // Counter for unique elements
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[k] = nums[i];
                    k++;
                }
            }
            return k;
        }
    
        public static void main(String[] args) {
            int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
            int k = removeDuplicates(nums);
            System.out.println("The number of unique elements is: " + k);
            System.out.print("The first " + k + " elements of the array are: ");
            for (int i = 0; i < k; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }
    
    

