package day7_5;

public class Dikdortgen extends Sekil{
    public Dikdortgen(double kisaKenar, double uzunkenar) {
        super(kisaKenar, uzunkenar);
    }


    @Override
    public String toString() {
        return "Dikdortgenin uzunkenari : " + uzunkenar +
                " Dikdortgenin kisa kenari:" + kisaKenar +
                " Dikdortegnin alani : " + alanhesaplama(uzunkenar,kisaKenar)+
                " Dikdortgenin cevresi :" + cevrehesaplama(uzunkenar,kisaKenar);
    }
}
