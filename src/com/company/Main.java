package com.company;

import com.company.kullanici.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static Bashekim bashekim;
    public static Kisiler kisiler;
    public static Doktor doktor;
    public static Hemsire hemsire;


    public static void main(String[] args) {
        kisiler=new Kisiler();
        Bashekim bashekim = new Bashekim();
        kisiler=bashekim.kullaniciEkle(kisiler);

        while (true) {
            bashekim.login(kisiler);
        }
            }
        }





