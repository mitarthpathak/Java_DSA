package leetcode;

import leetcode.node;
public class leetcodeJava{
    public static void main(String[] args){
        System.out.println("inside the main function");
        node Node1 = new node(3);
        node Node2 = new node(4);
        node Node3 = new node(5);
        Node1.next = Node2;
        Node2.next = Node3;
        displayLinkedList(Node1);
        node Node4 = new node(6);
        addAnElementAtTheEnd(Node1,Node4);
        System.out.println("after adding an element");
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
    public static void addAnElementAtTheEnd(node head, node ele){
        node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = ele;
    }
}