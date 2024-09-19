package day02;

import java.util.Scanner;

public class P08_ifElseStatements_Odev {

    public static void main(String[] args) {

            /*
    1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
    2.vize notu double değerinde girilecek.

    3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor
    !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!

    4.Kullanıcıya    "Final sınav sonucunuzu giriniz.

    5. final notu double değerinde olmalı. (örn: 65,5)

    6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.

    7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.

    8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.

    todo  :  Koşul kısmı
eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak
AA, 80(80dahil)   ile 90 arasında ise
BA, 70(70 dahil)   ile 80 arasında ise
BB, 60(60dahil) ile 70 arasında ise
CB, 50(50 dahil) ile 60 arasında ise
CC, 40(40 dahil) ile 50 arasında ise
DC, 30(30 dahil) ile 40 arasında ise
DD, 30 'dan düşük ise FF  gelmeli.

             */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Vize sonucunuzu giriniz...");
        double vizenotu = scanner.nextDouble();
        System.out.println("Lutfen vize sinavi yuzdesini giriniz...");
        double vizeyuzdesi = scanner.nextDouble();
        System.out.println("Lutfen final sinav sonucunuzu giriniz...");
        double finalNotu = scanner.nextDouble();

        System.out.println("Lutfen final sinavi yuzdesini giriniz...");
        double finalyuzdesi = scanner.nextDouble();

        double hesaplananNot = vizenotu*vizeyuzdesi + finalNotu*finalyuzdesi;
        double toplam = hesaplananNot;

        if (toplam >=90) {
            System.out.println("Notunuz AA");
        } else if (toplam>=80) {
            System.out.println("Notunuz BA");
        } else if (toplam>=70) {
            System.out.println("Notunuz BB");
        } else if (toplam>=60) {
            System.out.println("Notunuz CB");
        } else if (toplam>=50) {
            System.out.println("Notunuz CC");
        } else if (toplam>=40) {
            System.out.println("Notunuz DC");
        } else if (toplam >=30) {
            System.out.println("Notunuz DD");
        } else {
            System.out.println("Notunuz FF");
        }


    }
}