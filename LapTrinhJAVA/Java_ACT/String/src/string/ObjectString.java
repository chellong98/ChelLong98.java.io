/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author Long Nguyen Nhat
 */
public class ObjectString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "ABJH-1212-3NKN-sdfsd";
        for (int i = 0; i < 10; i++) {
            name = name + i;
            System.out.println(name);
        }
        
        StringBuffer buffer = new StringBuffer("A");
        
        StringBuilder buider = new StringBuilder("B");
        
        System.out.println(name.compareTo("24312"));
        
        System.out.println(name.toLowerCase());
        
        String[] arrStr = name.split("-");
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println(arrStr[i]);
        }
    }
    
}
