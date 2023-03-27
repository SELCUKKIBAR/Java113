package Const.enCapsule_2;

import Const.enCapsule.enCapsule_1;

public class capsule_denem {

    public static void main(String[] args) {


        enCapsule_1 obj = new enCapsule_1();

        System.out.println(obj.getName());
        obj.setOgrenci_sayisi(650);
        obj.setOgretmen_sayisi(30);

        System.out.println(obj.getToplam());



    }

}
