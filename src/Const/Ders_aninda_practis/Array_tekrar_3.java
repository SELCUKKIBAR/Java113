package Const.Ders_aninda_practis;

import java.util.Arrays;

public class Array_tekrar_3 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9},{0,2,3}};
        System.out.println(Arrays.deepToString(arr));

        int [][][] arr1 = {{{1,2},{3,4}},{{5,6},{7,8}},{{9,0}}};
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr1[0]));

        arr1[0][0][0]=12;
        System.out.println(Arrays.deepToString(arr1[0]));

        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                for (int k = 0; k < arr1[i][j].length; k++) {
                    System.out.print(arr1[i][j][k]+",");
                    
                }
                
            }
            
        }
    }
}
