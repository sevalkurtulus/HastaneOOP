package com.company.kullanici;

import com.company.Hastaneİsleri;
import com.company.personel;

import java.util.Scanner;

public class Hemsire extends Hastaneİsleri implements personel {
    private String isimHemsire;
    private String soyİsimHemsire;
    private String kAdiHemsire;
    private String sifreHemsire;

    public String getSifreHemsire() {
        return sifreHemsire;
    }

    public void setSifreHemsire(String sifreHemsire) {
        this.sifreHemsire = sifreHemsire;
    }

    public String getIsimHemsire() {
        return isimHemsire;
    }

    public void setIsimHemsire(String isimHemsire) {
        this.isimHemsire = isimHemsire;
    }

    public String getSoyİsimHemsire() {
        return soyİsimHemsire;
    }

    public void setSoyİsimHemsire(String soyİsimHemsire) {
        this.soyİsimHemsire = soyİsimHemsire;
    }

    public String getkAdiHemsire() {
        return kAdiHemsire;
    }

    public void setkAdiHemsire(String kAdiHemsire) {
        this.kAdiHemsire = kAdiHemsire;
    }

    public Hemsire(String isimHemsire, String soyİsimHemsire, String kAdiHemsire,String sifreHemsire) {
        this.isimHemsire = isimHemsire;
        this.soyİsimHemsire = soyİsimHemsire;
        this.kAdiHemsire = kAdiHemsire;
        this.sifreHemsire = sifreHemsire;
    }

    public Hemsire() {

    }

    @Override
    public String toString() {
        return "Hemsire{" +
                "isimHemsire='" + isimHemsire + '\'' +
                ", soyİsimHemsire='" + soyİsimHemsire + '\'' +
                ", kAdiHemsire='" + kAdiHemsire + '\'' +
                ", sifreHemsire='" + sifreHemsire + '\'' +
                '}';
    }
    @Override
    public void ameliyataGir() {
        System.out.println(Hemsire.hemsire.getIsimHemsire()+" ameliyata girdi");
    }



    @Override
    public void igneYap() {
        System.out.println(Hemsire.hemsire.getIsimHemsire()+" iğne yaptı");
        super.igneYap();
    }

    @Override
    public void izinAL() {
        System.out.println(Hemsire.hemsire.getIsimHemsire()+" kişisi izin istedi");
    }

    @Override
    public void maasAl() {
        System.out.println(Hemsire.hemsire.getIsimHemsire()+" kişisi maaşını aldı");
    }

    public Hemsire hemsireEkle() {
        Hemsire hemsire = new Hemsire();
        Scanner input = new Scanner(System.in);
        System.out.println("İsim Giriniz");
        String isim = input.nextLine();
        hemsire.setIsimHemsire(isim);
        System.out.println("Soyisim Giriniz");
        String soyisim = input.nextLine();
        hemsire.setSoyİsimHemsire(soyisim);
        System.out.println("Kullanici adi Giriniz");
        String kullaniciadi = input.nextLine();
        hemsire.setkAdiHemsire(kullaniciadi);
        System.out.println("Şifre Giriniz");
        String sifre = input.nextLine();
        hemsire.setSifreHemsire(sifre);
        System.out.println("Kayıt Oluşturulmuştur");

        return hemsire;
    }
    public static Hemsire hemsire;
    public static void menu1(Kisiler kisiler) {
        int secim1=0;
        personel new1 = new Hemsire();
        while (secim1 != 5) {
            System.out.println("1-Ameliyata Gir");
            System.out.println("2-İğne Yap ");
            System.out.println("3-İzne Çık");
            System.out.println("4-Maaş Al");
            System.out.println("5-Çıkış");
            Scanner console = new Scanner(System.in);
            secim1 = console.nextInt();
            System.out.println("Seçiminizi yapın");
            Hemsire hemsire = new Hemsire();
            switch (secim1) {
                case 1:
                    Hemsire.hemsire=kisiler.getHemsireList().get(0);
                    hemsire.ameliyataGir();
                    break;
                case 2:
                    hemsire.igneYap();
                    break;
                case 3:
                    new1.izinAL();
                    break;
                case 4:
                    new1.maasAl();
                    break;
                case 5:
                    break;
            }
        }
    }
}
