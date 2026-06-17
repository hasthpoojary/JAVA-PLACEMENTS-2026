import java.util.*;

public class TwoSum {

    public static String twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return map.get(complement) + " " + i;
            }
            map.put(nums[i], i);
        }
        return "";
    }

    public static void main(String[] args) {
        Object[][] tests = {
            {new int[]{2, 7, 11, 15}, 9, "0 1"},
            {new int[]{3, 2, 4}, 6, "1 2"},
            {new int[]{3, 3}, 6, "0 1"},
            {new int[]{0, -1, 2, -3, 1}, -2, "0 3"},
            {new int[]{1, 2, 3, 4}, 5, "0 3"}
        };
        int passed = 0;
        for (int i = 0; i < tests.length; i++) {
            int[] nums = (int[]) tests[i][0];
            int target = (int) tests[i][1];
            String expected = (String) tests[i][2];
            String result = twoSum(nums, target);
            if (expected.equals(result)) {
                passed++;
                System.out.println("Test " + (i + 1) + " passed");
            } else {
                System.out.println("Test " + (i + 1) + " FAILED");
                System.out.println("nums: " + Arrays.toString(nums) + " target: " + target);
                System.out.println("Expected: " + expected + " but got: " + result);
            }
        }
        System.out.println(passed + "/" + tests.length + " tests passed");
    }
}
