import java.util.Random;
import java.util.Scanner;

public class WordGuessGameChatGPT {
    public static void main(String[] args) {
        String[] kelimeler = {"java", "programlama", "bilgisayar", "mühendislik", "geliştirici"};

        Random random = new Random();
        int index = random.nextInt(kelimeler.length);
        String secilenKelime = kelimeler[index];

        char[] tahminEdilenKelime = new char[secilenKelime.length()];
        for (int i = 0; i < tahminEdilenKelime.length; i++) {
            tahminEdilenKelime[i] = '_';
        }

        Scanner scanner = new Scanner(System.in);
        int kalanTahminHakki = 6;

        while (kalanTahminHakki > 0) {
            System.out.println("Tahmininiz: " + new String(tahminEdilenKelime));
            System.out.println("Kalan Tahmin Hakkınız: " + kalanTahminHakki);
            System.out.print("Bir harf girin: ");
            char tahmin = scanner.next().charAt(0);

            boolean dogruTahmin = false;
            for (int i = 0; i < secilenKelime.length(); i++) {
                if (secilenKelime.charAt(i) == tahmin) {
                    tahminEdilenKelime[i] = tahmin;
                    dogruTahmin = true;
                }
            }

            if (!dogruTahmin) {
                kalanTahminHakki--;
            }

            if (new String(tahminEdilenKelime).equals(secilenKelime)) {
                System.out.println("Tebrikler! Kelimeyi doğru tahmin ettiniz: " + secilenKelime);
                break;
            }
        }

        if (kalanTahminHakki == 0) {
            System.out.println("Üzgünüm, tahmin hakkınız bitti. Doğru kelime: " + secilenKelime);
        }

        scanner.close();
    }
}

