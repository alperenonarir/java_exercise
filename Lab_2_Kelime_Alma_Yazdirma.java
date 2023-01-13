// 24 Ekim 2020
// 2-) Kelime alma ve yazdırma
//

import java.util.Scanner;

public class Lab_2_Kelime_Alma_Yazdirma {

    public static void main(String[] args) {
        
        String isim_1,isim_2,isim_3;
    
        Scanner sc = new Scanner(System.in);
       
   
       System.out.println("Arka arkaya 3 kelime giriniz");
   
       isim_1 = sc.next();
       isim_2 = sc.next();
       isim_3 = sc.next();
   
       System.out.println(isim_1 + " " + isim_2 + " " + isim_3);

     sc.close();

    }
  
}
