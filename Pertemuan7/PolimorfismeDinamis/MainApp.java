/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7.PolimorfismeDinamis;

/**
 *
 * @author asus
 */
public class MainApp {
    
    public static void main(String[] args) {
        
    BangunDatar bangunDatar = new BangunDatar();
    Persegi persegi = new Persegi(5);
    Segitiga segitiga = new Segitiga(5,10);
    Lingkaran lingkaran = new Lingkaran(10);
    
    //panggil method luas dan keliling
    bangunDatar.luas();
    bangunDatar.keliling();
    
        System.out.println("Luas persegi = "+persegi.luas());
        System.out.println("keliling persegi = "+persegi.keliling());
        System.out.println("Luas segitiga = "+segitiga.luas());
        System.out.println("Luas lingkaran = "+lingkaran.luas());
        System.out.println("keliling lingkaran ="+lingkaran.luas());
        
}
    
}
