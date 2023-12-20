/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7.TugasPolimorfisDinamis;

/**
 *
 * @author asus
 */
public class Nanas extends Buah{
    
    String warna;
    String rasa;

    public Nanas (String warna, String rasa){
        this.warna = warna;
        this.rasa=rasa;
    }
    
    @Override
    void rasa(){
         System.out.println("Rasa Nanas "+rasa);
    }
    @Override
    void warna(){
        System.out.println("Warna Nanas "+warna);
    }
    
}
