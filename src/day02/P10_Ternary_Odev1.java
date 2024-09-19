package day02;

import java.util.Scanner;

public class P10_Ternary_Odev1 {

    public static void main(String[] args) {

        /*
        // Kullanicidan  yasini ve kilosunu alaliniz
        // 18 yasindan kucuk ise kan bagisi yapamaz
        // 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        // 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        int yas = scanner.nextInt();
        System.out.println("Lutfen kilonuzu giriniz...");
        double kilo = scanner.nextDouble();

        System.out.println(yas>18 ? kilo<50 ? "Kan Bagisi yapamaz": kilo>50? "Kan Bagisi Yapabilir" :"Kan bagisi Yapabilir" : "Kan bagisi yapamaz");




    }
}
