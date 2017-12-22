/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan;

/**
 *
 * @author Long Nguyen Nhat
 * họ và tên, ngày  sinh, nghề nghiệp.
 */
public class Nguoi {
    private String name;
    private int date;
    private String job;

    public Nguoi () {
        
    }
    
    public Nguoi (String name, int date, String job) {
        this.name = name;
        this.date = date;
        this.job = job;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return name + " | " + date + " | " + job;
    }
    
    
}
