package leetcode;

public class Sorting {
    public static void main(String[] args){
        int[] arr = {2,7,5,4,1};
        int k = 0,num=0;
        for (int i=0;i<=5;i++){
            for (int j=0;j<i;j++){
                System.out.print(arr[j]);
                if (arr[i]<arr[j]){
                    k =1;
                }
            }
            System.out.println();
        }
    }
}
