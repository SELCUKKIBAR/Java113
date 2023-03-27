package Const.d34;

public class CAvciKuslar extends BKuslar {

    public void hareket() {
        System.out.println("ucarlar");
    }

    public void beslenme() {
        System.out.println("et yerler");
    }

    @Override
    public void omur() {
        System.out.println("Avcı kuşlar ortalama 50 yıl yaşar");
    }

    public void pence() {
        System.out.println("pencelidir");
    }

    public void gaga() {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {
        CAvciKuslar Kartal = new CAvciKuslar();
        CAvciKuslar Sahin = new CAvciKuslar();
        AHayvanlar bayKus = new CAvciKuslar();
        bayKus.hareket();
        bayKus.solunum();
        bayKus.omur();
    }

}
