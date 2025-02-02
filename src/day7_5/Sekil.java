package day7_5;

public class Sekil {

    /*
   Cember, dikdortgen ve kare sekillerinin alan ve cevre hesaplamasi yapan bir uygulama gelistiriniz.
   1-asagidaki hiyarasiye gore classlar creat ediniz...
       Sekil class(parent) <--Cember class(child)
       Sekil class(parent) <--Dikdortgen class(child)<--Kare class(child)
   2- Classlara uygun olacak sekilde yaricap, uzunluk ve genislik veriable'ler ekleyiniz.
   3- Cember Dikdortgen Karenin alan ve cevre hesaplamalarini yaptirip sonuclari Runner classta yazdiriniz.

*/

    double yaricap;
    double uzunkenar;
    double kisaKenar;

    public Sekil(double yaricap) {
        this.yaricap = yaricap;
    }

    public Sekil(double kisaKenar, double uzunkenar) {
        this.kisaKenar = kisaKenar;
        this.uzunkenar = uzunkenar;
    }

    double alanhesaplama(double yaricap) {
        return 3.14*(yaricap*yaricap);
    }
    double alanhesaplama(double uzunkenar, double kisakenar) {
            return uzunkenar*kisakenar;
        }
   double cevrehesaplama (double yaricap) {
       return 2 * 3.14 * yaricap;
   }
   double cevrehesaplama (double uzunkenar, double kisaKenar) {
       return uzunkenar * kisaKenar;
   }
    }

