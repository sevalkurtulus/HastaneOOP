package com.company.kullanici;

import java.util.ArrayList;
import java.util.List;

public class Kisiler {

    public Bashekim bashekim;
    public List<Hasta> hastaList=new ArrayList<>();
    public List<Hemsire> hemsireList=new ArrayList<>();
    public List<Doktor> doktorList=new ArrayList<>();



    public Bashekim getBashekim() {
        return bashekim;
    }

    public void setBashekim(Bashekim bashekim) {
        this.bashekim = bashekim;
    }

    public List<Hasta> getHastaList() {
        return hastaList;
    }

    public void setHastaList(List<Hasta> hastaList) {
        this.hastaList = hastaList;
    }

    public List<Hemsire> getHemsireList() {
        return hemsireList;
    }

    public void setHemsireList(List<Hemsire> hemsireList) {
        this.hemsireList = hemsireList;
    }

    public List<Doktor> getDoktorList() {
        return doktorList;
    }

    public void setDoktorList(List<Doktor> doktorList) {
        this.doktorList = doktorList;
    }

    @Override
    public String toString() {
        return "Kisiler{" +
                "bashekim=" + bashekim +
                ", hastaList=" + hastaList +
                ", hemsireList=" + hemsireList +
                ", doktorList=" + doktorList +
                '}';
    }
}
