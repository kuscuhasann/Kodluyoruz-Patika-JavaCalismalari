import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        double armutFiyat=2.14,elmaFiyat=3.67,domatesFiyat=1.11,muzFiyat=0.95,patlicanFiyat=5.00,toplamTutar;
        Scanner okuyucu=new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? : ");
        toplamTutar=armutFiyat*okuyucu.nextInt();
        System.out.println("Elma Kaç Kilo ? :");
        toplamTutar+=elmaFiyat*okuyucu.nextInt();
        System.out.println("Domates Kaç Kilo ? :");
        toplamTutar+=domatesFiyat*okuyucu.nextInt();
        System.out.println("Muz Kaç Kilo ? :");
        toplamTutar+=muzFiyat*okuyucu.nextInt();
        System.out.println("Patlican Kaç Kilo ? :");
        toplamTutar+=patlicanFiyat*okuyucu.nextInt();

        System.out.println("Toplam tutar: "+toplamTutar);

    }
}
