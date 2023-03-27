package Const.Ders_aninda_practis;

public class ArraySoru_2 {
    public static void main(String[] args) {

        int[] arr1 = {2, 4, 5, 2, 6, 4, 7, 3, 5};
        String[] arr2 = {"selçuk", "duru", "duygu", "eda", "atılım", "selçuk"};

        elemanSayisiniYazdir(arr1, 2);
        elemanSayisiniYazdir(arr2, "selçuk");


    }

    public static void elemanSayisiniYazdir(int[] arr, int arananSayi) {
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arananSayi) {
                sayac++;

            }
        }
        System.out.println(sayac);
    }

    public static void elemanSayisiniYazdir(String[] arr, String elemanİsmi) {
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(elemanİsmi)) {
                sayac++;

            }

        }
        System.out.println(sayac);
    }
}
