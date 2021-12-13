package com.company.kullanici;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.kullanici.Doktor.menu1;

public class Bashekim {
    private String RolBashekim;
    private String isimBashekim;
    private String soyİsimBashekim;
    private String kAdiBashekim;
    private String sifreBashekim;

    public String getRolBashekim() {
        return RolBashekim;
    }

    public void setRolBashekim(String rolBashekim) {
        RolBashekim = rolBashekim;
    }

    public String getIsimBashekim() {
        return isimBashekim;
    }

    public void setIsimBashekim(String isimBashekim) {
        this.isimBashekim = isimBashekim;
    }

    public String getSoyİsimBashekim() {
        return soyİsimBashekim;
    }

    public void setSoyİsimBashekim(String soyİsimBashekim) {
        this.soyİsimBashekim = soyİsimBashekim;
    }

    public String getkAdiBashekim() {
        return kAdiBashekim;
    }

    public void setkAdiBashekim(String kAdiBashekim) {
        this.kAdiBashekim = kAdiBashekim;
    }

    public String getSifreBashekim() {
        return sifreBashekim;
    }

    public void setSifreBashekim(String sifreBashekim) {
        this.sifreBashekim = sifreBashekim;
    }

    public ArrayList<Bashekim> getBashekim() {
        return bashekim;
    }

    public void setBashekim(ArrayList<Bashekim> bashekim) {
        this.bashekim = bashekim;
    }

    ArrayList <Bashekim> bashekim = new ArrayList<>();

    public Bashekim(String RolBashekim,String isimBashekim, String soyİsimBashekim, String kAdiBashekim,String sifreBashekim) {
        this.RolBashekim=RolBashekim;
        this.isimBashekim = isimBashekim;
        this.soyİsimBashekim = soyİsimBashekim;
        this.kAdiBashekim = kAdiBashekim;
        this.sifreBashekim=sifreBashekim;
    }

    public Bashekim() {
    }

    @Override
    public String toString() {
        return "Bashekim{" +
                "RolBashekim='" + RolBashekim + '\'' +
                ", isimBashekim='" + isimBashekim + '\'' +
                ", soyİsimBashekim='" + soyİsimBashekim + '\'' +
                ", kAdiBashekim='" + kAdiBashekim + '\'' +
                ", sifreBashekim='" + sifreBashekim + '\'' +
                ", bashekim=" + bashekim +
                '}';
    }
    public  void personelGoruntule(Kisiler kisiler) {


        if (kisiler.getHemsireList().isEmpty() && kisiler.getDoktorList().isEmpty()) {
            System.out.println("Personel listeniz boş lütfen personel ekleyiniz");

        }else {

            System.out.println(kisiler.toString());

        }

    }




    public Kisiler kullaniciEkle(Kisiler kisiler) {
        Doktor doktor=new Doktor();
        Hemsire hemsire = new Hemsire();


        Scanner input = new Scanner(System.in);
        System.out.println("Rol Giriniz");
        String rol = input.nextLine();


        if(rol.equalsIgnoreCase("BASHEKIM")){
            if (kisiler.getBashekim() != null) {
                System.out.println("Zaten BaşHekim Var");
                return kisiler;
            }
            kisiler.setBashekim(bashekimEkle());
        }
        else if(rol.equalsIgnoreCase("DOKTOR")){
            kisiler.getDoktorList().add( doktor.doktorEkle());
        }else if(rol.equalsIgnoreCase("HEMSIRE")){
            kisiler.getHemsireList().add(hemsire.hemsireEkle());

        }else if(rol.equalsIgnoreCase("HASTA")){

        }
        return kisiler;
    }

    public void login(Kisiler kisiler) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı Giriniz");
        String kullaniciadiLogin = input.nextLine();
        System.out.println("Şifre Giriniz");
        String sifreLogin = input.nextLine();


        if (kisiler.getBashekim().getkAdiBashekim().equalsIgnoreCase(kullaniciadiLogin) && kisiler.getBashekim().getSifreBashekim().equals(sifreLogin) ) {
                System.out.println("Bashekim olarak başarılı şekilde giris yaptınız");
                menu(kisiler);
        }
        else if(kisiler.getDoktorList().get(0).getkAdiDoktor().equals(kullaniciadiLogin) && kisiler.getDoktorList().get(0).getSifreDoktor().equals(sifreLogin)){
            menu1(kisiler);
        }else if(kisiler.getHemsireList().get(0).getkAdiHemsire().equals(kullaniciadiLogin) && kisiler.getHemsireList().get(0).getSifreHemsire().equals(sifreLogin))
        {
            menu1(kisiler);
        }else System.out.println("Giriş yapamadınız");

    }
    public  void menu(Kisiler kisiler) {
        int secim=0;

        while (secim != 7) {

            System.out.println("Lütfen Secim Yapınız");
            System.out.println("1-Personel Bilgileri Goruntule ");
            System.out.println("2-Bordro");
            System.out.println("3-Personel Ekle");
            System.out.println("4-Personel Sil");
            System.out.println("5-Personel Güncelle");
            System.out.println("6-Hasta Ekle");
            System.out.println("7-Çıkış");
            Scanner console = new Scanner(System.in);
            System.out.print("Seçim yapınız");
            secim = console.nextInt();
            switch (secim) {

                case 1:
                  personelGoruntule(kisiler);
                    break;
                case 2:
                    System.out.println("Bordro hakkında bir işlem yapılmadı :)");
                    break;
                case 3:
                    kullaniciEkle(kisiler);
                    break;
                case 4:
                   personelSil(kisiler);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Lütfen menüdeki tuşları  tuşlayınız");
            }
        }
    }
    public void personelSil(Kisiler kisiler){

        Scanner secim = new Scanner(System.in);
        int goruntule=secim.nextInt();
        if(kisiler.getHemsireList().size() >= goruntule) {
            kisiler.getHemsireList().remove(goruntule -1);
            System.out.println(kisiler.getHemsireList());
        }
        if(kisiler.getDoktorList().size() >= goruntule){
            kisiler.getDoktorList().remove(goruntule-1);}
        System.out.println(kisiler.getDoktorList());
    }

    public Bashekim bashekimEkle(){
        Scanner input = new Scanner(System.in);

        this.setRolBashekim("Bashekim");
        System.out.println("İsim Giriniz");
        String isim = input.nextLine();
        this.setIsimBashekim(isim);

        System.out.println("Soyisim Giriniz");
        String soyisim = input.nextLine();
        this.setSoyİsimBashekim(soyisim);
        System.out.println("Kullanici adi Giriniz");
        String kullaniciadi = input.nextLine();
        this.setkAdiBashekim(kullaniciadi);
        System.out.println("Şifre Giriniz");
        String sifre = input.nextLine();
        this.setSifreBashekim(sifre);
        System.out.println("Kayıt Oluşturulmuştur");
        String value = input.nextLine();
        Bashekim yeniBashekim = new Bashekim("Bashekim", isim, soyisim, kullaniciadi, sifre);
        bashekim.add(yeniBashekim);
        System.out.println(bashekim);
        return yeniBashekim;
    }

}