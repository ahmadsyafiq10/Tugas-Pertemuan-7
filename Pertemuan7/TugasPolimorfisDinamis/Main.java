/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7.TugasPolimorfisDinamis;

/**
 *
 * @author asus
 */
public class Main {
    
        public static void main(String[] args) {
        Buah buah = new Buah();
        Jeruk jeruk = new Jeruk("orange","manis");
        BuahNaga buahNaga = new BuahNaga("Merah","manis");
        Nanas nanas = new Nanas("Kuning","Masam");
        
        jeruk.rasa();
        jeruk.warna();
        buahNaga.rasa();
        buahNaga.warna();
        nanas.rasa();
        nanas.warna();
    }
    
}
