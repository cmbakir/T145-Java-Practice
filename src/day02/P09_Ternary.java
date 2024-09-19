package day02;

import java.util.Scanner;

public class P09_Ternary {

    public static void main(String[] args) {

             /*
             18 yaşından küçüklere sigara satmak yasaktır.
            Sigara alana yaşını sorup sigara alıp alamayacağını
            bir ternary kod ile yazdırınız
              */

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac Yasindasiniz : ?");
        int yas = scan.nextInt();

        System.out.println(yas < 18 ? "Size sigara satilamaz. Yasak var !" : "Hangi sigarayi istiyorsunuz");





    }
}
