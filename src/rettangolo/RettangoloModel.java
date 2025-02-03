/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rettangolo;

/**
 *
 * @author mdt
 */
// MODEL - Logica del rettangolo
class RettangoloModel {
    private double base;
    private double altezza;

    public RettangoloModel(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getArea() {
        return base * altezza;
    }

    public double getPerimetro() {
        return 2 * (base + altezza);
    }

    public double getDiagonale() {
        return Math.sqrt(base * base + altezza * altezza);
    }
}

