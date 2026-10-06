package leetcode;

import java.util.Scanner;

//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]
public class RemoveNthNode {
    public static void main(String[] args){
        node n1 = new node(1);
        node n2 = new node(2);
        node n3 = new node(3);
        node n4 = new node(4);
        node n5 = new node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        node temp = n1;
        int n,counter =0;
        System.out.print("the linked list is: ");
        while (temp != null ){
            System.out.print(temp.data + " ");
            temp = temp.next;
            counter++;
        }
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("the entered position is: " + (counter - n));
        temp = n1;
        for (int i=1;i<counter;i++){
            if (i==counter-n){
                temp.next = temp.next.next;
                temp = temp.next;
            }
            else{
                temp = temp.next;
            }
        }
        temp = n1;
        System.out.print("the linked list is: ");
        while (temp != null ){
            System.out.print(temp.data + " ");
            temp = temp.next;
            counter++;
        }
    }
}
