package Const.enCapsuleTekrar2;

public class enCapsuleDatalar_2 {

    String okulAdi = "ŞTGAAOO";

    int ogrSayi;
    int ogrtSayi;

    int topKisi;

    public int getTopKisi() {
        return ogrSayi + ogrtSayi;
    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public void setOgrSayi(int ogrSayi) {
        this.ogrSayi = ogrSayi;
        System.out.println(ogrSayi);
    }

    public void setOgrtSayi(int ogrtSayi) {
        this.ogrtSayi = ogrtSayi;
        System.out.println(ogrtSayi);
    }
}
