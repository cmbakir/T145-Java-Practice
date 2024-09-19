package day01;

public class P06_Odev1 {
    public static void main(String[] args) {

        /*
        ÖDEV SORUSU: Aşağıdaki gibi bir ATM Karşılama Ekranı Hazırlayıp yazdırınız
        **********  WISE BANK   **********
            WISE ATM’YE HOŞGELDİNİZ
            1 – Bakiye Sorgulama
            2 – Para Yatırma
            3 – Para Çekme
            4 – Bilgi Güncelleme
            5 – Kart İade
        **********  WISE BANK   **********
         */
        String BankaIsmi = "WISE BANK";
        String ATMIsmi = "WISE ATM";
        String Bakiye ="Bakiye Sorgulama";
        String ParaYatirma ="Para Yatirma";
        String ParaCekme = "Para Cekme";
        String BilgiGuncelleme="Bilgi Guncelleme";
        String KartIade ="Kart Iade";
        String Boslukiki = "  ";
        String Tire = " - ";

        int secenek1 = 1;
        int secenek2 = 2;
        int secenek3 = 3;
        int secenek4 = 4;
        int secenek5 = 5;


        System.out.println("**********" + Boslukiki + BankaIsmi + Boslukiki + "*********\n\t"+ATMIsmi + "'ye" + " Hos geldiniz");
        System.out.println("\t" +secenek1 + Tire + Bakiye);
        System.out.println("\t" +secenek2 + Tire + ParaYatirma);
        System.out.println("\t" +secenek3 + Tire + ParaCekme);
        System.out.println("\t" +secenek4 + Tire + BilgiGuncelleme);
        System.out.println("\t" +secenek5 + Tire + KartIade);
        System.out.println("**********" + Boslukiki + BankaIsmi + Boslukiki + "*********");


        //System.out.println("\t1 - " + Bakiye);
        //System.out.println("\t2 - " + ParaYatirma);
        //System.out.println("\t3 - " + ParaCekme);
        //System.out.println("\t4 - " + BilgiGuncelleme);
        //System.out.println("\t5 - " + KartIade);
        //System.out.println("**********" + Boslukiki + BankaIsmi + Boslukiki + "*********");


    }
}
