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
public class Cucha extends Hogar {

    //Caracteristicas
    public Cucha (Material material,Tamano tamano,Color color, boolean ocupado,
            String dueno,boolean limpio) {
        super(material,tamano,color,ocupado,dueno,limpio);
    }   
    
    public void Limpiar(){
      Aspirar();  
      limpio = true;
      System.out.println("La cucha esta limpia");
    }

   public void Aspirar(){
      System.out.println("Se aspiro la cucha");
    }
            
}

