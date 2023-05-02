package com.pertemuan2;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Sebuah Bilangan : ");
        int bilangan = input.nextInt();

        if (bilangan > 0) {
            System.out.println(bilangan + " Merupakan Bilangan Positif");
        } else if (bilangan < 0) {
            System.out.println(bilangan + " Merupakan Bilangan");
        } else {
            System.out.println(bilangan + " Merupakan Bilangan Nol");
        }

        input.close();
    }
}
