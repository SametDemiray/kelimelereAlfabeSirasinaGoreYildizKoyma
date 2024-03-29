package org.example;
/*
Bu program, klavyeden girilen her harf için alfabe sırasındaki numaraya göre satır satır harfleri büyülterek yıldızları yazdırır.
Örnek : java
J ---> **********
A ---> *
V ---> **********************
A ---> *
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Kelimeyi Giriniz : ");
        String kelime = scanner.nextLine();

        yazdirHarfSiralariylaYildiz(kelime);
    }

    public static void yazdirHarfSiralariylaYildiz(String kelime) {
        for (int i = 0; i < kelime.length(); i++) {
            char c = kelime.charAt(i);
            char buyukHarf = Character.toUpperCase(c);
            int asciiKod = (int) buyukHarf - 64; // ASCII kodundan A harfinin kodunu çıkararak harf sırasını buluyoruz
            System.out.print(buyukHarf + " ---> ");
            for (int j = 0; j < asciiKod; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}