package leetcode;

public class MiddleIndexOfAnArray {
    public static void main(String[] arg){
        int[] nums = new int[]{4,0};
        int len = nums.length;
        int sumleft = 0;
        int sumright = 0;
        int ans =-1;
        if (len == 1){
            ans = 0;
            System.out.println(ans);
        }
        else {
        for (int i =0;i<len;i++){
            for (int j=0;j<i;j++)   {
                sumleft += nums[j];
                System.out.println(" j : " + j);
            }
            for (int k=i+1;k<len;k++){
                sumright += nums[k];
                System.out.println(" k : "  +k);
            }
            if (sumleft == sumright){
                ans = i;
            }
            
            sumleft =0;
            sumright =0;
            
        }
        
        }
        System.out.println(ans);;
    }
        // System.out.println("the length of array : " + len);
        // System.out.println("the sum of left is : " + sumleft);
        // System.out.println("the sum of right is :" + sumright);
    }


