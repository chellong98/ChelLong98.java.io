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
public class Book {
    private String name;
    private int publicedYear;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicedYear() {
        return publicedYear;
    }

    public void setPublicedYear(int publicedYear) {
        this.publicedYear = publicedYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "=======thông tin cuốn sách:======" + "\ntên sách: " + name + "\năm xuất bản: " + publicedYear + "\n tác giả: " + author;
    }
    
    
}
