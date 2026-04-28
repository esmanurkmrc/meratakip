package com.meratakip.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class SensorData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double sicaklik;
    private double nem;

    private boolean hareket;

    private boolean bolgeA;
    private boolean bolgeB;
    private boolean bolgeC;

    private LocalDateTime zaman;

   
    public SensorData() {
    }

    public SensorData(double sicaklik, double nem, boolean hareket,
                      boolean bolgeA, boolean bolgeB, boolean bolgeC,
                      LocalDateTime zaman) {
        this.sicaklik = sicaklik;
        this.nem = nem;
        this.hareket = hareket;
        this.bolgeA = bolgeA;
        this.bolgeB = bolgeB;
        this.bolgeC = bolgeC;
        this.zaman = zaman;
    }

    

    public Long getId() {
        return id;
    }

    public double getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(double sicaklik) {
        this.sicaklik = sicaklik;
    }

    public double getNem() {
        return nem;
    }

    public void setNem(double nem) {
        this.nem = nem;
    }

    public boolean isHareket() {
        return hareket;
    }

    public void setHareket(boolean hareket) {
        this.hareket = hareket;
    }

    public boolean isBolgeA() {
        return bolgeA;
    }

    public void setBolgeA(boolean bolgeA) {
        this.bolgeA = bolgeA;
    }

    public boolean isBolgeB() {
        return bolgeB;
    }

    public void setBolgeB(boolean bolgeB) {
        this.bolgeB = bolgeB;
    }

    public boolean isBolgeC() {
        return bolgeC;
    }

    public void setBolgeC(boolean bolgeC) {
        this.bolgeC = bolgeC;
    }

    public LocalDateTime getZaman() {
        return zaman;
    }

    public void setZaman(LocalDateTime zaman) {
        this.zaman = zaman;
    }
}