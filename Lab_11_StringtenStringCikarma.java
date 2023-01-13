// 11 Kasım 2020
// indexOf ve substring ile stringten string çıkarma

public class Lab_11_StringtenStringCikarma {
    

    public static void main(String[] args) {
        
        String cumle  = "Alperen 2025 yilinda SERUVEN AKADEMI'YI KURACAK :) ";
        String subCumle;
        int baslangic = cumle.indexOf("Alperen 2025");
        int bitis     = cumle.indexOf(":)");
    

        System.out.println("Alperen 2025 yilinda SERUVEN AKADEMI'YI KURACAK\n" );


        System.out.println("baslangic " + baslangic +
                         "\nbitis " + bitis);

       subCumle = cumle.substring(0,baslangic) + cumle.substring(0,bitis);
       System.out.println(subCumle);

    }


  

}
