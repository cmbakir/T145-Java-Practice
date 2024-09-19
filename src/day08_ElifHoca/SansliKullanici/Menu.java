package day08_ElifHoca.SansliKullanici;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {

    static public void giris() {
        System.out.println("Uygulamaya Hosgeldiniz ! Sansli kullanici sen misin? hadi belirleyelim!!!");

        System.out.println("Seciminizi rakam olarak yaziniz...\n" +
                "1.isim ve dogumtarihi ile kayit yapin\n" +
                "2.Sansli kisi kim ?\n" +
                "3.Cikisi");

        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {

            int secim = scan.nextInt();
            switch (secim) {
                case 1: {
                    Registration.register();
                    giris();
                    break;
                }
                case 2: {
                    Listing.printHappyUsers(Registration.usersList);
                    giris();
                break;
                }
                case 3: {
                System.out.println("Gule Gule");
                break;
                }
                default:
                    System.out.println("Gecerli sayi girmedinz, tekrar deneyiniz");
                    giris();
            }

        } else {
            System.out.println("Lutfen sadece sayi giriniz");
        }
    }
}