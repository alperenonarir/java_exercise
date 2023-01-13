// 11 Kasım 2020
// Rastgele 15 Boyutlu dizi üretme ve en uzun artarak devam eden parça uzunlugunu yazdirma



public class Lab_8_RandomArray {

    public static void main(String[] args) {
        
        int[] dizi = new int[15];
        int enUzunAdim =0;
        int Temp = 0;


        for(int i=0; i<15; i++){
            dizi[i] = (int)(Math.random()*10);
            System.out.print(dizi[i] + " ");  
                               }

        System.out.println();

        for (int i = 0; i < 14; i++) {
            if     (dizi[i] < dizi[i+1])                     { Temp++;}
            else if(Temp > enUzunAdim)     {enUzunAdim = Temp; Temp=0;}
            else                                              {Temp=0;}
            
        }

        if(Temp > enUzunAdim) {enUzunAdim = Temp;}

        System.out.print("\n En uzun adim: " + enUzunAdim);  


    }
}
