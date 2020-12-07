/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pablomingolla.tarea4pablomingollamartinez;

/**
 *
 * @author Pablo Mingolla
 */
public class Tarea {
    double peso;
    boolean listado;
    int contador;

    public Tarea(double peso, boolean listado, int contador) {
        this.peso = peso;
        this.listado = listado;
        this.contador = contador;
    }

    public Tarea() {
        this.peso = 0;
        this.listado = true;
        this.contador = 0;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isListado() {
        return listado;
    }

    public int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        return "Tarea{" + "peso=" + peso + ", listado=" + listado + ", contador=" + contador + '}';
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setListado(boolean listado) {
        this.listado = listado;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    
    
    
}
