/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author juanjoanduquia
 */
public class Taller {

    private String nombre;
    private int cupoDisponible;
    private ArrayList<Inscrito> inscritos;

    public Taller(String nombre, int cupoDisponible, ArrayList<Inscrito> inscritos) {
        this.nombre = nombre;
        this.cupoDisponible = cupoDisponible;
        this.inscritos = inscritos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCupoDisponible() {
        return cupoDisponible;
    }

    public void setCupoDisponible(int cupoDisponible) {
        this.cupoDisponible = cupoDisponible;
    }

    public ArrayList<Inscrito> getInscritos() {
        return inscritos;
    }

    public void setInscritos(ArrayList<Inscrito> inscritos) {
        this.inscritos = inscritos;

    }

    public boolean inscribir(Inscrito inscrito) {
        if (cupoDisponible > 0) {
            inscritos.add(inscrito);
            cupoDisponible--;
            return true;
        } else {
            return false;
        }
    }

    public boolean cancelarInscripcion(String documento) {
        for (Inscrito i : inscritos) {
            if (i.getDocumento().equals(documento)) {
                inscritos.remove(i);
                cupoDisponible++;
                return true;
            }
        }
        return false;
    }

}
