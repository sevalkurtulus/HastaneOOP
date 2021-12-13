package com.company.kullanici;

import com.company.Hastaneİsleri;
import com.company.personel;

import java.util.List;
import java.util.Scanner;

public class Doktor extends Hastaneİsleri implements personel {
    public String isimDoktor;
    public String soyİsimDoktor;
    public String kAdiDoktor;
    public String sifreDoktor;



    public Doktor() {
    }

    public Doktor(String isimDoktor, String soyİsimDoktor, String kAdiDoktor,String sifreDoktor) {
        this.isimDoktor = isimDoktor;
        this.soyİsimDoktor = soyİsimDoktor;
        this.kAdiDoktor = kAdiDoktor;
        this.sifreDoktor = sifreDoktor;
    }

    public String getSifreDoktor() {
        return sifreDoktor;
    }

    public void setSifreDoktor(String sifreDoktor) {
        this.sifreDoktor = sifreDoktor;
    }

    public String getIsimDoktor() {
        return isimDoktor;
    }

    public void setIsimDoktor(String isimDoktor) {
        this.isimDoktor = isimDoktor;
    }

    public String getSoyİsimDoktor() {
        return soyİsimDoktor;
    }

    public void setSoyİsimDoktor(String soyİsimDoktor) {
        this.soyİsimDoktor = soyİsimDoktor;
    }

    public String getkAdiDoktor() {
        return kAdiDoktor;
    }

    public void setkAdiDoktor(String kAdiDoktor) {
        this.kAdiDoktor = kAdiDoktor;
    }

    @Override
    public String toString() {
        return "Doktor{" +
                "isimDoktor='" + isimDoktor + '\'' +
                ", soyİsimDoktor='" + soyİsimDoktor + '\'' +
                ", kAdiDoktor='" + kAdiDoktor + '\'' +
                ", sifreDoktor='" + sifreDoktor + '\'' +
                '}';
    }



    @Override
    public void ameliyataGir() {

        System.out.println(Doktor.doktor.getIsimDoktor()+" ameliyata girdi");
    }

    @Override
    public void igneYap() {
        System.out.println(Doktor.doktor.getIsimDoktor()+"igne yaptı");
        super.igneYap();
    }

    @Override
    public void izinAL() {
        System.out.println(Doktor.doktor.getIsimDoktor()+" kişisi izin istedi");

    }

    @Override
    public void maasAl() {
        System.out.println(Doktor.doktor.getIsimDoktor()+" kişisi maaşını aldı");
    }

    public Doktor doktorEkle(){
        Doktor doktor=new Doktor();
        Scanner input = new Scanner(System.in);
        System.out.println("İsim Giriniz");
        String isim = input.nextLine();
        doktor.setIsimDoktor(isim);
        System.out.println("Soyisim Giriniz");
        String soyisim = input.nextLine();
        doktor.setSoyİsimDoktor(soyisim);
        System.out.println("Kullanici adi Giriniz");
        String kullaniciadi = input.nextLine();
        doktor.setkAdiDoktor(kullaniciadi);
        System.out.println("Şifre Giriniz");
        String sifre = input.nextLine();
        doktor.setSifreDoktor(sifre);
        System.out.println("Kayıt Oluşturulmuştur");
        return doktor;

    }
    public static Doktor doktor;
    //garbage collector
    //singleton design pattern
    public static void menu1(Kisiler kisiler) {
        int secim1=0;
        personel new1 = new Doktor();
        while (secim1 !=5) {
            System.out.println("1-Ameliyata Gir");
            System.out.println("2-İğne Yap ");
            System.out.println("3-İzne Çık");
            System.out.println("4-Maaş Al");
            System.out.println("5-Çıkış");
            Scanner console = new Scanner(System.in);
            secim1 = console.nextInt();
            //tek seferde yazılcak
            System.out.println("Seçiminizi yapın");
            Doktor doktor = new Doktor();
            switch (secim1) {
                case 1:
                    Doktor.doktor=kisiler.getDoktorList().get(0);
                    doktor.ameliyataGir();
                    break;
                case 2:

                    doktor.igneYap();
                    break;
                case 3:
                    new1.izinAL();
                    break;
                case 4:
                    new1.maasAl();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Lütfen menüdeki tuşları  tuşlayınız");
            }
        }
    }
}
