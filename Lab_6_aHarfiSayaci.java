// 11 Kasım 2020
// Cümledeki a harflerini sayan program

import java.util.Scanner;

public class Lab_6_aHarfiSayaci {

    
    public static void main(String[] args) {
        

        String girilen_cumle;
        int sayac =0; 

        Scanner sc = new Scanner(System.in);

        System.out.println("Cumle Giriniz\n");
        girilen_cumle = sc.nextLine();

        for(int i=0; i <girilen_cumle.length(); i++){
            if(girilen_cumle.charAt(i) == 'a' ||
               girilen_cumle.charAt(i) == 'A'  ) {sayac++; }
                

    }

    System.out.println("\n Cumlede " + sayac + " adet a harfi gecmektedir.");

    sc.close();
}}

// 11 Kasım 2020
// Cümledeki ünlü harfleri silip cümleyi ekrana yazan kod





        
