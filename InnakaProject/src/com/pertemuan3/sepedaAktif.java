package com.pertemuan3;

public class sepedaAktif {
    public static void main(String[] args) {
        sepedaMootor suzuki = new sepedaMootor();
        sepedaMootor yamaha = new sepedaMootor();
        sepedaMootor honda = new sepedaMootor();

        // suzuki.merek = "Suzuki";
        // suzuki.tipe = "GSX 150 R";
        // suzuki.harga = 20000000;

        // yamaha.merek = "Yamaha";
        // yamaha.tipe = "YZF R15";
        // yamaha.harga = 25000000;

        // honda.merek = "Honda";
        // honda.tipe = "CBR 150 R";
        // honda.harga = 25500000;

        // suzuki.showInfo();
        // yamaha.showInfo();
        // honda.showInfo();

        sepedaMootor vespa = new sepedaMootor("Vespa", "Vespa Metic", 40000000);
        vespa.showInfo();

        System.out.println(
                "Motor Merek : " + vespa.getMerek() +
                        " ,Dengan Tipe (Sebelum): " + vespa.getTipe());

        vespa.setTipe("Sprint");

        System.out.println(
                "Motor Merek : " + vespa.getMerek() +
                        " ,Dengan Tipe (Sesudah): " + vespa.getTipe()

        );
    }
}
