/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productos;

import javax.swing.JOptionPane;

/**
 *
 * @author mmaye
 */
public class ProductoCongelado extends Productos {
    public double temperaturaCongelacion;
    
    //Constructor
    public ProductoCongelado(String fechaCaducidad, String numeroLote, String nombre, double temperaturaCongelacion ){
        super(fechaCaducidad, numeroLote, nombre);
        this.temperaturaCongelacion= temperaturaCongelacion;
    }
    
    //get
    public double getTemperaturaCongelacion(){
        return temperaturaCongelacion;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        JOptionPane.showMessageDialog(null, "Temperatura de congelacion: "+ temperaturaCongelacion +"°C");
    }
    
}
