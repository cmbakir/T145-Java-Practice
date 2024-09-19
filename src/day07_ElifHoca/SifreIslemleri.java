package day07_ElifHoca;

public class SifreIslemleri {

    public static void sifredegistirme() {
        System.out.println("Mevcut sifrenizi giriniz");
        String ksifre = GirisIslemleri.scan.nextLine();
        if (ksifre.equals(GirisIslemleri.sifre)){
            System.out.println("Yeni sifrenizi giriniz");
            String yenisifre= GirisIslemleri.scan.nextLine();
            // System.out.println("Sifreniz güncellendi"); 4 rakamli olmasinin önemi yoksa bunu yazdir

            if (yenisifre.length() == 4) {
                GirisIslemleri.sifre = yenisifre;
                System.out.println("Sifreniz güncellendi");
                MenuIslemleri.menu();
            } else {
                System.out.println("4 rakamli sirfe girmelisiniz");
                sifredegistirme();
            }
        }else{
            System.out.println("Sifre eslesmedi, yeniden deneyiniz");
            sifredegistirme();
        }

    }

}
