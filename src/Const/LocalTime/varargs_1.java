package Const.LocalTime;

public class varargs_1 {
    public static void main(String[] args) {

        islemYap(6,1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1);

    }

    public static void islemYap(int a,int...b){

        int toplam = 0;
        for (int each:b
             ) {
            toplam+=each;

        }
        System.out.println("İşlemin sonucu...=> "+a*toplam);

    }
}
