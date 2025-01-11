public class lesson8.3 { lass Solution {
    
    public int sumIgnoreSections(int[] nums) {
        if (nums == null || nums.length == 0) { 
            return 0;
        }

        int totalSum = 0;
        boolean ignore = false;

        for (int num : nums) {
            if (num == 6) {
                ignore = true;
            } else if (ignore && num == 7) {
                ignore = false;
            } else if (!ignore) {
                totalSum += num;
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.sumIgnoreSections(new int[]{1, 2, 2})); // Виведе: 5
        System.out.println(solution.sumIgnoreSections(new int[]{1, 2, 2, 6, 99, 99, 7})); // Виведе: 5
        System.out.println(solution.sumIgnoreSections(new int[]{1, 1, 6, 7, 2})); // Виведе: 4
        System.out.println(solution.sumIgnoreSections(new int[]{1, 6, 6, 7, 7, 1})); // Виведе: 2 (важливо для перекриваючих секцій)
        System.out.println(solution.sumIgnoreSections(new int[]{1, 2, 6, 7, 6, 7})); // Виведе: 3
        System.out.println(solution.sumIgnoreSections(new int[]{})); // Виведе: 0 (перевірка порожнього масиву)
        System.out.println(solution.sumIgnoreSections(new int[]{6, 7})); // Виведе: 0
        System.out.println(solution.sumIgnoreSections(new int[]{6, 7, 1, 6, 7})); // Виведе: 1
        System.out.println(solution.sumIgnoreSections(new int[]{1, 6, 7, 1, 6, 2, 7}));   // Виведе: 2
        System.out.println(solution.sumIgnoreSections(null)); // Виведе: 0 (перевірка null)
    }
}
}
