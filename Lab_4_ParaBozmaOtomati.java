// 24 Ekim 2020
// Para bozan ve duruma göre ekle-cikar yapan program

import java.util.Scanner;

public class Lab_4_ParaBozmaOtomati {

    public static void main(String[] args) {
        

        int anaPara;
        int ilkPara;
   

        int elli,yirmi,on,bes=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Para bozma sistemine hosgeldiniz  \n" +
        "Lufen tutar giriniz ==> ");
        
        anaPara = sc.nextInt();
        ilkPara = anaPara;

        if(anaPara % 5 > 2){ 
            int eklenen = 5- (ilkPara%5);
            anaPara += eklenen;
            System.out.println("Tam bolebilmek icin hesabina " + eklenen + "  TL eklendi" );}

        else if(anaPara % 5 <=2 && anaPara % 5 != 0) {
           
            int cikarilan = ilkPara%5;
            anaPara -= cikarilan;
            System.out.println("Tam bolebilmek icin hesabindan " + cikarilan + " TL cikarildi" );}

        


       elli  = anaPara / 50 ;  anaPara = anaPara %50;
       yirmi = anaPara / 20 ;  anaPara = anaPara %20;
       on    = anaPara / 10 ;  anaPara = anaPara %10;
       bes   = anaPara / 5  ;  anaPara = anaPara %5;
    
       System.out.println( "Paraniz bozulmustur : \n" +
          elli  +" 50lik\n" + 
          yirmi +" 20lik\n" + 
          on    +" 10lik\n" + 
          bes   +" 5lik\n" );



          sc.close();

    }




}
