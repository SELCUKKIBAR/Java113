package Const.enKapsul_deneme;

import Const.enCapsul.EncapsuleData;

public class enKapsulDeneme {
    public static void main(String[] args) {

        EncapsuleData obj = new EncapsuleData();

        System.out.println(EncapsuleData.getIsim());
        //System.out.println(obj.getIsim());

        obj.setSatilanUrunAdedi(100);
        System.out.println(obj.satilanUrunAdedi);
        obj.setSatilanUrunAdedi(300);

        System.out.println(obj.satilanUrunAdedi);

        System.out.println(obj.getToplamSatis());

    }


}
