/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pablomingolla.tarea4pablomingollamartinez;

/**
 *
 * @author ismae
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tarea a= new Tarea();
        Tarea b= new Tarea(15.5, true, 5);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
    
}
