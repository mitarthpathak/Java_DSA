package leetcode;

public class RunningSumOfAnArray {
    public static void main(String[] args){
        int[] nums = new int[]{1, 2, 3, 4};
        // the output expected is [1, 1+2, 1+2+3, 1+2+3+4]
        int len = nums.length;
        int[] n = new int[len];
        int k=0;
        for (int i=0;i<len;i++){
            for (int j=0;j<i;j++){
                n[i] += nums[j];
            }
        }
        System.out.println("the original : ");
        for (int a:nums){
            System.out.println(a);
        }
        System.out.println("the summed up: ");
        for (int b:n){
            System.out.println(b);
        }
    }
}
