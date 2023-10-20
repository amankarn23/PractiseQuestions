public class DutchNationalFlagProblem {
    public static void main(String[] args) {
        int[] nums = {2, 0, 1};
        sortColors(nums);

    }

    static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        int temp;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0: {
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    mid++;
                    low++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}