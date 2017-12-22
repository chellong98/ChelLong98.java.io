/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystack;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Stack {

    private Node top;
    private int size;

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int item) {
        if (isEmpty()) {
            Node node = new Node(item);
            top = node;
        } else {
            Node node = new Node(item, top);
            top = node;
        }
    }

    public int pop() {
        Node node = null;
        if (!isEmpty()) {
            if (top.next == null) {
                node = top;
                node.next = null;
                top = null;
            } else {
                node = top;
                top = top.next;
                node.next = null;
            }
            return node.data;
        }
        return -1;
    }

    public int numOfelement() {
        Node node = top;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public int search(int item) {
        int pos = 0;
        Node node = top;
        while (node != null) {
            pos++;
            if (node.data == item) {
                return pos;
            }
            node = node.next;
        }
        return 0;
    }

    public void display() {
        Node node = top;
        while (node != null) {
            System.out.print(node.data + " | ");
            node = node.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.size = stack.numOfelement();
        System.out.println("danh sách hiện tại có " + stack.size + " phần tử");
        stack.display();
        System.out.println("lấy phần tử " + stack.pop() + " ra khỏi danh sách");
        System.out.println("lấy phần tử " + stack.pop() + " ra khỏi danh sách");
        stack.display();
    }
}
