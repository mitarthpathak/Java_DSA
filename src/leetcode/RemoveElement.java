package leetcode;
import java.util.*;
public class RemoveElement {
    public static void main(String[] args){
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int length = nums.length;
        for (int i =0;i<length;i++){
            if (val == nums[i]){
                for (int k=i;k<length-1;k++){
                    nums[k]=nums[k+1];
                }
                length--;
                i--;
            }
        }
        for (int k = 0; k < length; k++) {
            System.out.println(nums[k]);
        }
    }
}
