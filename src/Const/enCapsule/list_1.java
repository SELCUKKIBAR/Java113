package Const.enCapsule;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list_1 {


    /*
    Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.


     */

    public static void main(String[] args) {

        System.out.println(isimalListeOlustur());


    }
    public static List<String > isimalListeOlustur(){

        Scanner scan = new Scanner(System.in);

        String name="";


        List<String> isimList = new ArrayList<>();

        do {

            System.out.println("bir isim giriniz...: ");
            name = scan.nextLine();
            if (!name.equalsIgnoreCase("q")){
                isimList.add(name);
            }


        }while (!name.equalsIgnoreCase("q"));
        return isimList;
    }
}
