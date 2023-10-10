/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productos;

/**
 *
 * @author mmaye
 */
import javax.swing.JOptionPane;
public class Productos {
//Clase Padre o superClase
//La cual tine lote y fecha de caducidad
   
    //Atributos privados
    private String nombre;
    private String fechaCaducidad;
    private String numeroLote;
    
    //Constructor
    public Productos(String fechaCaducidad, String numeroLote, String nombre){
       this.fechaCaducidad= fechaCaducidad; 
       this.numeroLote= numeroLote;
       this.nombre= nombre;
    }
    
    
    // Get
    public String getFechaCaducidad(){
        return fechaCaducidad;
    }
    public String getNumeroLote(){
        return numeroLote;
    }
    public String getNombre(){
        return nombre;
    }
    //Mostrar informacion
    public void mostrarInformacion(){
        
        JOptionPane.showMessageDialog(null,"Informacion del producto: \n" + "Nombre: " + nombre + "\nFecha de Caducidad: " + fechaCaducidad + "\nNúmero de Lote: " + numeroLote);
    }
    
    
    
}
