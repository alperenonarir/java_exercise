// 11 Kasım 2020
// Kullanıcıdan 3x3 matris alma ve çift ve üçe bölünebilen sayı adetlerini bulma

import java.util.Scanner;


public class Lab_7_MatrisAlma {
    
    public static void main(String[] args) {
        
        int[][] matris = new int[3][3];
        int ciftAdet=0;
        int UcunKatiAdet=0;

        Scanner sc = new Scanner(System.in);


        System.out.println("3X3 Matris Giriniz\n");


        for(int i = 0; i<3; i++){

            for(int j = 0; j<3; j++){

                System.out.print( (i+1) + ". Satirin " + (j+1) + ".  Sutununu Giriniz ==> "  );
                matris[i][j] = sc.nextInt();
                if(matris[i][j] % 2 == 0) {ciftAdet++;}
                if(matris[i][j] % 3 == 0) {UcunKatiAdet++;}
            }
        }





      System.out.println("Matriste  " + ciftAdet + " adet cift sayi vardir.");
      System.out.println("Matriste  " + UcunKatiAdet + " adet ucun kati sayi vardir.");

      for(int i = 0; i<3; i++){

        for(int j = 0; j<3; j++){

            System.out.print( matris[i][j] + " ");

        }
        System.out.println();
    }


      sc.close();
    }
}

