package Const.enCapsul;

public class EncapsuleData {


    static private String isim = "Selçuk KİBAR";

    public int satilanUrunAdedi ;//setter

    private int toplamSatis;// getter




    public static String getIsim() {
        return isim;
    }

    public void setSatilanUrunAdedi(int satilanUrunAdedi) {
        this.satilanUrunAdedi = satilanUrunAdedi;
        toplamSatis+=satilanUrunAdedi;
    }

    public int getToplamSatis() {
        return toplamSatis;
    }

    static private String okulAdi = "Team 113"; // değişmesin // get

    private int ogrenciSayisi; // eklme çıkarma yap set

    private int ogretmenSayisi; // ekleme çıkarma yap set

    private int toplamPersonel;


    public static String getOkulAdi() {
        return okulAdi;
    }

    public static void setIsim(String isim) {
        EncapsuleData.isim = isim;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public void setOgretmenSayisi(int ogretmenSayisi) {
        this.ogretmenSayisi = ogretmenSayisi;
    }

    public int getToplamPersonel() {
        toplamPersonel=ogrenciSayisi+ogretmenSayisi;
        return toplamPersonel;
    }
}

