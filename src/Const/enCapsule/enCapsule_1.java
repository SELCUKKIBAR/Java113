package Const.enCapsule;

public class enCapsule_1 {

    private int ogrenci_sayisi = 700; // değişebilsin SET

    private int ogretmen_sayisi = 50;// değişlebilsin SET

    private int toplam = ogrenci_sayisi+ogretmen_sayisi; // görsün GET

    private String name = "team 113"; // görsün GET


    public int getToplam() {
        toplam = ogretmen_sayisi+ogrenci_sayisi;
        return toplam;
    }

    public void setOgrenci_sayisi(int ogrenci_sayisi) {
        this.ogrenci_sayisi = ogrenci_sayisi;
    }

    public void setOgretmen_sayisi(int ogretmen_sayisi) {
        this.ogretmen_sayisi = ogretmen_sayisi;
    }

    public String getName() {
        return name;
    }
}
