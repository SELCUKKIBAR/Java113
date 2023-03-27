package z_Babayigit_hoca_ile_preticler.week03.dersAni;

public class final_finally_finalize {
    public static void main(String[] args) {


       // System.out.println(Integer.MIN_VALUE); //-2147483648

        //Integer.MIN_VALUE=3; MIN_VALUE final bir değer olduğundanatama yapılamaz


        try {
            System.out.println(10/0);
            System.out.println("Bölmenin sonrasındaki satır");
        } catch (Exception e) {
            System.out.println("Catch bloğundaki satir");
        } finally {
            System.out.println("Finalyy bloğundaki satır");

        }


    }
}
