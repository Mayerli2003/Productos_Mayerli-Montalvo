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

public class ProductoFresco extends Productos {
    private String fechaEnvasado;
    private String paisOrigen;
    
    //Constructor
    public ProductoFresco(String fechaCaducidad, String numeroLote, String nombre, String fechaEnvasado, String paisOrigen) {
        super( fechaCaducidad, numeroLote, nombre);
        this.fechaEnvasado= fechaEnvasado;
        this.paisOrigen= paisOrigen;
    }
    //Get
    public String  getFechaEnvasado(){
       return fechaEnvasado;
    }
    
    public String getPaisOrigen(){
      return paisOrigen; 
        
    }
   @Override
   public void mostrarInformacion(){
       super.mostrarInformacion();
       
       JOptionPane.showMessageDialog(null, "Fecha de envasado: "+ fechaEnvasado + "\nPais de origen: "+ paisOrigen);
   }
   
}
