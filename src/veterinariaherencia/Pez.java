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
public class Pez extends Animal {
    //Caracteristicas
    private final boolean deRio;
    private final int temperatura;

    //Comportamientos
    
    public Pez (String raza, String color, String nombre, boolean deRio, int temperatura){
    super(raza,color,nombre);
    this.temperatura = temperatura;
    this.deRio = deRio;
    
}
    public Pez (String raza, String color, boolean deRio, int temperatura){
    super(raza,color);
    this.temperatura = temperatura;
    this.deRio = deRio;
}
    
     public void EmitirSonido(){
           System.out.println("Los peces no emiten sonidos");
     }
    
}
