package com.pertemuan2;

public class Looping {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Prulangan ke" + i);
        }
        System.out.println("Selesai perulangan for");

        int j = 0;
        while (j < 10) {
            System.out.println("Perulangan whil ke-" + j);
            j++;
        }
        System.out.println("Perulangan while selesai");

        int k = 0;
        do {
            System.out.println("perulangan do while ke-" + k);
            k++;
        } while (k < 10);

        System.out.println("Perulangan do while selesai");
    }
}
