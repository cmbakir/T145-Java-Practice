package day02;

import java.util.Scanner;

public class P10_Ternary_Odev2 {

    public static void main(String[] args) {
                /*
                * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
                hatali giris seklinde kod yazniz
                 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz...");
        char harf = scanner.next().charAt(0);
        System.out.println(harf);


        System.out.println(harf>='A' && harf<='Z' || harf >='a' && harf <='z'? harf>='A' && harf<='Z'? "buyuk" : "kucuk": "Hatali Giris !");







    }


}
