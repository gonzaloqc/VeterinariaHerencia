
package veterinariaherencia;

/**
 *
 * @author utku30
 */
public class Perro extends Animal  {
    // Caracteristicas
    final static int PATAS = 4;
    
    // Comportamientos
    public Perro (String raza, String color, String nombre) {
        super(raza, color, nombre);
    }
    
    public Perro (String raza, String color) {
    super(raza,color);
    }

    public void Ladrar () {
        System.out.println("Guuaauu!!!");
    }
      
        public void EmitirSonido(){
           Ladrar();
     }
    
}