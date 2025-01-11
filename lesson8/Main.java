class Solution {
   
    public boolean xyzCheck (String str) {
        if (str == null || str.length() < 3) {
            return false;
        }

        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i > 0 && str.charAt(i - 1) == '.') {
                    continue; 
                }
                return true; 
            }
        }

        return false; 
    }
}

//Приклад використання:

Java

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.xyzCheck("abcxyz")); // true
        System.out.println(solution.xyzCheck("abc.xyz")); // false
        System.out.println(solution.xyzCheck("xyz.abc")); // true
        System.out.println(solution.xyzCheck("xy.z")); // false
        System.out.println(solution.xyzCheck("xyz")); // true
        System.out.println(solution.xyzCheck("x.yz")); // false
        System.out.println(solution.xyzCheck("")); // false
        System.out.println(solution.xyzCheck(null)); // false
    }
}
