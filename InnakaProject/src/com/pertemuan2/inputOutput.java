package com.pertemuan2;

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama Anda : ");
        String nama = input.nextLine();

        System.out.println("Selamat Pagi " + nama);

        input.close();
    }
}
