package leetcode;

import java.util.LinkedHashSet;
import java.util.Set;

public class IntersectionOfTwoArrays{
    public static void main(String[] args){
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};
        Set<Integer> result = new LinkedHashSet<>();
        int[] nums3 = new int[result.size()];
        for (int i: nums1){
                for (int j: nums2){
                    if (j==i ){
                        result.add(i);
                        break;
                    }
                }
        }
        int k = 0;
        for ( int n: result){
            nums3[k++]=n;
        }
        //in leetcode you will return here the nums array which was the array of the intersection elements

    }
}