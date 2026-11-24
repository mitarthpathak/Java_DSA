package leetcode;

public class ConcatenateNumbers {
    public static void main(String[] args){
        int[] nums = new int[]{7, 52, 2, 4};
         long total = 0;
        int lo = 0;
        int hi = nums.length - 1;

        while (lo < hi) {
            total += Long.parseLong("" + nums[lo] + nums[hi]);
            lo++;
            hi--;
        }

        // for the odd lentgh
        if (lo == hi) {
            total += nums[lo];
        }
        System.out.println(total);
        // return total;
    }
}
