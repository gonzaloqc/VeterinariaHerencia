/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariaherencia;

/**
 *
 * @author utku27
 */
public abstract class Hogar {
    //Caracteristicas
    private final Material material;
    private boolean ocupado;
    private String dueno;
    private final Tamano tamano;
    private Color color;
    private String origen;
    boolean limpio;

    
    
 //Comportamientos
    public Hogar (Material material,  Tamano tamano, Color color, boolean ocupado,
            String dueno, boolean limpio) {
        this.dueno = dueno;
        this.material = material;
        this.color=color;
        this.ocupado = ocupado;
        this.tamano = tamano;
        this.limpio = limpio;
    }
    
    public void Desocupar(){
        if (ocupado){
            ocupado = false;
         System.out.println("Se desocupo");   
        }
        else {
         System.out.println("Ya esta desocupado");
        }
     }
    
    public void Ocupar(){
        if (ocupado){
            ocupado = true;
        System.out.println("Se ocupo"); 
        }
    }
    
    public abstract void Limpiar();
    
    public void RealizarLimpieza(boolean limpio){
        if (limpio){
            System.out.println("Ya esta limpia");
        } else {
            if (ocupado){
                Desocupar();
                Limpiar();
                Ocupar();
            }else{
                Limpiar();
            }
        }
    }
    
        
      @Override
    public String toString(){
        String inicio = "Material: " + material + " - Tamano: " + tamano + " - Color: " + color;
        return inicio;
    }
    
}   
/* Agregar en la Clase Hogar el metodo Limpiar()
*
*- La Cucha se limpia directamente
*- La Jaula requiere quitar accesorios y volver a colocarlos
*- La Pecera requiere vaciado, 
*quitar los accesorios y luego volver a colocar los accsorios y llenarla
   
 */    
