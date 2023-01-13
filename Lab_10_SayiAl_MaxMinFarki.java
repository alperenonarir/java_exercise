// 11 Kasım 2020
// Kullanicidan rastgele tek basamakli sayi al en büyük en kücük farki hesapla

import java.util.ArrayList;
import java.util.Scanner;


public class Lab_10_SayiAl_MaxMinFarki {
    

    public static void main(String[] args) {
        
    ArrayList liste = new ArrayList<Integer>();
    int girilen_sayi=0;
    int tempMax=0;
    int tempMin=0;
    

    Scanner sc = new Scanner(System.in);



    System.out.println("Tek basamakli sayilar giriniz bitirmek icin 0 \n");

    do {
        girilen_sayi = sc.nextInt();
        if(girilen_sayi %2 == 0){System.out.println("Tek sayi girdiniz!\n");}
        else if(girilen_sayi != 0) {  liste.add(girilen_sayi);} 
        
    } while (girilen_sayi!=0);


if(liste.size() != 0){
    tempMax=(int)liste.get(0);
    tempMin=(int)liste.get(0);

}
  

    for (int i = 0; i < liste.size(); i++) {
        if((int)liste.get(i) > tempMax) {tempMax = (int)liste.get(i); } 
        if((int)liste.get(i) < tempMin) {tempMin = (int)liste.get(i); } 
        
    }
  

    System.out.println("Listenin \nen buyuk sayisi ==> " + tempMax +
                               " \nen kucuk sayisi ==> " + tempMin);




   sc.close();
    }
}
