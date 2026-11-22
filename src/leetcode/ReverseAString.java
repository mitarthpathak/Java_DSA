package leetcode;
import java.util.*;
public class ReverseAString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();


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
