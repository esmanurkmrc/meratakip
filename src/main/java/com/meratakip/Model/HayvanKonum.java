package com.meratakip.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HayvanKonum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int markerId;
    private String hayvanAdi;
    private String bolge;

    private int x;
    private int y;

    private LocalDateTime zaman;

    public Long getId() {
        return id;
    }

    public int getMarkerId() {
        return markerId;
    }

    public void setMarkerId(int markerId) {
        this.markerId = markerId;
    }

    public String getHayvanAdi() {
        return hayvanAdi;
    }

    public void setHayvanAdi(String hayvanAdi) {
        this.hayvanAdi = hayvanAdi;
    }

    public String getBolge() {
        return bolge;
    }

    public void setBolge(String bolge) {
        this.bolge = bolge;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public LocalDateTime getZaman() {
        return zaman;
    }

    public void setZaman(LocalDateTime zaman) {
        this.zaman = zaman;
    }
}