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
public class testHerencia2 {
    public static void main(String[] args) {
        //Instancias de clases 
       
        
       
        
        
        int opcion;
        String menu;
        do{
            JOptionPane.showMessageDialog(null,"---------Bienvenido al programa de interacción con el usuario--------- \n" +"Alumna: Mayerli Azucena Montalvo Martinez \n");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
            
            //
            menu=JOptionPane.showInputDialog( 
                
                "\n 1- Agregar un producto fresco" +
                "\n 2- Agregar un producto refrigerado" +
                "\n 3- Agregar un producto congelado" +
                "\n 4- Salir"+
                "\n * Seleccione una opcion"
            );
            opcion= Integer.parseInt(menu);
            
            
            switch(opcion){ 
            
                case 1:
                    JOptionPane.showMessageDialog(null, "Opcion 1 - Producto fresco ");
                    
                    
                    String fechaEnvasado = JOptionPane.showInputDialog("Ingrese la fecha de embasado: ");
                    String paisOrigen = JOptionPane.showInputDialog("Ingrese el pais de origen: ");
                    
                    ProductoFresco productofresco= new ProductoFresco("01/10/2024", "123SDRG1", nombre, fechaEnvasado,paisOrigen);
                    
                    
                    productofresco.mostrarInformacion();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Opcion 2 - Producto refrigerado ");
                    
                    
                    String codigoSupervision = JOptionPane.showInputDialog("Ingrese el codigo de embasado: ");
          
                    ProductoRefrigerado productoRefrigerado= new ProductoRefrigerado("02/11/2024", "123SDRG2", nombre, codigoSupervision);
                    
                    
                    productoRefrigerado.mostrarInformacion();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Opcion 3 - Producto congelado");
                    
                    String temperaturaCongelacion_String;
                    temperaturaCongelacion_String= JOptionPane.showInputDialog("Ingrese la temperatura de congelacion: ");
                    //Convertir
                    Double temperaturaCongelacion= Double.parseDouble(temperaturaCongelacion_String);
                    
                    ProductoCongelado productoCongelado= new ProductoCongelado("03/12/2024", "123SDRG3", nombre, temperaturaCongelacion);
                    
                    
                    
                    productoCongelado.mostrarInformacion();
                    
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa ... ");
                    break;
                   
               
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                    break;
            }
        } while(opcion != 4);
    }
    
}
