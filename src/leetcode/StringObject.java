package leetcode;

import java.util.Scanner;
//just for the general knowledge: STRINGS ARE IMMUTABLE
public class StringObject {
    public static void main(String[] args){
//        String name = "Mitarth pathak";
//        Scanner sc = new Scanner(System.in);
//        String NameFromInput = sc.nextLine();
//        System.out.println("your name default is " + name + "\n and your input name is" + NameFromInput);
        //concatenation
          String firstName = "mitarth";
          String lastName = " Pathak";
          String fullName = firstName + lastName;
        System.out.println(fullName);
        //to get the length of a String
        for (int i =0; i <fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
    //reverse a string nowwwww
}
