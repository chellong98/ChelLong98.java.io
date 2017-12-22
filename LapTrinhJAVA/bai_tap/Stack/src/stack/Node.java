/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Node {
    Book book;
    Node next;
    
    public Node (Book book) {
        this.book = book;
    }
    
    public Node (Book book, Node node) {
        this.book = book;
        this.next = node;
    }
}
