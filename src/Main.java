import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mat, fizik, turkce, kimya, muzik, ders_sayisi, toplam;
        ders_sayisi = 0;
        toplam = 0;
        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = scanner.nextDouble();
        if (mat < 0 || mat > 100) {
            System.out.println("Geçersiz not ortalamaya dahil edilmedi...");
        } else {
            toplam += mat;
            ders_sayisi++;
        }

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = scanner.nextDouble();
        if (fizik < 0 || fizik > 100) {
            System.out.println("Geçersiz not ortalamaya dahil edilmedi...");
        } else {
            toplam += fizik;
            ders_sayisi++;
        }

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = scanner.nextDouble();
        if (turkce < 0 || turkce > 100) {
            System.out.println("Geçersiz not ortalamaya dahil edilmedi...");
        } else {
            toplam += turkce;
            ders_sayisi++;
        }

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = scanner.nextDouble();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Geçersiz not ortalamaya dahil edilmedi...");
        } else {
            toplam += kimya;
            ders_sayisi++;
        }

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = scanner.nextDouble();
        if (muzik < 0 || muzik > 100) {
            System.out.println("Geçersiz not ortalamaya dahil edilmedi...");
        } else {
            toplam += muzik;
            ders_sayisi++;
        }

        double avarage = toplam / ders_sayisi;

        if (avarage <= 55) {
            System.out.println("Tebrikler sınıfı geçtiniz...");
            System.out.print("Notunuz: " + avarage);

        } else {
            System.out.println("Üzgünüz sınıfta kaldınız...");
            System.out.print("Notunuz: " + avarage);
        }

    }
}
