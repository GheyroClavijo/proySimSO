/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author clavi
 */
public class Recurso {

    private String rec;
    private String proc;
    private boolean ocu;

    public Recurso() {
        this.rec = "";
        this.proc = "";
        this.ocu = false;
    }

    public Recurso(String rec, String proc, boolean ocu) {
        this.rec = rec;
        this.proc = proc;
        this.ocu = ocu;
    }

    public String getRec() {
        return rec;
    }

    public void setRec(String rec) {
        this.rec = rec;
    }

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public boolean isOcu() {
        return ocu;
    }

    public void setOcu(boolean ocu) {
        this.ocu = ocu;
    }

    @Override
    public String toString() {
        return "Recurso\n"
                + "Recurso: " + rec + "\n"
                + "Proceso: " + proc + "\n"
                + "Ocupado: " + ocu;
    }
}
