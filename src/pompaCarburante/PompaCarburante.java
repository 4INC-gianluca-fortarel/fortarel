/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pompaCarburante;

/**
 *
 * @author gianluca.fortarel
 */
public class PompaCarburante {

    private String nomeDistributore;
    private double prezzoCarburante;
    private double capacitàCisterna;
    private double carburanteVenduto;

    public PompaCarburante(String nomeDistributore, double prezzoCarburante, double capacitaCisterna) {
        this.nomeDistributore = nomeDistributore;
        this.prezzoCarburante = prezzoCarburante;
        this.capacitàCisterna = capacitaCisterna;
        carburanteVenduto = 0.0;
    }

    public double getCapacitàCisterna() {
        return capacitàCisterna;
    }

    public void setCapacitàCisterna(double capacitàCisterna) {
        this.capacitàCisterna = capacitàCisterna;
    }

    public double getCarburanteVenduto() {
        return carburanteVenduto;
    }

    public void setCarburanteVenduto(double carburanteVenduto) {
        this.carburanteVenduto = carburanteVenduto;
    }

    public String getNomeDistributore() {
        return nomeDistributore;
    }

    public void setNomeDistributore(String nomeDistributore) {
        this.nomeDistributore = nomeDistributore;
    }

    public double getPrezzoCarburante() {
        return prezzoCarburante;
    }

    public void setPrezzoCarburante(double prezzoCarburante) {
        this.prezzoCarburante = prezzoCarburante;
    }

    public double riempimentoCisterna() {
        return capacitàCisterna - carburanteVenduto;
    }

    public double carburanteRimasto() {
        return capacitàCisterna - carburanteVenduto;
    }

    public double calcolaValoreRim() {
        return riempimentoCisterna()* prezzoCarburante;
    }

    public double calcolaImportoPieno() {
        return capacitàCisterna * prezzoCarburante;
    }

    public double calcolaCosto(double litri) {
        return litri * prezzoCarburante;
    }

}
