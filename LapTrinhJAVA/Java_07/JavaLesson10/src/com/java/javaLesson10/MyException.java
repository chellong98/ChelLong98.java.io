/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.javaLesson10;

/**
 *
 * @author Long Nguyen Nhat
 */
public class MyException extends Exception{

    public MyException(String message) {
        super(message);
    }
    
    public MyException (String messenger, Throwable cause) {
        super(messenger, cause);
    }
}
