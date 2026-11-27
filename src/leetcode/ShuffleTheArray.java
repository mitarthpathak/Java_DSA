package leetcode;
public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};
        int n = 3;
        int len = nums.length;
        int[] n1 = new int[len/2];
        int[] n2 = new int[len/2];
        int k =0;
        for (int i=0;i<n1.length;i++){
            n1[i] = nums[i];
            k++;
        }
        for (int i=0;i<n1.length;i++){
            n2[i] = nums[k];
            k++;
        }
        int[] ans = new int[len];
        k =0;
        int j =0;
        for (int i=0;i<len;i++){
            if (i%2 == 0){
                ans[i] = n1[j];
                j++;
            }
            else{
                ans[i] = n2[k];
                k++;
            }
            
        }
        for (int ansss:ans){
            System.out.println(ansss);
        }
    }
}
