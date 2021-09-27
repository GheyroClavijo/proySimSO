/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author clavi
 */
public class Proceso {

    private String id;
    private String nom;
    private int tam;
    private int hil;
    private int rec;

    public Proceso() {
        this.id = "";
        this.nom = "";
        this.tam = 0;
        this.hil = 0;
        this.rec = 0;
    }

    public Proceso(String id, String nom, int tam, int hil, int rec) {
        this.id = id;
        this.nom = nom;
        this.tam = tam;
        this.hil = hil;
        this.rec = rec;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getHil() {
        return hil;
    }

    public void setHil(int hil) {
        this.hil = hil;
    }

    public int getRec() {
        return rec;
    }

    public void setRec(int rec) {
        this.rec = rec;
    }

    @Override
    public String toString() {
        return "Proceso\n"
                + "ID: " + id + "\n"
                + "Nombre: " + nom + "\n"
                + "Tamaño: " + tam + "\n"
                + "Hilo: " + hil + "\n"
                + "Recurso: " + rec;
    }
}
