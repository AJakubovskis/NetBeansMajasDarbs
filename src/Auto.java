/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 37126
 */
public class Auto {
    String marka;
    int gads;
    
    Auto(String marka, int gads) {
        this.marka = marka;
        this.gads = gads;
    }
    
    void setMarka() {
        this.marka = marka;
    }
    
    String getMarka() {
        return this.marka;
    }
    
    void printInfo() {
        System.out.println("Marka: " + marka);
        System.out.println("Gads: " + gads);
    }
}
