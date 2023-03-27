package Const.Ders_aninda_practis;

public class Array_tekrar_sorular {
    public static void main(String[] args) {

        /*
        Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir method olusturun.
         */

        int [][] arr ={{10,10,10},{10,5,10},{7,10,9},{10,10,10}};
        int toplam = 0;

        //System.out.println(arr[0].length);

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j]%2==0){
                    toplam+=arr[i][j];
                }
            }
        }
        System.out.println("Çift sayıların toplamı..: "+toplam);
    }
}
