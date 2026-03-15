/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E31253091_TRIHAYU_PUTRININGRAT;
/**
 *
 * @author A D V A N
 */
public class Lingkaran extends BangunDatar {

    double r;

    Lingkaran(double r){
        this.r = r;
    }

    double luas(){
        return Math.PI * r * r;
    }

    double keliling(){
        return 2 * Math.PI * r;
    }

}
