/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Stack {

    Node top;
    //thêm construct set cho cái biến top này là quyển sách ở đỉnh stack đi
//    public Stack () {
//        top.next = null;
//    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(Book book) {
        if (isEmpty()) {
            Node node = new Node(book);
            top = node;
        } else {
            Node node = new Node(book, top);
            top = node;
        }
    }

    public Book pop() { // đây a
        Node node = null;
        if (!isEmpty()) {
            if (top.next == null) {
                node = top;
                top = null;
            } else {
                node = top;
                //ngồi tự nghĩ xem vì sao có mỗi cái dòng này nhé =))@@ :v
                top = top.next; //đây này a, e pop xong cho top = top,next r mà
            }
            return node.book;
        }
        return null;
    }

    public Book input() {
        Book book = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào tên sách: ");
        String name = sc.nextLine();
        System.out.println("nhập vào năm xuất bản: ");
        int publicedYear = sc.nextInt();
        sc.nextLine();
        System.out.println("nhập vào tác giả: ");
        String author = sc.nextLine();
        book.setName(name);
        book.setAuthor(author);
        book.setPublicedYear(publicedYear);
        return book;
    }

    public void display() {
        Node node = top;
        //node.book = this.pop();
        //cái node này phải có dữ liệu, vì cái top nó không có dữ liệu nên ko chạy vòng while
        while (node != null) {
            System.out.println(node.book);
            node = node.next;
        }
    }

    public int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================");
        System.out.println("1. thêm sách vừa nhập vào danh sách");
        System.out.println("2. lấy ra cuốn sách trên đỉnh danh sách");
        System.out.println("3. hiển thị dữ liệu sách");
        System.out.println("4. thoát ct");
        System.out.println("================");
        int choice;
        System.out.println("mời bạn nhập vào lựa chọn: ");
        choice = sc.nextInt();
        return choice;
    }
}
//sửa cái méo gì ấy nhỉ?
//anh pop đi, rồi in ra ấy, anh cho