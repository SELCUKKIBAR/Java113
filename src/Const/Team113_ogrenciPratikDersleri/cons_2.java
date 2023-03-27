package Const.Team113_ogrenciPratikDersleri;

public class cons_2 {

    String isim;
    String soyIsim;
    String telNo;
    String adress;
    int yas;
    boolean izindeMi;
    char evliMi;
    int ekMesaiUcreti =20;


    public  int mesaiUcretiHEsapla(int mesaiSaati){

        return mesaiSaati*ekMesaiUcreti;
    }


}
