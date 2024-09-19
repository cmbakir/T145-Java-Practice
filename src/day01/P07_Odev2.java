package day01;

import java.util.Scanner;

public class P07_Odev2 {
    public static void main(String[] args) {

        /*
        1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın.
         *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com.tr
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
         */

        String KayitBasarili = "seklinde sistemimize kaydiniz basariyla tamamlanmistir.";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Adinizi Giriniz...");
        String GirilenAd = scanner.next();
        System.out.println("Lutfen Soyadinizi Giriniz...");
        String GirilenSoyadi = scanner.next();
        System.out.println("Lutfen Yasinizi Giriniz...");
        int GirilenYas = scanner.nextInt();
        System.out.println("Lutfen Mail Adresinizi Giriniz...");
        String GirilenMail = scanner.next();
        System.out.println("Lutfen Sifrenizi Giriniz...");
        String GirilenSifre = scanner.next();

        System.out.println("*****       KAYIT BASARILI       *****");
        System.out.println("Adiniz: " + GirilenAd);
        System.out.println("Soyadiniz: " + GirilenSoyadi);
        System.out.println("Yasiniz:"+ GirilenYas);
        System.out.println("Mail Adresiniz:"+ GirilenMail);
        System.out.println("Sifreniz: " + GirilenSifre);
        System.out.println(KayitBasarili);



    }
}
