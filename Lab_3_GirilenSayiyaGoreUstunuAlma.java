// 24 Ekim 2020
// Girilen sayılara göre üst alma işlemi
//

import java.util.Scanner;


public class Lab_3_GirilenSayiyaGoreUstunuAlma {

    public static void main(String[] Arg){


        int  girilen_sayi=0 ;
        int  ustDereces = 0;
        int sonuc=0;


        Scanner sc = new Scanner(System.in);


        

        System.out.print("Sayi giriniz ==> ");
        girilen_sayi = sc.nextInt();
    
        System.out.print("Ust giriniz ==> ");
        ustDereces = sc.nextInt();

        

        if(girilen_sayi == 0){
             if(ustDereces == 0) {  System.out.print("0 ustu 0 TANIMSIZ'dir. \n"); }
             else {sonuc = 0;}
    
        }
       else{
        sonuc=girilen_sayi;
        for(int i =2 ; i<=ustDereces; i++ ){
         sonuc = girilen_sayi*sonuc;           
              }}
        

System.out.print(" \n \n sonuc :" + sonuc);

        

sc.close();

    }

    
}
