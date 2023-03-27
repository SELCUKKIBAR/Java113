package z_Babayigit_hoca_ile_preticler.week03.dersAni;

public class Rope {

    public void Rope(){
        System.out.println("merhaba");
    }

    public static void  swing(){
        System.out.println("swing ");
    }

    public  void climb(){
        System.out.println("climb ");
    }

    public static void play(){

        swing();
        Rope r3 = new Rope();
        r3.climb();
    }

    public static void main(String[] args) {


        System.out.println("==============================");
        Rope rope=new Rope();
        rope.play();
        Rope rope2 = null;
        rope2.play();

    }
}
