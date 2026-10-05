package leetcode;

//Input: head = [1,2,6,3,4,5,6], val = 6
//Output: [1,2,3,4,5]

public class RemoveElement {
    public static void main(String[] args){
        node n1 = new node(1);
        node n2 = new node(2);
        node n3 = new node(6);
        node n4 = new node(3);
        node n5 = new node(4);
        node n6 = new node(5);
        node n7 = new node(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        node temp = n1;
        int n =6;
        System.out.println("before removing ");
        while (temp != null ){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        temp = n1;
        while (temp != null){
            if (temp.next.data == 6){
                temp.next = temp.next.next;
                temp = temp.next;
            }
            else {
                temp = temp.next;
            }
        }
        temp = n1;
        System.out.println("\n" + "after removing ");
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
