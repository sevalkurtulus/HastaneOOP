package com.company.kullanici;

import java.util.Scanner;

public class Hasta {
    private String isimHasta;
    private String soyİsimHasta;
    private String kAdiHasta;
    private String sifreHasta;

    public String getIsimHasta() {
        return isimHasta;
    }

    public void setIsimHasta(String isimHasta) {
        this.isimHasta = isimHasta;
    }

    public String getSoyİsimHasta() {
        return soyİsimHasta;
    }

    public void setSoyİsimHasta(String soyİsimHasta) {
        this.soyİsimHasta = soyİsimHasta;
    }

    public String getkAdiHasta() {
        return kAdiHasta;
    }

    public void setkAdiHasta(String kAdiHasta) {
        this.kAdiHasta = kAdiHasta;
    }

    public String getSifreHasta() {
        return sifreHasta;
    }

    public void setSifreHasta(String sifreHasta) {
        this.sifreHasta = sifreHasta;
    }

    public Hasta(String isimHasta, String soyİsimHasta, String kAdiHasta, String sifreHasta) {
        this.isimHasta = isimHasta;
        this.soyİsimHasta = soyİsimHasta;
        this.kAdiHasta = kAdiHasta;
        this.sifreHasta = sifreHasta;
    }

    @Override
    public String toString() {
        return "Hasta{" +
                "isimHasta='" + isimHasta + '\'' +
                ", soyİsimHasta='" + soyİsimHasta + '\'' +
                ", kAdiHasta='" + kAdiHasta + '\'' +
                ", sifreHasta='" + sifreHasta + '\'' +
                '}';

    }
}