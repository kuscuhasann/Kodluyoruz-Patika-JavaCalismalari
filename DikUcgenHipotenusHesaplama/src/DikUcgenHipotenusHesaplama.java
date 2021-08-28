import java.util.Scanner;

public class DikUcgenHipotenusHesaplama {
     public static void main(String[] args) {
         /* BU ALAN HİPOTENUS HESABINA AİTTİR
         int a,b;
         double c;

         Scanner okuyucu=new Scanner(System.in);
         System.out.println("Lütfen üçgenin a(alt) kenarını giriniz");
         a=okuyucu.nextInt();
         System.out.println("Lütfen üçgenin b(dik) kenarini giriniz");
         b=okuyucu.nextInt();

         c=Math.sqrt((a*a)+(b*b));
         System.out.println("Üçgenin hipotenüsü: "+c);*/

         //Üçgenin alanının hesaplanması ödevi
         int a,b,c;
         double ucgenAlani,ucgenCevresi,u;

         Scanner okuyucu=new Scanner(System.in);


         System.out.println("Lütfen üçgenin a kenarını giriniz");
         a=okuyucu.nextInt();
         System.out.println("Lütfen üçgenin b kenarını giriniz");
         b=okuyucu.nextInt();
         System.out.println("Lütfen üçgenin c kenarını giriniz");
         c=okuyucu.nextInt();

         u=(a+b+c)/2;
         ucgenCevresi=2*u;
         ucgenAlani=u*(u-a)*(u-b)*(u-c);
         ucgenAlani=Math.sqrt(ucgenAlani);

         System.out.println("Üçgenin alanı: "+ucgenAlani);



    }
}
