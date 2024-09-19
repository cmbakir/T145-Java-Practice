package day06;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.*;


public class Odev1 {

    public static void main(String[] args) {


    /*
    Soru 1:
    Verilen bir dizideki en büyük ve en küçük sayıyı bulan bir Java programı yazınız.
    Metodunuz varargs kullanarak herhangi bir sayıda argüman alabilmelidir.
     */

        /*
        int[] arr = {12, 11, 22, 34, 2, 86, 79, 77};
        List<Integer> enBuyukVeEnkucukSayilar = new ArrayList<>();
        int enBuyuk = 0;
        int enKucuk = 100;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>enBuyuk) {
         enBuyuk=arr[i];
            } else {
                enBuyuk=0;
            }


        }
        System.out.print(enBuyuk);

        /*



     /*
     Soru 2:
    Kullanıcı tarafından girilen sayıları toplayan bir Java programı yazınız.
    Metodunuz varargs kullanarak herhangi bir sayıda argüman alabilmelidir.
     */

        sayilarinToplami();


        }

    private static void sayilarinToplami() {
        List<String> toplanacakSayilar =new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int toplam=0;
        String giris="";
        System.out.println("Lutfen bir sayi giriniz\nbitirmek icin x e basiniz");

        while(!giris.contains("x")) {
            System.out.println("Lutfen sayilari giriniz");
            giris = scan.next();
            toplanacakSayilar.add(giris);

        }
        for(String each : toplanacakSayilar) {
            int sayilar = Integer.parseInt(each);
            toplam+=sayilar;
        }
        System.out.println(toplam);

    }

}