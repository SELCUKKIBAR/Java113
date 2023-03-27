package Const.forEach;

public class for_each_soru2 {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen int array’deki her elementin karelerini alip,
        karelerinin toplamini yazdiran bir method olusturun.
         */
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        arrninelemanlarininKarseiniAl(arr);
    }

    public static void arrninelemanlarininKarseiniAl(int[] arr) {
        for (int each : arr
        ) {
            System.out.print(each * each + " ");
        }
    }
}
