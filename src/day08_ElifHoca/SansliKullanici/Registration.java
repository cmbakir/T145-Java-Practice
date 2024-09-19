package day08_ElifHoca.SansliKullanici;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

    static ArrayList<User> usersList = new ArrayList<User>();

    static public void register() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Isminizi giriniz.. ");
        String name = scan.nextLine();

        /*

        System.out.println("Dogum tarihinizi giriniz (yyyy-MM-DD formatinda olmali)");
        String date=scan.nextLine();
        LocalDate birthday= LocalDate.parse(date);

         */
        LocalDate birthdate = null;
        boolean formatDate = false;

        // istenen tarih formatini girilene kadar sormasi icin while kullandik
        while (!formatDate) {

            System.out.println("Dogum tarihinizi giriniz (yyyy-MM-DD formatinda olmali)");
            String date = scan.nextLine();


            if (date.matches("^\\d{4}-\\d{2}-\\d{2}$")) {
                birthdate = LocalDate.parse(date);

                if (birthdate.isAfter(LocalDate.now())) {
                    System.out.println("Gecersiz bir tarih, bugunden once bir tarih giriniz");
                } else {
                    System.out.println("Dogum tarihi gecerlidir");
                    formatDate=true;
                }


            } else {
                System.out.println("Gecersiz tarih formati girdiniz, lutfen formata uygun giriniz");
            }
        }
        User user = new User(name, birthdate);
        usersList.add(user);

        System.out.println("Kullanici kayit edildi");
    }
}