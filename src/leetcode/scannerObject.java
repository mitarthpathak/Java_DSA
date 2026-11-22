package leetcode;

import java.util.Scanner;

public class scannerObject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("hiiii");
        System.out.print("please enter your sweet name ");
        String name = sc.nextLine();
        System.out.println("now please enter your age:");
        int age = sc.nextInt();

        System.out.println("your name is :" + name + "age is " + age);
     }
}
