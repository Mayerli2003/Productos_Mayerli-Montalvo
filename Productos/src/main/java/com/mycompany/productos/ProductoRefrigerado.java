/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productos;

/**
 *
 * @author mmaye
 */
import javax.swing.JOptionPane;

public class ProductoRefrigerado extends Productos {
    private String codigoSupervision;
    
  //Constructor
    public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String nombre, String codigoSupervision){
        super( fechaCaducidad, numeroLote, nombre);
        this.codigoSupervision= codigoSupervision;
    }
   
  //Get 
    public String getCodigoSupervision(){
        return codigoSupervision;
    }
    
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        JOptionPane.showMessageDialog(null, "Codigo de supervision: "+ codigoSupervision);
    }
    
    
}
