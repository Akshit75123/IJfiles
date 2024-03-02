public class LC {
    public static int maxSubArray(int[] nums) {
        int ans = 0, sum = 0;


        for (int num : nums) {
            sum = Math.max(num, sum + num);
            ans = Math.max(ans, sum);
        }

        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = maxSubArray(arr);
        System.out.println(sum);
    }
}