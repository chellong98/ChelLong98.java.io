/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChelLong.java.Test;

import ChelLong.java.Model.GiaLapWeb;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Long Nguyen Nhat
 */
public class GiaLapWebTest {
    public static void main(String[] args) {
        try {
            GiaLapWeb gialap = new GiaLapWeb();
            gialap.testGoogle();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
