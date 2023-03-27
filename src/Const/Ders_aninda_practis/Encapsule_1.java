package Const.Ders_aninda_practis;

import Const.enCapsul.EncapsuleData;

public class Encapsule_1 {
    public static void main(String[] args) {
        EncapsuleData obj = new EncapsuleData();

        System.out.println(EncapsuleData.getOkulAdi());

        obj.setOgrenciSayisi(300);
        obj.setOgretmenSayisi(20);
        System.out.println(obj.getToplamPersonel());
        obj.satilanUrunAdedi=99; // fonksiyon
        obj.setSatilanUrunAdedi(12); // setter


    }





}
