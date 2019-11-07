/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan55.handphone;

/**
 *
 * @author ASUS
 * NAMA : fikri maulana
 * KELAS : if2
 * NIM : 10118074
 */
public class PBO210118074LATIHAN55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     public static void main(String[] args) {
        Android android = new Android("Android", "Android", "Grand", 3000000);
        android.setKeyStore("234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store : " + android.getKeyStore() + "\n");
        
        BlackBerry bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("PIN : " + bb.getPinBB() + "\n");
        
        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        wp.setWpKeyStore("UUUQIJWORJ");
        wp.displayProduct();
        System.out.println("Wp Key Store : " + wp.getWpKeyStore() + "\n");
        
         System.out.println("developed by : fikri maulana");
    }
    
}
    

