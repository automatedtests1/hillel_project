public class lesson8arrays5 {
    import java.util.Arrays;

class Solution {
   
    public int differenceLargestSmallest(int[] nums) {
        if (nums == null || nums.length < 1) {
            throw new IllegalArgumentException("Масив повинен містити хоча б один елемент.");
        }

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return max - min;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Тестування
        int[] nums1 = {10, 3, 5, 6};
        System.out.println("Різниця для " + Arrays.toString(nums1) + ": " + solution.differenceLargestSmallest(nums1)); // Виведе 7

        int[] nums2 = {7, 2, 10, 9};
        System.out.println("Різниця для " + Arrays.toString(nums2) + ": " + solution.differenceLargestSmallest(nums2)); // Виведе 8

        int[] nums3 = {2, 10, 7, 2};
        System.out.println("Різниця для " + Arrays.toString(nums3) + ": " + solution.differenceLargestSmallest(nums3)); // Виведе 8

         int[] nums4 = {5};
        System.out.println("Різниця для " + Arrays.toString(nums4) + ": " + solution.differenceLargestSmallest(nums4)); // Виведе 0
    }
}
}
