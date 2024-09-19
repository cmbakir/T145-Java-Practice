package day7_5;

public class Kare extends Dikdortgen {
    public Kare(double kisaKenar, double uzunkenar) {
        super(kisaKenar, uzunkenar);
    }

    @Override
    public String toString() {
        return "Karenin kaneri:" + uzunkenar +
                "Karenin Alani:" + alanhesaplama(uzunkenar,kisaKenar) +
                "Karenin Cevresi:" + cevrehesaplama(uzunkenar, kisaKenar);
    }
}
