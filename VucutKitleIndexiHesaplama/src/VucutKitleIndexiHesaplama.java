import java.util.Scanner;

public class VucutKitleIndexiHesaplama {
    public static void main(String[] args) {
        double kisiBoyUzunluk,vucutKitleIndeksi;
        int kisiKilo;
        Scanner okuyucu=new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        kisiBoyUzunluk=okuyucu.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        kisiKilo=okuyucu.nextInt();

        vucutKitleIndeksi=kisiKilo/(kisiBoyUzunluk*kisiBoyUzunluk);

        System.out.println("Vücut Kitle İndeksiniz : "+vucutKitleIndeksi);
    }
}
