package com.company;

public class Main {

    public static void main(String[] args) {
        PerahuMotor pm1 = new PerahuMotor(1, "Perahu Motor KNJRN", 2019, "A2", "Bagus");
        PerahuLayar pl1 = new PerahuLayar(2, "Perahu Layar MLYSR", 2020, "A3", "Bagus");
        KapalPesiar kp1 = new KapalPesiar(3, "Perahu Motor TMB", 2009, "A4", "Kurang Bagus");

        System.out.println(pm1.getTipe() + "\n" + pm1.getStatus());
        System.out.println(pl1.getTipe() + "\n" + pl1.getStatus());
        System.out.println(kp1.getTipe() + "\n" + kp1.getStatus());
    }
}
