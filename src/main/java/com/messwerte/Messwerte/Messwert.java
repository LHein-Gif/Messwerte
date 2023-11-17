package com.messwerte.Messwerte;

public class Messwert {
    private int geschwindigkeit;
    private int drehzahl;
    private int kmStand;
    private double tankfuellstand;
    private double motorTemperatur;
    private double oeldruck;
    private double spritVerbrauch;
    private double ladedruck;
    private String fahrgestellnummer;
    private String name;

    Messwert(int geschwindigkeit, int drehzahl, int kmStand, double tankfuellstand, double motorTemperatur, double oeldruck, double spritVerbrauch, double ladedruck, String fahrgestellnummer, String name) {
        this.geschwindigkeit = geschwindigkeit;
        this.drehzahl = drehzahl;
        this.kmStand = kmStand;
        this.tankfuellstand = tankfuellstand;
        this.motorTemperatur = motorTemperatur;
        this.oeldruck = oeldruck;
        this.spritVerbrauch = spritVerbrauch;
        this.ladedruck = ladedruck;
        this.fahrgestellnummer = fahrgestellnummer;
        this.name = name;
    }

    public int getGeschwindigkeit(){
        return geschwindigkeit;
    }

    public int getDrehzahl(){
        return drehzahl;
    }

    public int getKmStand(){
        return kmStand;
    }

    public double getTankfuellstand(){
        return tankfuellstand;
    }

    public double getMotorTemperatur(){
        return motorTemperatur;
    }

    public double getOeldruck(){
        return oeldruck;
    }

    public double getSpritVerbrauch() {
        return spritVerbrauch;
    }

    public double getLadedruck() {
        return ladedruck;
    }

    public String getFahrgestellnummer(){
        return fahrgestellnummer;
    }

    public String getName(){
        return name;
    }
}
