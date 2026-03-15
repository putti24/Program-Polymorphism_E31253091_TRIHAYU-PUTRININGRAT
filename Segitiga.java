package E31253091_TRIHAYU_PUTRININGRAT;

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