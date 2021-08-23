import java.util.Scanner;

public class KdvTutariHesapla {
    public static void main(String[] args) {
        float girilenTutar=0;
        float kdvliFiyat,kdvTutari;

        Scanner okuyucu=new Scanner(System.in);
        System.out.println("Lütfen tutar giriniz");
        girilenTutar=okuyucu.nextInt();

        if(girilenTutar>1000)
        {
            kdvTutari=girilenTutar*8/100;
            kdvliFiyat=girilenTutar+kdvTutari;
            System.out.println("Kdvli Fiyat: "+kdvliFiyat+" Kdv Tutarı: "+kdvTutari);
        }
        else
        {
            kdvTutari=girilenTutar*18/100;
            kdvliFiyat=girilenTutar+kdvTutari;
            System.out.println("Kdvli Fiyat: "+kdvliFiyat+" Kdv Tutarı: "+kdvTutari);
        }

    }
}
