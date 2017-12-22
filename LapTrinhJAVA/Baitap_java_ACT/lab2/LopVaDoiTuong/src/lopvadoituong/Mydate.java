/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopvadoituong;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Mydate {
    Scanner sc = new Scanner (System.in);
    private int day, month, year;
    
    public Mydate () {
        day = 0;
        month = 0;
        year = 0;
    }
    
    public Mydate (Mydate d) {
        this.day = d.day;
        this.month = d.month;
        this.year = d.year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "ngày: " + day + " | tháng: " + month + " | năm: " + year; 
    }
    
    
}
