package Const.Ders_aninda_practis;

public class Array_soru_3 {
    public static void main(String[] args) {
        // en uzun ve en  kısa metni yazan methodu yazın

        String []arr={"melike","burkay","inci","eda","emre"};

        enUzunEnKisaYazdir(arr);




    }

    public static void enUzunEnKisaYazdir(String []arr){

        String enUzunKelime = arr[0];
        String  enKisaKelime=arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length()>=enUzunKelime.length()){
                enUzunKelime=arr[i];
            }
            if (arr[i].length()<=enKisaKelime.length()){
                enKisaKelime=arr[i];
            }

        }
        System.out.println(enUzunKelime);
        System.out.println(enKisaKelime);

    }
}
