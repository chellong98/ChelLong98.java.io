/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computing;

/**
 *
 * @author Long Nguyen Nhat
 */
public interface WirelessUSBinterface {
   void connectWirelessUSBport ();
   default boolean checkBattery () { //kiểu default giúp các lớp con không cần hiện thực phương thức này trong interface 
       return true; //các phương thức default bắt buộc phải hiện thực
   }
   static void supportDevice () { //dạng phương thức cố định
       String[] devices  = {"Mouse", "HDMI", "MP3"};
       System.out.println("Device supported: ");
       for (String dev : devices) {
           System.out.println(dev);
       }
   }
}
