package z_Babayigit_hoca_ile_preticler.week03.week07;

public class P01_doWhileLoop {
    /*
    ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.
     */
    public static void main(String[] args) {
        char ilkHarf='k';
        do{
            System.out.print(ilkHarf+"-");
            ilkHarf++;
        }while(ilkHarf<='t');
    }
}
