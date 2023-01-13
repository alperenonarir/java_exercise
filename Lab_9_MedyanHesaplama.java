// 11 Kasım 2020
// Kullanıcıdan 0 giresiye kadar sayi alma ve sayiların medyanını hesaplama

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_9_MedyanHesaplama {

    public static void main(String[] args) {
        
        ArrayList liste = new ArrayList<Integer>();
        int girilen_sayi;
        int medyanIndis;
    

        Scanner sc = new Scanner(System.in);

        System.out.println("Çikmak için 0\n");

        for(int i=0; ; i++){

            System.out.println("Sayi giriniz ==> ");
            girilen_sayi = sc.nextInt();
            if(girilen_sayi==0){break;}
            liste.add(girilen_sayi);

        }
      // medyan = () Eleman Sayisi + 1 ) / 2

      int n = liste.size();
      medyanIndis = (n+1) / 2 ;
      
      // indis odakli dizi siralamasi

      int[] B = new int[n];
      for(int i =0 ; i< n ; i++){B[i]=1;}

      for (int i = 0; i < n-1; i++) {
        for(int j= i+1; j < n; j++){
       
          if( (int)liste.get(i) < (int)liste.get(j)) {B[j]++;} // == değil < olacak fakat vsc kabul etmiyor 
          else {B[i]++;}
        }        
      }

      for(int i =0; i<n; i++){
        if(B[i] == medyanIndis){System.out.println( n + " adet sayinin medyani " + liste.get(i));}
      }

      for(int i =0; i<n; i++){
       System.out.print( liste.get(i) + " ");}

       System.out.println();
      

      for(int i =0; i<n; i++){
        System.out.print(B[i] + " ");}
       



       sc.close();
    }
    
}
