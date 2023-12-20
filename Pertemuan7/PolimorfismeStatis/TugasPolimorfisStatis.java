/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7.PolimorfismeStatis;

/**
 *
 * @author asus
 */
public class TugasPolimorfisStatis {
    
    void biodata(String nama){
        System.out.println("Nama saya = "+nama);
    }
    void biodata(String nama, int umur){
        System.out.println("Nama saya = "+nama+" Dan umur saya = "+umur);
    }
    
    public static void main(String[] args) {
        TugasPolimorfisStatis data = new TugasPolimorfisStatis();
        data.biodata("Sri Handayani");
        data.biodata("Sri handayani", 20);
    }
}
