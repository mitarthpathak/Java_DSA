package leetcode;
import java.util.*;
public class ReverseAString {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        StringBuilder name = new StringBuilder("mitarth");
        //use the below functions as required

    }
    public static void reverseWithStringBuilder(StringBuilder name){
        String reversedName = name.reverse().toString();
        System.out.println(reversedName);
    }
    public static void reverseManually(String word){
        String reversedWord = "";
        int length = word.length();
        for (int i =0;i<length;i++){
            reversedWord += word.charAt(length-1-i);
        }
        System.out.println("the original word: " + word);
        System.out.println("the reversed word: " + reversedWord);
    }
}
