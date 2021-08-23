import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matNot=0,fizikNot=0,kimyaNot=0,turkceNot=0,tarihNot=0,muzikNot=0;

        Scanner okuyucu=new Scanner(System.in);

        System.out.println("Lütfen matematik notunuzu giriniz: ");
        matNot=okuyucu.nextInt();
        System.out.println("Lütfen fizik notunuzu giriniz: ");
        fizikNot=okuyucu.nextInt();
        System.out.println("Lütfen kimya notunuzu giriniz: ");
        kimyaNot=okuyucu.nextInt();
        System.out.println("Lütfen turkce notunuzu giriniz: ");
        turkceNot=okuyucu.nextInt();
        System.out.println("Lütfen tarih notunuzu giriniz: ");
        tarihNot=okuyucu.nextInt();
        System.out.println("Lütfen müzik notunuzu giriniz: ");
        muzikNot=okuyucu.nextInt();

        float notOrtalamasi=(matNot+fizikNot+kimyaNot+turkceNot+tarihNot+muzikNot)/6f;

        String durum = notOrtalamasi>60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);

    }
}
