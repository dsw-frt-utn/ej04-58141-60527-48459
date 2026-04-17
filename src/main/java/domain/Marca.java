/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author tomas
 */
public class Marca {
    private String nombre;
    private String Pais;

    public Marca(String nombre) {
        this.nombre = nombre;
    }

    public Marca(String nombre, String Pais) {
        this.nombre = nombre;
        this.Pais = Pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
}
