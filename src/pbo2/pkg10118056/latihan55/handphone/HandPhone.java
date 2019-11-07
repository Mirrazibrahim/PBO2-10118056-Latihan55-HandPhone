/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118056.latihan55.handphone;

/**
 *
 * @author 
 * Nama : Mirraz Ibrahim
 * Nim : 10118056
 * Kelas: IF-2
 */
public class HandPhone {
    protected String manufacture,operatingSystem,model;
    protected int harga;

    public HandPhone(String man, String os, String model, int harga) {
        manufacture = man;
        operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    public void displayProduct(){
        System.out.println("Manufaktur : "+manufacture);
        System.out.println("OS : "+operatingSystem);
        System.out.println("Model : "+model);
        System.out.println("Harga : "+harga);
    }
    
    
    
}
