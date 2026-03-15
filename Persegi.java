/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E31253091_TRIHAYU_PUTRININGRAT;
/**
 *
 * @author A D V A N
 */
public class Persegi extends BangunDatar {

    double sisi;

    Persegi(double sisi){
        this.sisi = sisi;
    }

    double luas(){
        return sisi * sisi;
    }

    double keliling(){
        return 4 * sisi;
    }

}
