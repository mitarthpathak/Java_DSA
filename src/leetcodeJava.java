class node{
    int data;
    node next;
    node(int data){
        this.data = data;
    }
}
public class leetcodeJava{
    public static void main(String[] args){
        System.out.println("inside the main function");
        node Node1 = new node(3);
        node Node2 = new node(4);
        node Node3 = new node(5);
        Node1.next = Node2;
        Node2.next = Node3;
        displayLinkedList(Node1);
    }
    public static void displayLinkedList(node head){
        node temp = head;
        while (temp!=null){
            System.out.println("the data is:" + temp.data);
            System.out.println("the next is:" + temp.next);
            temp = temp.next;
        }

    }

}