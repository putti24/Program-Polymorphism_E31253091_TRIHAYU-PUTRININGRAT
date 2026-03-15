package E31253091_TRIHAYU_PUTRININGRAT;

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