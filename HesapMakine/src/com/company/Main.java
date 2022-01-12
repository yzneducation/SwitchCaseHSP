package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  int sayi1,sayi2;
        int deger ;
        System.out.println(" TOPLAMA İÇİN 1, \n Çarpma için 2 \n Çıkarma için 3\n Bölme için 4 \n    ");
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı girniz");
        sayi1=input.nextInt();
        System.out.println("lütfen sayi 2 giriniz");
        sayi2=input.nextInt();

          deger = input.nextInt();

        switch (deger){
            case 1:
                System.out.println("Toplama islemi sonucu = " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Çarpma islemi sonucu = "+ (sayi1*sayi2));
                break;
            case 3:
                System.out.println("Çıkarma islemi soncu = " + (sayi1-sayi2));
                break;
            case 4:
                if (sayi2 == 0 && sayi1== 0) {
                    System.out.println("0 ile bölünemez");
                    break;
                }

                System.out.println("Bölme islemi sonucu = " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Yanlis tuslama lütfen 1-2-3-4 aralığında secim yapınız");

        }

    }
}
