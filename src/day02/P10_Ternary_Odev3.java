package day02;

import java.util.Scanner;

public class P10_Ternary_Odev3 {

    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int sayi = scanner.nextInt();

        System.out.println(sayi >=0 ? sayi <10 ? "Rakam" : "Pozitif Sayi" : "Negatif Sayi");



    }
}
