package Const.Ders_aninda_practis;

public class d11_2 {
    public static void main(String[] args) {
       /* Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
                input1 : “15.30 €” , input2 : “11.40 €”
        output : 36.70 €

        */

        String input1="15.30 €";
        String input2="11.40 €";

        input1=input1.replaceAll("\\D","");//1530
        input2=input2.replaceAll("\\D","");//1140
        int n1 = Integer.parseInt(input1);
        int n2 = Integer.parseInt(input2);
        double toplam = n2+n1;
        System.out.println((toplam/100)+ "€");


    }
}
