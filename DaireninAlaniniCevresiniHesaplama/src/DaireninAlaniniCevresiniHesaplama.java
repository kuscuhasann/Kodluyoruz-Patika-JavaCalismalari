import java.util.Scanner;

public class DaireninAlaniniCevresiniHesaplama {
    public static void main(String[] args) {
    /* DAİRENİN ALANINI VE ÇEVRESİNİ HESAPLAYAN PROGRAM
        int r;
        double pi=3.14,daireCevresi,daireAlani;
        Scanner okuyucu=new Scanner(System.in);

        System.out.println("Lütfen dairenin yarıçapını giriniz");
        r=okuyucu.nextInt();
        daireAlani=pi*r*r;
        daireCevresi=2*pi*r;
        System.out.println("Dairenin Alani: "+daireAlani+"Dairenin Cevresi: "+daireCevresi);*/

        //Yarıçapı r, merkez açısısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        int r,merkezAciOlcusu;
        double pi=3.14,daireDilimAlani;
        Scanner okuyucu=new Scanner(System.in);
        System.out.println("Lütfen dairenin yarıçapını giriniz");
        r=okuyucu.nextInt();
        System.out.println("Lütfen merkez açısının ölçüsünü giriniz giriniz");
        merkezAciOlcusu=okuyucu.nextInt();
        daireDilimAlani=(pi*(r*r)*merkezAciOlcusu)/360;
        System.out.println("Daire dilim alani : "+daireDilimAlani);
    }
}
