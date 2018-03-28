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
public class Gato extends Animal{
    // Caracteristicas
    final static int PATAS = 4;
    
    // Comportamientos
    public Gato (String raza, String color, String nombre) {
        super(raza, color, nombre);
    }
    
    public Gato (String raza, String color) {
        super(raza,color);
    }

    public void Maullar () {
        System.out.println("Miaauu");
    }
    
      public void Ronrronear () {
        System.out.println("GroummGrouumm");
    }
      
    public void EmitirSonido(){
           Maullar();
     }
      
     @Override
    public String toString(){
        return "-GATO- "+ super.toString();
        
        }
}
