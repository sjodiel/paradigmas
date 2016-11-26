/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.deinf.lista04.exe03;

/**
 *
 * @author sjodiel
 */
public class Assento {
    
    private int flag;
    private int fila;
    private int poltrona;

    public Assento() {
    }

    public Assento(int flag) {
        this.flag = flag;
    }
    
    public Assento(int flag, int fila, int poltrona) {
        this.flag = flag;
        this.fila = fila;
        this.poltrona = poltrona;
    }
    
    /**
     * @return the flag
     */
    public int getFlag() {
        return flag;
    }

    /**
     * @param flag the flag to set
     */
    public void setFlag(int flag) {
        this.flag = flag;
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

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
