/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysach;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Book implements Comparable<Book>{ //hiện thực interface comparable để so sanh đối tượng
    private String isbn; //chỉ số isbn của mỗi cuốn sách là khác nhau
    private double price; //giá sách
    private int publicedYear; // năm xuât bản
    
    //các phương thức getter và setter cho các thuộc tính của sách
    public void setIsbn (String isbn) { 
        this.isbn = isbn;
    }
    public String getIsbn () {
        return isbn;
    }
    
    public void setPrice (double price) {
        this.price = price;
    }
    public double getPrice () {
        return price;
    }
    
    public void setPublicedYear (int publicedYear) {
        this.publicedYear = publicedYear;
    }
    public int getPublicedYear () {
        return publicedYear;
    }

    @Override
    public String toString() {
        return isbn + " | " + price + " | " + publicedYear ;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Book o) { //phwuong thức so sánh đối tượng

        if (this.publicedYear > o.getPublicedYear()) return -1;
        else if (this.publicedYear < o.getPublicedYear()) return 1; //sắp xếp giảm dần nền nhỏ hơn sẽ lấy
        else return 0;
        
    }
    
    
}
