package com.company;

abstract class Kapal {

    protected int id;
    protected String nama;
    protected int tahun;
    protected String lokasi; // Dock : A1, A2, B1, B2
    protected String status; //Bagus, Buruk

    abstract String getStatus();
    abstract String getTipe();
}
