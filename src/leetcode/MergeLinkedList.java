package leetcode;
//Input: list1 = [10,1,13,6,9,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
//Output: [10,1,13,1000000,1000001,1000002,5]
public class MergeLinkedList {
    public static void main(String[] args){
        node n1 = new node(10);
        node n2 = new node(1);
        node n3 = new node(13);
        node n4 = new node(6);
        node n5 = new node(9);
        node n6 = new node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        node temp = n1;
        System.out.println("List 1: ");
        while (temp != null ){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        node m1 = new node(1000000);
        node m2 = new node(1000001);
        node m3 = new node(1000002);
        m1.next = m2;
        m2.next = m3;
        temp = m1;
        int counter=0;
        System.out.println("\nList 2: ");
        while (temp != null ){
            System.out.print(temp.data + " ");
            temp = temp.next;
            counter++;
        }
        temp = n1;
        int num1=3,num2=4;
        for (int i=1;i<=num1-1;i++){
            temp=temp.next;
        }
        node dummy = temp.next;
        temp.next = m1;
        for (int i=1;i<=num2-1;i++){
            temp=temp.next;
        }
        temp.next=dummy.next.next;
        temp =n1;
        System.out.println("\nFinal list: ");
        while (temp != null ){
            System.out.print(temp.data + " ");
            temp = temp.next;
            counter++;
        }
    }
}
