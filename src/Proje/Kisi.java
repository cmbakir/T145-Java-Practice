package Proje;

public class Kisi {

        /*
        Öğretmen: Ad,Soyad, Tc kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
        Öğrenci: Ad,Soyad, Tc kimlik No, yaş, numara, sınıf bilgileri içermelidir.
         */


    private String firstname;
    private String lastname;
    private String TcNo;
    private int yas;

    public Kisi(String firstname, String lastname, String tcNo, int yas) {
        this.firstname = firstname;
        this.lastname = lastname;
        TcNo = tcNo;
        this.yas = yas;
    }


}
