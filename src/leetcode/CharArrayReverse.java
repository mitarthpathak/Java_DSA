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
        i = 0;
        System.out.print("[");
        while (i < s.length) {
            System.out.print("\"" + s[i] + "\"");
            if (i < s.length - 1) System.out.print(", ");
            i++;
        }
        System.out.println("]");

        System.out.println("the reversed is:");
        i = 0;
        System.out.print("[");
        while (i < reverse.length) {
            System.out.print("\"" + reverse[i] + "\"");
            if (i < reverse.length - 1) System.out.print(", ");
            i++;
        }
        System.out.println("]");
    }
}
