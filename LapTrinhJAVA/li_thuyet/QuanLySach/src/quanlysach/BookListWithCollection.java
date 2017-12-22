/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysach;

import java.util.*;

/**
 *
 * @author Long Nguyen Nhat
 */
public class BookListWithCollection implements bookInterface {

    List<Book> list = null;

    public BookListWithCollection() { //1 constructor cho danh sách book
        list = new ArrayList<Book>();
    }

    int find(String isbn) { //tìm xem cuốn sách đó đã tồn tại trong list hay chưa
        for (int i = 0; i < list.size(); i++) {
            if (isbn.equals(list.get(i).getIsbn())) { //so sánh isbn cần tìm có bằng isbn của 1 cuốn sách nào đó hay k?
                return i;
            }
        }
        return -1;
    }

    public boolean checkISBN(String isbn) { //hàm kiểm tra ISBN, tham số truyền vào là isbn
        String pattern = "ISBN-\\w{2}-\\d{4}"; //mẫu regular expression, gồm có ISBN-2 kí tự-4 số
        if (isbn.matches(pattern)) { //nếu hợp mẫu
            return true; //đúng
        }
        return false; //sai
    }

    public boolean checkPublicYear(int publicedYear) { //hàm kiểm tra năm, tham số truyền vào là năm
        String pattern = "\\d{4}";//mẫu gồm có 4 số
        String year = String.valueOf(publicedYear); //hàm chuyển từ các kiểu dữ liệu cơ bản sang kiểu String
        if (year.matches(pattern)) { //nếu hợp mẫu
            return true;
        }
        return false;
    }

    public boolean checkPrice(double price) { //hàm kiểm tra giá, tham số truyền vào là giá
        if (price >= 0) { //giá lớn hơn 0
            return true; //đúng
        }
        return false; //sai
    }

    @Override
    public void add() {
        double price = 0;
        int publicedYear = 0;
        Scanner sc = new Scanner(System.in);
        String isbn;

        boolean flag; //biến kiểm tra
        do {
            System.out.println("Nhập vào số ISBN: ");
            isbn = sc.next();
            flag = checkISBN(isbn); //nếu trả về đúng
        } while (!flag); //nếu trả về sai thì lặp lại

        int index = find(isbn); //tìm xem cuốn sách đã có chưa
        if (index >= 0) { //nếu trả về vị trí
            System.out.println("cuốn sách này đã có! vui lòng nhập số khác");
            return; //đã có sách
        }

        do { //kiểm tra giá
            System.out.println("nhập giá: ");
            price = sc.nextDouble();
            flag = checkPrice(price);
        } while (!flag);

        do { //kiểm tra năm xuất bản
            System.out.println("nhập năm xuất bản: ");
            publicedYear = sc.nextInt();
            flag = checkPublicYear(publicedYear);
        } while (!flag);

        Book book = new Book(); //khởi tạo 1 cuốn sách
        book.setIsbn(isbn);
        book.setPrice(price);
        book.setPublicedYear(publicedYear);
        list.add(book); //thêm 1 phần tử book và list

    }

    @Override
    public void remove() {
        String isbn;
        System.out.println("nhập vào mã số ISBN cuốn sách cần xóa: ");
        Scanner sc = new Scanner(System.in);
        isbn = sc.next();
        int index = find(isbn);
        if (index < 0) {
            System.out.println("không có cuốn sách mã số " + isbn);
        } else {
            list.remove(index);
            System.out.println("đã xóa cuốn sách " + isbn);
        }
    }

    @Override
    public void update() {
        String isbn;
        double price;
        int publicedYear;
        Scanner sc = new Scanner(System.in);

        boolean flag; //biến kiểm tra
        do {
            System.out.println("Nhập vào số ISBN: ");
            isbn = sc.next();
            flag = checkISBN(isbn); //nếu trả về đúng
        } while (!flag); //nếu trả về sai thì lặp lại

        int index = find(isbn); //tìm xem cuốn sách có tồn tại hay không
        if (index < 0) {
            System.out.println("không tìm thấy cuốn sách này!");
        } else {
            do {
                System.out.println("nhập giá: ");
                price = sc.nextDouble();
                flag = checkPrice(price);
            } while (!flag);

            do { //kiểm tra năm xuất bản
                System.out.println("nhập năm xuất bản: ");
                publicedYear = sc.nextInt();
                flag = checkPublicYear(publicedYear);
            } while (!flag);

            list.get(index).setPrice(price); //list[index] vì cuốn sách cần update chính là vị trí vừa tìm thấy
            list.get(index).setPublicedYear(publicedYear);
            System.out.println("đã update thành công sách mới!");
        }
    }

    @Override
    public void print() {
        if (list.isEmpty()) { //nếu không có cuốn sách nào
            System.out.println("không có cuốn sách nào cả");
            return;
        }
        Collections.sort(list);
        System.out.println("DANH SÁCH  HIỆN CÓ: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); //in ra toString (thuộc tính của từng cuốn sách)
        }
    }

}
