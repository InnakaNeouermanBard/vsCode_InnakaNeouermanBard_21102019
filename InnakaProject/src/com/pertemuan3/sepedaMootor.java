package com.pertemuan3;

public class sepedaMootor {
    private String merek;
    private String tipe;
    private int harga;

    public sepedaMootor() {
    }

    public sepedaMootor(String merek, String tipe, int harga) {
        System.out.println("Berjalan");
        this.merek = merek;
        this.tipe = tipe;
        this.harga = harga;

    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void showInfo() {
        System.out.println("Merek : " + merek);
        System.out.println("Tipe  : " + tipe);
        System.out.println("Harga : " + harga);
        System.out.println();

    }
}
