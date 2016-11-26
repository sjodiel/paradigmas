/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista04.exe03;

import java.text.DecimalFormat;

/**
 *
 * @author sjodiel
 */
public class Aviao {

    private Assento[][] reservas;
    private int fila;
    private int poltrona;
    private String letraPoltrona[] = {"A", "B", "C", "D", "E", "F"};

    public Aviao() {
    }

    public Aviao(/*Assento[][] reservas,*/int fila, int poltrona) {

        Assento assento = new Assento(0);
        reservas = new Assento[fila][poltrona];

        //this.reservas = reservas;
        this.fila = fila;
        this.poltrona = poltrona;

        for (int i = 0; i < this.fila; i++) {
            for (int j = 0; j < this.poltrona; j++) {
                reservas[i][j] = assento;
            }
        }

    }

    public String reservar(Assento assento) {

        String aviso = "Ja reservado";
        int fila = assento.getFila();
        int poltrona = assento.getPoltrona();

        for (int i = 0; i < this.getFila(); i++) {
            for (int j = 0; j < this.getPoltrona(); j++) {
                if (getReservas()[fila][poltrona].getFlag() == 0) {
                    aviso = "Reservado com sucesso";
                    assento.setFlag(1);
                    getReservas()[fila][poltrona] = assento;
                    return aviso;
                } else {
                    return aviso;
                }
            }
        }
        return aviso;

    }

    public int convertLetra(String poltrona) {
        int aviso = 0;

        for (int i = 0; i < getLetraPoltrona().length; i++) {
            if (getLetraPoltrona()[i].equalsIgnoreCase(poltrona)) {
                aviso = i;
                return aviso;
            }
        }
        return aviso;
    }

    public String convertNumero(int numero) {
        String aviso = "";

        for (int i = 0; i < getLetraPoltrona().length; i++) {
            if (i == numero) {
                aviso = getLetraPoltrona()[i];
                return aviso;
            }
        }
        return aviso;
    }

    /**
     * @return the reservas
     */
    public Assento[][] getReservas() {
        return reservas;
    }

    /**
     * @param reservas the reservas to set
     */
    public void setReservas(Assento[][] reservas) {
        this.reservas = reservas;
    }

    /**
     * @return the fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * @return the poltrona
     */
    public int getPoltrona() {
        return poltrona;
    }

    /**
     * @param poltrona the poltrona to set
     */
    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public void exibeReservas() {

        DecimalFormat format = new DecimalFormat("00");
        String aviso = "-";
        System.out.print("     A|B|C|D|E|F|");
        
        for (int i = 0; i < this.fila; i++) {

            System.out.print("\n" + format.format(i) + " = ");

            for (int j = 0; j < this.poltrona; j++) {

                if (reservas[i][j].getFlag() == 0) {
                    System.out.print(aviso + "|");
                } else {
                    System.out.print("X" + "|");
                }

            }
        }

    }

    /**
     * @return the letraPoltrona
     */
    public String[] getLetraPoltrona() {
        return letraPoltrona;
    }

    /**
     * @param letraPoltrona the letraPoltrona to set
     */
    public void setLetraPoltrona(String[] letraPoltrona) {
        this.letraPoltrona = letraPoltrona;
    }

}
