/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariaherencia;

/**
 *
 * @author utku30
 */
public class Plato extends Accesorios{
   
    
    private final Tamano tamano;
    


public Plato (Material material, String origen, Color color, Float precio, Tamano tamano){
  super(material,origen, color, precio);
  this.tamano=tamano;
}

    /**
     * @return the tamano
     */
    public Tamano getTamano() {
        return tamano;
    }
}
