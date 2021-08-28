import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        int gidilenKilometre;
        double ucretKM=2.20, totalUcret;
        Scanner okuyucu=new Scanner(System.in);

        System.out.println("Lütfen gidilen KM' yi giriniz: ");
        gidilenKilometre=okuyucu.nextInt();

        totalUcret=ucretKM*gidilenKilometre+10;
        if(totalUcret<20)
        {
            totalUcret=20;
        }
        System.out.println("Toplam ödenmesi gereken tutar: "+totalUcret);
    }
}
