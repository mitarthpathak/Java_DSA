package leetcode;

public class CharArrayReverse {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        char[] reverse = {};
        int i=0;
        while (i<s.length){
            reverse[i] = s[(s.length-2)-i];
            i++;
        }
        System.out.println("the reversed is:" );
        while (i<reverse.length){
            System.out.println(reverse[i]);
        }
    }
}
