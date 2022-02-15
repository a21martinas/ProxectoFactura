/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectofactura;

/**
 * Datos de unha factura nova
 * @author marti
 */
public class ArtigoFactura {
    
    private String id;

    private String descripcion;

    private int cantidade;

    private double prezoUnitario;

    public ArtigoFactura(String id, String descripcion, int cantidade, double prezoUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidade = cantidade;
        this.prezoUnitario = prezoUnitario;
    }

    /**
     * Get the value of prezoUnitario
     *
     * @return the value of prezoUnitario
     */
    public double getPrezoUnitario() {
        return prezoUnitario;
    }

    /**
     * Set the value of prezoUnitario
     *
     * @param prezoUnitario new value of prezoUnitario
     */
    public void setPrezoUnitario(double prezoUnitario) {
        this.prezoUnitario = prezoUnitario;
    }

    /**
     * Get the value of cantidade
     *
     * @return the value of cantidade
     */
    public int getCantidade() {
        return cantidade;
    }

    /**
     * Set the value of cantidade
     *
     * @param cantidade new value of cantidade
     */
    public void setCantidade(int cantidade) {
        this.cantidade = cantidade;
    }

    /**
     * Get the value of descripcion
     *
     * @return the value of descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Set the value of descripcion
     *
     * @param descripcion new value of descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ArtigoFactura{" + "id=" + id + ", descripcion=" + descripcion + ", cantidade=" + cantidade + ", prezoUnitario=" + prezoUnitario + '}';
    }
    
    public  double obterPrezoTotal(){
        return this.prezoUnitario*this.cantidade;
    }
}
