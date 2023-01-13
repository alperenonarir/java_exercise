// 11 Kasım 2020
// Cümledeki ünlü harfleri silip cümleyi ekrana yazan kod

import java.util.Scanner;


public class Lab_5_CumledekiUnluleriSılme {


    public static void main(String[] args) {
        

        String girilen_cumle;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cumle Giriniz\n");
        girilen_cumle = sc.nextLine();


        for(int i=0; i<girilen_cumle.length(); i++){

            if(
            girilen_cumle.charAt(i) == 'a'   ||
            girilen_cumle.charAt(i) == 'A'   ||
            girilen_cumle.charAt(i) == 'e'   ||
            girilen_cumle.charAt(i) == 'E'   ||
            girilen_cumle.charAt(i) == 'i'   ||
            girilen_cumle.charAt(i) == 'I'   ||
            girilen_cumle.charAt(i) == 'o'   ||
            girilen_cumle.charAt(i) == 'O'   ||
            girilen_cumle.charAt(i) == 'u'   ||
            girilen_cumle.charAt(i) == 'U'   

             ){continue;}

             else{System.out.print(girilen_cumle.charAt(i));}




        }
   

        sc.close();

    }
    
}
