/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E31253091_TRIHAYU_PUTRININGRAT;
/**
 *
 * @author A D V A N
 */
public class Segitiga extends BangunDatar {

    double alas;
    double tinggi;

    Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    double luas(){
        return 0.5 * alas * tinggi;
    }

    double keliling(){
        return alas + tinggi + Math.sqrt((alas*alas)+(tinggi*tinggi));
    }

}
