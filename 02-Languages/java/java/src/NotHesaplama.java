import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrenci adını giriniz: ");
        String ogrenciAdi = scanner.nextLine();

        System.out.print("Sınav sayısını giriniz: ");
        int sinavSayisi = scanner.nextInt();

        int[] sınavNotlari = new int[sinavSayisi];

        for (int i = 0; i < sinavSayisi; i++) {
            System.out.print("Sınav " + (i + 1) + " notunu giriniz: ");
            sınavNotlari[i] = scanner.nextInt();
        }

        double ortalama = ortalamaHesapla(sınavNotlari);
        String durum = notAnalizi(ortalama);

        System.out.println("Öğrenci Adı: " + ogrenciAdi);
        System.out.println("Ortalama: " + ortalama);
        System.out.println("Durum: " + durum);
    }

    public static double ortalamaHesapla(int[] notlar) {
        int toplam = 0;
        for (int not : notlar) {
            toplam += not;
        }
        return (double) toplam / notlar.length;
    }

    public static String notAnalizi(double ortalama) {
        if (ortalama >= 60) {
            return "Geçti";
        } else {
            return "Kaldı";
        }
    }
}

