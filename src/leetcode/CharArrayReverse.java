package leetcode;

public class CharArrayReverse {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        char[] reverse = new char[s.length];
        int i=0;
        while (i<s.length){
            reverse[i] = s[(s.length-1)-i];
            i++;
        }
        System.out.println("the original is:");
        i= 0;
        while (i<s.length){
            System.out.print(s[i]+ ",");
            i++;
        }
        System.out.println();
        System.out.println("the reversed is:" );
        i= 0;
        while (i<reverse.length){
            System.out.print(reverse[i]+ ",");
            i++;
        }
    }
}
