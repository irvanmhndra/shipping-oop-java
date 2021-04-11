package com.company;

public class PerahuMotor extends Kapal {

    public PerahuMotor(int id, String nama, int tahun, String lokasi, String status) {
        this.id = id;
        this.nama = nama;
        this.tahun = tahun;
        this.lokasi = lokasi;
        this.status = status;
    }

    @Override
    String getStatus() {
        return "nama kapal : " + nama + "\ntahun : " + tahun + "\nstatus : " + status + "\nlokasi : " + lokasi;
    }

    @Override
    String getTipe() {
        return "Tipe : Perahu Motor";
    }
}
